//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal c1 = new Animal("Dog"); // overlaoded Constructor called //
        Animal c2 = new Animal();          // default constructor called //
        System.out.println(c1.counter()); // static method called //
        System.out.println(c2.counter()); // static method called //
        c1.NameOfAnimal();        // instance method called //
        }
    }
