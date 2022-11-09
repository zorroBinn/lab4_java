public class Main {
    public static void main(String[] args) {
        System.out.println("Тест класса одежда: ");
        Clothes clothes = new Clothes();
        clothes.Read();
        clothes.Display();
        clothes.TearClothes();
        clothes.Display();
        clothes.SewUpClothes();
        clothes.Display();

        System.out.println("Тест класса человек: ");
        Human human = new Human(20, "Ivan", "male", clothes);
        human.Display();
        human.Read();
        human.Display();

        System.out.println("Тест класса медкарта: ");
        MedicalCard medicalcard = new MedicalCard(human, 78, 182, "Good");
        medicalcard.Display();
        medicalcard.Read(human);
        medicalcard.Display();
        medicalcard.BodyMassIndex();
        medicalcard.SetHealthStatus();
        medicalcard.Display();

        System.out.println("Тест класса Работа: ");
        Work work = new Work(human, "Stuff", 11111);
        work.Display();
        work.Working(human);
        human.NameBalanceDisplay();
        work.Read(human);
        work.Display();
        work.Working(human);
        human.NameBalanceDisplay();

        System.out.println("Тест класса имущество: ");
        Realty realty = new Realty(human, "Box", "nope");
        realty.Display();
        realty.Read(human);
        realty.Display();
        System.out.println("Активирован чит на деньги (+100 000 000)");
        human.MoneyBalance += 100000000;
        realty.BuyNew(human);
        human.NameBalanceDisplay();
        realty.Display();
    }
}