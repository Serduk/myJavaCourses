package fain.first;

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep() {
        System.out.println("Good Night! See tommorow!");
    }

    public void eat() {
        System.out.println("I'm very hungry! Give me a chiips");
    }

    public String say(String aWord) {
        String petResponse = "Okay " + aWord;
        return petResponse;
    }
}