import java.util.Scanner;

public class Realty implements Reading{ //Класс имущества персонажа
    protected Human human; //Персонаж
    protected String Housing, Vehicle; //недвижимость, ТО

    Realty() {//Конструктор без параметров
        this.human = new Human();
        this.Housing = "";
        this.Vehicle = "";
    }
    Realty(Human human, String housing, String vehicle) {//конструктор с параметрами
        this.human = human;
        this.Housing = housing;
        this.Vehicle = vehicle;
    }
    public void Read(Human human) {//Ввод с клавиатуры
        String strhousing = "Garage", strvehicle = "Bicycle";
        System.out.println("Начальное жильё: " + strhousing);
        System.out.println("Начальное ТС: " + strvehicle);
        this.human = human;
        this.Housing = strhousing;
        this.Vehicle = strvehicle;
    }
    public String toString() {//Вывод на экран
        return "Имущество персонажа " + human.GetName() + "\nЖильё: " + Housing + "\nТС: " + Vehicle;
    }
    public void BuyNew(Human human) { //Метод покупки имущества
        int choice, flag;
        String strbuynew;
        System.out.println("Выберите для покупки: ");
        System.out.println("1 - Квартира(3 000 000р)");
        System.out.println("2 - Коттедж(7 000 000р)");
        System.out.println("3 - Вилла(20 000 000р)");
        System.out.println("4 - Дворец(100 000 000р)");
        System.out.println("5 - Мотоцикл(1 000 000)");
        System.out.println("6 - Автомобиль(2 000 000)");
        Scanner inp = new Scanner(System.in);
        do {
            flag = 0;
            choice = inp.nextInt();
            if (choice != 1) flag++;
            if (choice != 2) flag++;
            if (choice != 3) flag++;
            if (choice != 4) flag++;
            if (choice != 5) flag++;
            if (choice != 6) flag++;
        } while (flag == 6);
        flag = 0;
        switch (choice) {
            case 1: {
                if (human.MoneyBalance > 3000000) {
                    System.out.println("Вы купили квартиру за 3 000 000р");
                    human.MoneyBalance -= 3000000;
                    strbuynew = "Квартира";
                    this.Housing = strbuynew;
                }
                else flag = 1;
                break;
            }
            case 2: {
                if (human.MoneyBalance > 7000000) {
                    System.out.println("Вы купили коттедж за 7 000 000р");
                    human.MoneyBalance -= 7000000;
                    strbuynew = "Коттедж";
                    this.Housing = strbuynew;
                }
                else flag = 1;
                break;
            }
            case 3: {
                if (human.MoneyBalance > 20000000) {
                    System.out.println("Вы купили виллу за 20 000 000р");
                    human.MoneyBalance -= 20000000;
                    strbuynew = "Вилла";
                    this.Housing = strbuynew;
                }
                else flag = 1;
                break;
            }
            case 4: {
                if (human.MoneyBalance > 100000000) {
                    System.out.println("Вы купили дворец за 100 000 000р");
                    human.MoneyBalance -= 100000000;
                    strbuynew = "Дворец";
                    this.Housing = strbuynew;
                }
                else flag = 1;
                break;
            }
            case 5: {
                if (human.MoneyBalance > 1000000) {
                    System.out.println("Вы купили мотоцикл за 1 000 000р");
                    human.MoneyBalance -= 1000000;
                    strbuynew = "Мотоцикл";
                    this.Vehicle = strbuynew;
                }
                else flag = 1;
                break;
            }
            case 6: {
                if (human.MoneyBalance > 2000000) {
                    System.out.println("Вы купили автомобиль за 2 000 000р");
                    human.MoneyBalance -= 2000000;
                    strbuynew = "Автомобиль";
                    this.Housing = strbuynew;
                }
                else flag = 1;
                break;
            }
        }
        if (flag == 1) System.out.println("Недостаточно денег для покупки");
        else this.human = human;
    }
}
