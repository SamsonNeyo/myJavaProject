public class Cat extends Animal{
    private String color;

    public Cat(String color){
        this.color=color;

    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void animalTalk(){
        System.out.println("The "+color +" cat goes Meow!!!");
    }

}
