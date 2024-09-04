//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat("Red");
        myCat.animalTalk();
        Animal myDog = new Dog("Black");
        myDog.animalTalk();
    }
}