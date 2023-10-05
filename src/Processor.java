public class Processor {
    //States, attributes, property
    public String brand;
    public String model;
    public Double price;

    //Comportamiento o método (funciones)
    // public (+) método accesible desde cualquier otra clase
    // String: tipo devuelto por el método
    public String getFullname(){
        //Concatenar cadenas con +
        //AMD 7600 32.2
        return brand + model + price;
    }

    public String getBrand(){
        return brand;
    }
    public Double getPrice(){
    return price;
    }