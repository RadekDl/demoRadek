package cz.radek.demoRadek.controller;

import cz.radek.demoRadek.Model.Crypto;
import cz.radek.demoRadek.Service.Cryptoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    @RequestMapping("cryptos")
    public class CryptoController {

    @Autowired
    private Cryptoservice cryptoservice;

    // přidání do listu crypto
    @PostMapping()
    public ResponseEntity<String> addCrypto(@RequestBody Crypto crypto) {
        cryptoservice.addCrypto(crypto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Crypto added successfully");
    }
    // Získání všech kryptoměn
    @GetMapping
    public List<Crypto> getCryptoList(@RequestParam(required = false) String sort) {
        if ("price".equalsIgnoreCase(sort)) {
            return cryptoservice.sortingPrice();
        } else if ("name".equalsIgnoreCase(sort)) {
            return cryptoservice.sortingName();
        } else if ("quantity".equalsIgnoreCase(sort)) {
            return cryptoservice.sortingQuantity();
        } else {
            // Pokud není "sort",neřazený seznam
            return cryptoservice.getCryptoList();
        }
    }
    // Získání detailu kryptoměny podle ID
    @GetMapping("/{id}")
    public ResponseEntity<Crypto> informationById(@PathVariable int id) {
        Crypto crypto = cryptoservice.informationById(id);
        if (crypto != null) {
            return ResponseEntity.ok(crypto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}


