public class Animal {
    private String name;
    private String breed;
    Animal(){
        System.out.println("default constructor");
    }
    Animal (String name , String breed){
        this.name=name;
        this.breed=breed;
        System.out.println("parameterized constructor");
    }
    public Animal(String name){
        this.name=name;
        breed="Indie";
        System.out.println("No args passed constructor");
    }
    public void displayInfo(){
        System.out.println("the name of the animal is "+name+
                            " the type of the animal is "+ breed);
    }
}
