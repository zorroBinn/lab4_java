import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Human implements Cloneable//Класс персонаж
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
    public String toString() {//Вывод на экран
        return "Имя: " + Name + "\nПол: " + Sex + "\nВозраст: " + Age + "\nБаланс денег: " + MoneyBalance + "\n" + clothes.toString();
    }

    void CardDisplay() {//Вывод на экран имени и баланса
        System.out.println("Имя: " + Name);
        System.out.println("Возраст: " + Age);
    }

    String GetName() {
        return Name;
    } //Возвращение строки с именем

    public Human clone() {
        Human Clone = null;
        try {
            Clone = (Human)super.clone();
            return Clone;
        } catch (CloneNotSupportedException e) {
            return this;
        }

    }
}
