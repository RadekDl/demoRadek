package cz.radek.demoRadek.Model;



public class Crypto implements Comparable<Crypto> {

    private Integer id;
    private String name;
    private String symbol;
    private Double price;
    private Double quantity;

    public  Crypto(Integer id,String name,String symbol,Double price,Double quantity){
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Crypto o) {
        return name.compareTo(o.name);
    }
}