package device_management;

import behaviours.IInput;

public class Mouse extends Accessories implements IInput {

    private int numButtons;

    public Mouse(String make, String model, String type, int numButtons) {
        super(make, model, type);
        this.numButtons = numButtons;
    }

    public String move(){
        return "weeeeee!";
    }

    public String click(String button){
        return "You have selected: " + button;
    }

    public String sendData(String data) {
        return this.click(data);
    }
}
