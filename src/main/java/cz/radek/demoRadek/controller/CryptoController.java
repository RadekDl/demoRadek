package cz.radek.demoRadek.controller;

import cz.radek.demoRadek.Model.Crypto;
import cz.radek.demoRadek.Service.Cryptoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
//@RequestMapping ("api/list")
@RequestMapping("crypto")
public class CryptoController {

//    private List<Crypto> cryptoList = new ArrayList<>();
//
//
//    @GetMapping
//    public List<Crypto> getCryptoList() {
//        return cryptoList;
//    }
//
//    @GetMapping("/size")
//    public int getCryptoListSize() {
//        cryptoList.sort(Comparator.comparing(Crypto::getName));
//        return cryptoList.size();
//    }
//
//    // přidání do listu crypto
//    @PostMapping("/add")
//    public ResponseEntity<String> addCrypto(@RequestBody Crypto crypto) {
//        cryptoList.add(crypto);
//        return ResponseEntity.status(HttpStatus.CREATED).body("Crypto added successfully");
//    }
//
//
//    @GetMapping("/price")
//    public List<Crypto> sortingPrice() {
//        // Seřazení crypta cena
//        cryptoList.sort(Comparator.comparing(Crypto::getPrice));
//        return cryptoList;
//    }
//
//    @GetMapping("/quantity")
//    public List<Crypto> sortingQuantity() {
//        // Seřazení crypta počet jednotek
//        cryptoList.sort(Comparator.comparing(Crypto::getQuantity));
//        return cryptoList;
//    }
    @Autowired
    private Cryptoservice cryptoservice;


}

