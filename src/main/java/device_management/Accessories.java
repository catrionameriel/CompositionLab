package device_management;

public abstract class Accessories {
    private String make;
    private String model;
    private String type;

    public Accessories(String make, String model, String type){
        this.make = make;
        this.model = model;
        this.type = type;
    }
}
