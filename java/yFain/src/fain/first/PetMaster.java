package fain.first;

public class PetMaster {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        Fish myFish = new Fish(1);

        String petReaction;

        myPet.eat();
        petReaction = myPet.say("Chick! Chick!");
        System.out.println(petReaction);
        myPet.sleep();

        myFish.dive(98);
        myFish.dive(3);
        myFish.dive(1);
        myFish.sleep();
        myFish.say("Hello");

    }
}
