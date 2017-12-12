package device_management;

import behaviours.IInput;
import behaviours.IOutput;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;
    private ArrayList<IInput> inputDevices;


    public Computer(int ram, int hddSize, IOutput outputDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevices = new ArrayList<>();

    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

//    public String sendData(String data){
//        return this.inputDevice.sendData(data);
//    }

    public void addInputToComputer(IInput inputDevice){
        this.inputDevices.add(inputDevice);
    }
}
