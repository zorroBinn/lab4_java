public class Main {
    public static void main(String[] args) {

        System.out.println("Тест");
        Clothes cl = new Clothes(88, "1", "1", "1");
        Clothes clone = cl.clone();
        Human hum = new Human(19, "wa", "sd", clone);
        Human clones = hum.clone();
        System.out.println(clone.toString());
        System.out.println(clones.toString());

    }
}