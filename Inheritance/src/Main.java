public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog ("Yorkie", 1, 1, 20, 20, 2, 4, 1
                , 20, "Long silky");

        dog.eat();
        //dog.walk();
        dog.run();

    }
}
