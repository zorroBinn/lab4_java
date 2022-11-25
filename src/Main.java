public class Main {
    public static void main(String[] args) {

        System.out.println("Тест поверхностного копирования");
        Clothes cl = new Clothes(88, "1", "1", "1");
        Clothes clone = cl.clone();
        System.out.println(clone);
        cl.Read();
        System.out.println(cl);
        System.out.println(clone);

        System.out.println("Тест глубокого копирования");
        Human h1 = new Human(19, "name", "M", cl);
        Human h2 = null;
        h2 = h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        h1.Read();
        System.out.println(h1);
        System.out.println(h2);


    }
}