import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    IInput mouse;


    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("Apple", "AA101", "Corded", 1);
        computer = new Computer(8, 512, monitor, mouse);

    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }

    @Test
    public void hasOutputDevice(){
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        IOutput printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputViaSpeaker(){
        IOutput speaker = new Speaker(9001);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: beep!", computer.outputData("beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        IOutput printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canSendDataViaMouse(){
        IInput mouse = new Mouse("Apple", "AA101", "Corded", 1);
        IOutput speaker = new Speaker(9001);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("You have selected: Facetime", computer.sendData("Facetime"));
    }
}
