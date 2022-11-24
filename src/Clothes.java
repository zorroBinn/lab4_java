import java.util.Scanner;
import java.util.InputMismatchException;

public class Clothes {//Класс одежда
    protected int ClothesStatus, ClothingSetCount;//Статус целостности одежды, номер сета одежды
    protected String Body, Pants, Shoes;//Верх, низ, обувь
    protected static int count = 0;//Статическая переменная для хранения количества сетов одежды

    Clothes() { //Конструктор без параметров
        this.ClothesStatus = 0;
        this.Body = "";
        this.Pants = "";
        this.Shoes = "";
    }
    Clothes(int status, String body, String pants, String shoes) {//конструктор с параметрами
        this.ClothesStatus = status;
        this.Body = body;
        this.Pants = pants;
        this.Shoes = shoes;
        count++;
        this.ClothingSetCount = count;
    }
    public void Read() {//Ввод с клавиатуры
        int status = 0;
        boolean correctinput = false;
        String strbody = "", strpants = "", strshoes = "";
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите информацию об одежде персонажа:");
        while (!correctinput) {
            try {
                System.out.println("Верхняя одежда: ");
                strbody = inp.nextLine();
                if (strbody.isEmpty()) throw new Exception();
                System.out.println("Штаны: ");
                strpants = inp.nextLine();
                if (strpants.isEmpty()) throw new Exception();
                System.out.println("Обувь: ");
                strshoes = inp.nextLine();
                if (strshoes.isEmpty()) throw new Exception();
                correctinput = true;
            }
            catch (Exception ex) {
                System.out.println("Ошибка ввода, повторите ещё раз!");
            }
        }
        while (correctinput) {
            try {
                System.out.println("Состояние одежды (в %): ");
                status = inp.nextInt();
                if (status < 0 || status > 100) {
                    throw new Exception();
                }
                correctinput = false;
            }
            catch (InputMismatchException ex) {
                inp.nextLine();
                System.out.println("Неверный ввод");
            }
            catch (Exception ex) {
                inp.nextLine();
                System.out.println("Состояние одежды должно быть в диапазоне от 0 до 100");
            }
        }
        this.ClothesStatus = status;
        this.Body = strbody;
        this.Pants = strpants;
        this.Shoes = strshoes;
        count++;
        this.ClothingSetCount = count;
    }
    public void Display() {//Вывод на экран
        System.out.println("Комплект одежды номер " + ClothingSetCount + ":");
        System.out.println("Верхняя одежда: " + Body);
        System.out.println("Штаны: " + Pants);
        System.out.println("Обувь: " + Shoes);
        System.out.println("Состояние одежды (в %): " + ClothesStatus);
    }
    public void TearClothes(){//Метод порвать одежду
        if (this.ClothesStatus > 0) {
            System.out.println("Ваша одежда порвалась!");
            this.ClothesStatus -= 15;
            if (this.ClothesStatus < 0)
                this.ClothesStatus = 0;
        }
    }
    public void SewUpClothes() {//Метод зашить одежду
        if (this.ClothesStatus >= 0) {
            System.out.println("Вы зашили вашу одежду!");
            this.ClothesStatus += 20;
            if (this.ClothesStatus > 100)
                this.ClothesStatus = 100;
        }
    }
    public static int Getcount(){ //Статический метод возврата статической переменной
        return count;
    }
}
