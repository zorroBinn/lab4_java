public class Main {
    public static void main(String[] args) {

        System.out.println("Тест массива объектов, статической переменной и статического метода: ");
        Clothes[] clothes = new Clothes[3];
        for (int i = 0; i<3; i++) {
            clothes[i] = new Clothes();
            clothes[i].Read();
        }
        System.out.println("Всего комплектов одежды (Тест статической функции): " + Clothes.Getcount());
        for (int i = 0; i<3; i++) {
            clothes[i].Display();
        }

        Human human = new Human(19, "Иван", "М", clothes[1]);
        human.Display();
        Rezult rez = new Rezult();
        System.out.println("Тест класса медкарта: ");
        MedicalCard medicalcard = new MedicalCard(human, 78, 182, "Good");
        medicalcard.Display();
        medicalcard.Read(human);
        medicalcard.Display();
        medicalcard.BodyMassIndex(rez);
        System.out.println("ИМТ (возврат значения с использованием вспомогательного класса): " + rez.rez);
        medicalcard.SetHealthStatus();
        medicalcard.Display();




    }
}