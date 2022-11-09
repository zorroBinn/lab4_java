import java.util.Scanner;

public class Human
{
    private int Age;
    public long MoneyBalance;
    private String Name, Sex;
    private Clothes clothes;

    Human() {
        this.Age = 0;
        this.Name = "";
        this.Sex = "";
        this.MoneyBalance = 1000;
    }
    Human(int age, String name, String sex, Clothes clothes) {
        this.Age = age;
        this.Name = name;
        this.Sex = sex;
        this.MoneyBalance = 1000;
        this.clothes = clothes;
    }
    public void Read() {
        String strname, strsex;
        int age;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите информацию о персонаже:");
        System.out.println("Имя: ");
        strname = inp.nextLine();
        System.out.println("Пол: ");
        strsex = inp.nextLine();
        System.out.println("Возраст: ");
        age = inp.nextInt();
        this.Age = age;
        this.Name = strname;
        this.Sex = strsex;
        this.MoneyBalance = 1000;
        this.clothes.Read();
    }
    public void Display() {
        System.out.println("Имя: " + Name);
        System.out.println("Пол: " + Sex);
        System.out.println("Возраст: " + Age);
        System.out.println("Баланс денег: " + MoneyBalance);
        clothes.Display();
    }

    void NameBalanceDisplay() {
        System.out.println("Имя: " + Name);
        System.out.println("Баланс денег: " + MoneyBalance);
    }

    String NameDisplay() {
        return Name;
    }
}
