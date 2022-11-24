import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Human //Класс персонаж
{
    protected int Age; //Возраст
    public long MoneyBalance; //Игровой баланс
    protected String Name, Sex; //Имя, пол
    protected Clothes clothes; //Текущая одежда

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
        String strname = "", strsex = "";
        int age = 0;
        boolean correctinput = false;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите информацию о персонаже:");
        while (!correctinput) {
            try {
                System.out.println("Имя: ");
                strname = inp.nextLine();
                if (strname.isEmpty()) throw new Exception();
                System.out.println("Пол: ");
                strsex = inp.nextLine();
                if (strsex.isEmpty()) throw new Exception();
                correctinput = true;
            }
            catch (Exception ex) {
                System.out.println("Неверный ввод");
            }
        }
        while (correctinput) {
            try {
                System.out.println("Возраст: ");
                age = inp.nextInt();
                if (age < 1 || age > 110) throw new Exception();
                correctinput = false;
            }
            catch (InputMismatchException ex) {
                inp.nextLine();
                System.out.println("Неверный ввод");
            }
            catch (Exception ex) {
                inp.nextLine();
                System.out.println("Возраст персонажа не может быть равен " + age);
            }
        }
        this.Age = age;
        this.Name = strname;
        this.Sex = strsex;
        this.MoneyBalance = 1000;
        this.clothes = new Clothes();
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
