package Polymorphism;

class Printer {
    public void print(String message) {
        System.out.println("String message: " + message);
    }

    public void print(int number) {
        System.out.println("Integer number: " + number);
    }

    public void print(double value) {
        System.out.println("Double value: " + value);
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello Ravi"); // Calls print(String message)
        printer.print(18);           // Calls print(int number)
        printer.print(0.7);          // Calls print(double value)
    }
}
