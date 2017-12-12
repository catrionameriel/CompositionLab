package device_management;

import behaviours.IInput;

public class Keyboard extends Accessories implements IInput {

    private int size;


    public Keyboard(String make, String model, String type, int size) {
        super(make, model, type);
        this.size = size;
    }

    public String sendData(String data) {
        return this.type(data);
    }

    public String delete(String letters){
        return "You have deleted: " + letters;
    }

    public String type(String words){
        return words;
    }

}
