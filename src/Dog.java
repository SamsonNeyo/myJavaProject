public class Dog extends Animal{
    private String color;
    private double weight;

    public Dog(String color){
        this.color=color;
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getWeight() {
        return (int) weight;
    }

    @Override
    public void animalTalk() {
        System.out.println("The "+color+" dog goes bark!!!");
    }
}
