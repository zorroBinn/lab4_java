import java.util.Scanner;

public class Human //Класс персонаж
{
    private int Age; //Возраст
    public long MoneyBalance; //Игровой баланс
    private String Name, Sex; //Имя, пол
    private Clothes clothes; //Текущая одежда

    Human() {//Конструктор без параметров
        this.Age = 0;
        this.Name = "";
        this.Sex = "";
        this.MoneyBalance = 1000;
    }
    Human(int age, String name, String sex, Clothes clothes) {//конструктор с параметрами
        this.Age = age;
        this.Name = name;
        this.Sex = sex;
        this.MoneyBalance = 1000;
        this.clothes = clothes;
    }
    public void Read() {//Ввод с клавиатуры
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
    public void Display() {//Вывод на экран
        System.out.println("Имя: " + Name);
        System.out.println("Пол: " + Sex);
        System.out.println("Возраст: " + Age);
        System.out.println("Баланс денег: " + MoneyBalance);
        clothes.Display();
    }

    void NameBalanceDisplay() {//Вывод на экран имени и баланса
        System.out.println("Имя: " + Name);
        System.out.println("Баланс денег: " + MoneyBalance);
    }

    String NameDisplay() {
        return Name;
    } //Возвращение строки с именем
}
