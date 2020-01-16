package lt.sdacademy.advancedfeatures.yieldVoice_Inheritance;

public class Dog extends Animal{
   // private String dogVoice;

    public Dog (int weight, int height){
        super(weight, height);
        //this.dogVoice = dogVoice;
    }

    public String getDogVoice() {
        return "gav gav";
    }
}
