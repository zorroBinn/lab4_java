import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MedicalCard extends Document implements Reading//Класс Медкарта
{
    protected Human human; //Персонаж
    protected String HealthStatus; //Статус здоровья персонажа
    protected int Weight, Height; //Вес, рост

    MedicalCard() {//Конструктор без параметров
        this.human = new Human();
        this.Weight = this.Height = 0;
        this.HealthStatus = "";
    }
    MedicalCard(Human human, int weight, int height, String status) {//конструктор с параметрами
        this.Weight = weight;
        this.Height = height;
        this.HealthStatus = status;
        this.human = human;
    }
    MedicalCard(Human human, int weight, int height, String status, int counter) {
        super(counter);
        this.Weight = weight;
        this.Height = height;
        this.HealthStatus = status;
        this.human = human;
    }
    public void Read(Human human) {//Ввод с клавиатуры
        String status = "";
        int height = 0, weight = 0;
        boolean correctinput = false;
        Scanner inp = new Scanner(System.in);
        System.out.println("Заполните медкарту персонажа: ");
        while (!correctinput) {
            try {
                System.out.println("Вес (в кг): ");
                weight = inp.nextInt();
                if (weight < 2 || weight > 550) throw new IOException();
                System.out.println("Рост (в см): ");
                height = inp.nextInt();
                if (height < 20 || height > 300) throw new Exception();
                correctinput = true;
            }
            catch (InputMismatchException ex) {
                inp.nextLine();
                System.out.println("Неверный ввод");
            }
            catch (IOException ex) {
                inp.nextLine();
                System.out.println("Вес персонажа не может быть равен " + weight);
            }
            catch (Exception ex) {
                inp.nextLine();
                System.out.println("Рост персонажа не может быть равен " + height);
            }
        }
        inp.nextLine();
        while (correctinput) {
            try {
                System.out.println("Состояние здоровья: ");
                status = inp.nextLine();
                if (status.isEmpty()) throw new Exception();
                correctinput = false;
            }
            catch (Exception ex) {
                System.out.println("Ошибка ввода, повторите ещё раз!");
            }
        }
        this.Weight = weight;
        this.Height = height;
        this.HealthStatus = status;
        this.human = human;
    }
    public String toString() {//Вывод на экран
        return "Медкарта номер " + nomber + "\nИмя пациента: " + human.GetName() + "\nВес (в кг): " + Weight +
                "\nРост (в см): " + Height + "\nСостояние здоровья: " + HealthStatus;
    }
    public void BodyMassIndex(Rezult rez) { //Метод рассчёта ИМТ
        double Index, weight, height;
        if (Height > 0 && Weight > 0) {
            weight = Weight;
            height = Height;
            Index = weight / (height * height / 10000);
            rez.rez = Index;
            if (Index > 18.5f && Index < 25.0f)
                System.out.println("Нормальный вес");
            else if (Index <= 18.5f)
                System.out.println("Дефицитный веса");
            else
                System.out.println("Избыточный вес");
        }
    }
    public void SetHealthStatus() { //Изменить статус здоровья
        String status = "";
        boolean correctinput = true;
        Scanner inp = new Scanner(System.in);
        System.out.println("Текущее состояние здоровья: " + HealthStatus);
        while (correctinput) {
            try {
                System.out.println("Новое состояние здоровья: ");
                status = inp.nextLine();
                if (status.isEmpty()) throw new Exception();
                correctinput = false;
            }
            catch (Exception ex) {
                System.out.println("Ошибка ввода, повторите ещё раз!");
            }
        }
        this.HealthStatus = status;
    }

    @Override
    public void ExtendDocument() {
        System.out.println("Действие документа проведено");
    }
}
