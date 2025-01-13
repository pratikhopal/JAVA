//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        Animal dog2 = new Animal("tommy","labrador");
        Animal dog3 = new Animal("rocky");
        dog2.displayInfo();
        dog1.displayInfo();
        dog3.displayInfo();
    }
}