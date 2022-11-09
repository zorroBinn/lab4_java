import java.util.Scanner;

public class Work {
    private Human human;
    private int Payment;
    private String Namework;

    Work() {
        this.human = new Human();
        this.Namework = "";
        this.Payment = 0;
    }
    Work(Human human, String namework, int payment) {
        this.human = human;
        this.Namework = namework;
        this.Payment = payment;
    }
    public void Read(Human human) {
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
    public void Display() {
        System.out.println("Имя работника: " + human.NameDisplay());
        System.out.println("Место его работы: " + Namework);
        System.out.println("Оплата за работу: " + Payment);
    }
    public void Working(Human human) {
        System.out.println("За свою работу вы получили " + Payment + "р!");
        human.MoneyBalance += Payment;
    }
}
