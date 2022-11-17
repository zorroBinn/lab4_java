import java.util.InputMismatchException;
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
        int payment = 0;
        String strnamework = "";
        boolean correctinput = false;
        Scanner inp = new Scanner(System.in);
        while (!correctinput) {
            try {
                System.out.println("Место работы: ");
                strnamework = inp.nextLine();
                if (strnamework.isEmpty()) throw new Exception();
                correctinput = true;
            }
            catch (Exception ex) {
                System.out.println("Ошибка ввода, повторите ещё раз!");
            }
        }
        while (correctinput) {
            try {
                System.out.println("Оплата за работу: ");
                payment = inp.nextInt();
                if (payment < 0) throw new Exception();
                correctinput = false;
            }
            catch (InputMismatchException ex) {
                inp.nextLine();
                System.out.println("Неверный ввод");
            }
            catch (Exception ex) {
                inp.nextLine();
                System.out.println("Оплата не может быть равна " + payment);
            }
        }
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
        this.human = human;
    }
}
