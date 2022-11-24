import java.util.InputMismatchException;
import java.util.Scanner;

public class Worker extends Human { //Класс работа
     //персонаж
    protected int Payment; //Оплата
    protected String Namework; //Место работы

    Worker() {//Конструктор без параметров
        this.Namework = "";
        this.Payment = 0;
        this.Name = "";
        this.Age = 0;
        this.MoneyBalance = 1000;
        this.Sex = "";
        this.clothes = new Clothes();
    }
    Worker(Human human, String namework, int payment) {//конструктор с параметрами
        this.Namework = namework;
        this.Payment = payment;
        this.Name = human.Name;
        this.Age = human.Age;
        this.MoneyBalance = human.MoneyBalance;
        this.Sex = human.Sex;
        this.clothes = human.clothes;
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
        this.Namework = strnamework;
        this.Payment = payment;
        this.Name = human.Name;
        this.Age = human.Age;
        this.MoneyBalance = human.MoneyBalance;
        this.Sex = human.Sex;
        this.clothes = human.clothes;
    }

    public void Display() {//Вывод на экран
        System.out.println("Имя работника: " + NameDisplay());
        System.out.println("Место его работы: " + Namework);
        System.out.println("Оплата за работу: " + Payment);
    }
    public void Working(Human human) {//Метод "Работать"
        System.out.println("За свою работу вы получили " + Payment + "р!");
        human.MoneyBalance += Payment;
        this.MoneyBalance += Payment;
    }
}
