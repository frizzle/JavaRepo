package lesson2_MainClassWithBehaviour;

public class HelloWorld {
    public static void main (String[] args) {
        Printer.printHelloWorld();

        Printer hw = new Printer();
        hw.printHelloWorld2();
    }
}
