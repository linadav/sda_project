package lt.sdacademy.advancedfeatures.yieldVoice_Inheritance;

//https://www.java-made-easy.com/java-inheritance.html
public class Animal {
    private int weight;
    private int height;
    public Animal (int weight, int height) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
