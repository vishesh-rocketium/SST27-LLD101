public class Penguin extends Bird {
    // Penguins cannot fly, so they don't implement FlyingBird
    void swim() {
        System.out.println("Swimming...");
    }
}