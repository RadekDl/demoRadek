package cz.radek.demoRadek.controller;

import cz.radek.demoRadek.Model.Crypto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping ("api/list")
public class CryptoController {

    private  List<Crypto> cryptoList = new ArrayList<>();

    @GetMapping
    public List<Crypto> getCryptoList() {
        return cryptoList;
    }
    @GetMapping("/size")
    public int getCryptoListSize(){
        return cryptoList.size();
    }
    // přidání do listu crypto
    @PostMapping("/add")
    public ResponseEntity<String> addCrypto(@RequestBody Crypto crypto){
        cryptoList.add(crypto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Crypto added successfully");
    }


    @GetMapping("/price")
    public void sortingPrice() {
        // Seřazení crypta cena
        cryptoList.sort(Comparator.comparing(Crypto::getPrice));

    }
    @GetMapping("/quantity")
    public void sortingQuantity() {
        // Seřazení crypta počet jednotek
        cryptoList.sort(Comparator.comparing(Crypto::getQuantity));

    }
    @GetMapping("/listing")
    public void listing(){
        System.out.println("výpis všech crypto v listu\n ");
        for (int i = 0; i < getCryptoList().size(); i++) {
            System.out.println(cryptoList.get(i).getName()+" symbol "+cryptoList.get(i).getSymbol()+" cena "+
                    cryptoList.get(i).getPrice()+" počet jednotek "+ cryptoList.get(i).getQuantity());
        }
    }
}
