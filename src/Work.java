import java.util.Scanner;

public class Work { //Класс работа
    private Human human; //персонаж
    private int Payment; //Оплата
    private String Namework; //Место работы

    Work() {//Конструктор без параметров
        this.human = new Human();
        this.Namework = "";
        this.Payment = 0;
    }
    Work(Human human, String namework, int payment) {//конструктор с параметрами
        this.human = human;
        this.Namework = namework;
        this.Payment = payment;
    }
    public void Read(Human human) {//Ввод с клавиатуры
        int payment;
        String strnamework;
        Scanner inp = new Scanner(System.in);
        System.out.println("Место работы: ");
        strnamework = inp.nextLine();
        System.out.println("Оплата за работу: ");
        payment = inp.nextInt();
        this.human = human;
        this.Namework = strnamework;
        this.Payment = payment;
    }
    public void Display() {//Вывод на экран
        System.out.println("Имя работника: " + human.NameDisplay());
        System.out.println("Место его работы: " + Namework);
        System.out.println("Оплата за работу: " + Payment);
    }
    public void Working(Human human) {//Метод "Работать"
        System.out.println("За свою работу вы получили " + Payment + "р!");
        human.MoneyBalance += Payment;
    }
}
