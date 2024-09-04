public class Animal {
    private String breed;
    private int weight;


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void animalTalk() {
        System.out.println("The animal Cry!");
    }
}
