public class Motherboard {
    //States, attribute, property
    public String brand;
    public String memory;
    public String usbports;
    public Double price;
    public String getFullname(){
        //ASUS ROG STRIX B650E-F GAMING WIFI
        return brand + memory + usbports + price;
    }
    public String getBrand() {
        return brand;
    }
    public String getMemory() {
        return memory;
    }
    public String getUsbPorts(){
        return usbports;
    }
    public Double getPrice(){
        return price;
        }
    }
}