package qlks;

public class Product {
    private int id;
    private String name;
    private float price;
    private  String adddate;
    private byte[] picture ;

    public Product(int id, String name, float price, String adddate, byte[] picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.adddate = adddate;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
            
    
}
