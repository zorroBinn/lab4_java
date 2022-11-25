public class Main {
    public static void main(String[] args) {

        System.out.println("Тест глубокого копирования");
        Clothes cl = new Clothes(88, "1", "1", "1");
        Clothes clone = new Clothes();
        System.out.println(cl);
        System.out.println(clone);
        clone = cl.clone();
        System.out.println(cl);
        System.out.println(clone);
        cl.Read();
        System.out.println(cl);
        System.out.println(clone);

        Human h1 = new Human(19, "name", "M", cl);

        System.out.println("Тест поверхностного копирования");
        Realty r1 = new Realty(h1, "house", "car");
        Realty r2 = new Realty();
        System.out.println(r1);
        System.out.println(r2);
        r2 = r1.clone();
        System.out.println(r1);
        System.out.println(r2);
        r2.Read(h1);
        System.out.println(r1);
        System.out.println(r2);

    }
}