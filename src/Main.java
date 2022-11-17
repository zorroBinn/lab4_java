public class Main {
    public static void main(String[] args) {

        System.out.println("Тест массива объектов");
        Clothes[] clothes = new Clothes[3];
        for (int i = 0; i<3; i++) {
            clothes[i] = new Clothes();
            clothes[i].Read();
        }
        for (int i = 0; i<3; i++) {
            clothes[i].Display();
        }

        Human human = new Human();
        human.Read();
        human.Display();
        System.out.println("Всего сетов одежды: " + Clothes.Getcount());

        MedicalCard medicalcard = new MedicalCard();
        medicalcard.Read(human);
        medicalcard.Display();

        System.out.println("Тест двумерного массива объектов");
        Work[][] work = new Work[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                work[i][j] = new Work();
                work[i][j].Read(human);
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                work[i][j].Display();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                work[i][j].Working(human);
            }
        }
        System.out.println("Текущий баланс: " + human.MoneyBalance);

    }
}