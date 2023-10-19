public class Motherboard {
    //States, attribute, property
    private String brand;
    private String memory;
    private Integer id;
    private Double price;

    private String getFullname() {
        //ASUS ROG STRIX B650E-F GAMING WIFI
        return brand + memory + id + price;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}