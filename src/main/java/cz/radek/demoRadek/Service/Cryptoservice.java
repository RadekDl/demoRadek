package cz.radek.demoRadek.Service;

import cz.radek.demoRadek.Model.Crypto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class Cryptoservice {

    private List<Crypto> cryptoList = new ArrayList<>();

    public void addCrypto(Crypto crypto){
        cryptoList.add(crypto);
    }

        public List<Crypto> getCryptoList(){
        return cryptoList;
    }
    public List<Crypto> sortingName() {
        cryptoList.sort(Comparator.comparing(Crypto::getName));
        return cryptoList;
    }
    public List<Crypto> sortingPrice() {
        cryptoList.sort(Comparator.comparing(Crypto::getPrice));
        return cryptoList;
    }
    public List<Crypto> sortingQuantity() {
        cryptoList.sort(Comparator.comparing(Crypto::getQuantity));
        return cryptoList;
    }
    public Crypto  informationById(int id){
    for (Crypto crypto : cryptoList) {
        if (crypto.getId() == id) {
            return crypto;
        }
    }
    return null;
    }
}
