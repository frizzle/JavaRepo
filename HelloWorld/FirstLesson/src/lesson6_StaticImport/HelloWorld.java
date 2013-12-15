package lesson6_StaticImport;

//Статический импорт - конструкция, позволяющая осуществить короткую запись статического метсода, принадлежащего другому классу.
//Никогда не испльзовать конструкцию статического импорта
import static lesson3_UsingImport.Out.Printer.printHelloWorld;

//Эта строка приводит к ошибке, связанной с повторным использованием одноименного класса Printer
//import lesson2_MainClassWithBehaviour.Printer;

public class HelloWorld {
    public static void main (String[] args) {
        lesson2_MainClassWithBehaviour.Printer.printHelloWorld();
        lesson2_MainClassWithBehaviour.Printer pr2 = new lesson2_MainClassWithBehaviour.Printer();
        pr2.printHelloWorld2();

        printHelloWorld();
//        Printer hw = new Printer();
//        hw.printHelloWorld2();
    }
}
