public class Animal {
    static int count=0; // static variable count //
    String name;
    Animal(){
        count++;
    }
    Animal(String name){      // constructor overlaoding //
        this.name=name;
    }
    public static int counter(){ // static method counter//
        return(count);
    }
    public void NameOfAnimal (){ // instance method //
        System.out.println("The name of the animal is "+ name);
    }
}
