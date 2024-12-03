package app;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобік");
        Dog dogTuzik = new Dog("Тузік");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(150);
        dogBobik.swim(8);

        dogTuzik.run(600);
        dogTuzik.swim(15);

        catMurzik.run(100);
        catMurzik.swim(5);

        catBarsik.run(250);

        System.out.println("\nСтворено собак: " + Dog.getDogCount());
        System.out.println("Створено котів: " + Cat.getCatCount());
    }
}