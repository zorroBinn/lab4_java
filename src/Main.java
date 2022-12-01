public class Main {
    public static void main(String[] args) {
        //Тест добавления и вывода
        System.out.println("");
        Clothes cl = new Clothes(88, "t1", "t1", "t1");
        Wardrobe wb = new Wardrobe();
        wb.Add(cl);
        wb.Add(new Clothes(100, "t2", "t2", "t2"));
        wb.Display();
        System.out.println("");
        //Тест ввода
        wb.Read();
        wb.Display();
        System.out.println("");
        //Тест удаления
        wb.Delete(2);
        System.out.println("");
        wb.Display();
        //Тест сортировки 1
        wb.SortByClothesStatus();
        wb.Display();
        System.out.println("");
        //Тест сортировки 2
        wb.SortByClothingSetCount();
        wb.Display();
        System.out.println("");
    }
}