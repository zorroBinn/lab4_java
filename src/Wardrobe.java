import java.util.*;

public class Wardrobe { //Класс гардероб
    protected ArrayList<Clothes> wardrobe; //ArrayList гардероб с

    public Wardrobe() { //Конструктор без параметров
        wardrobe = new ArrayList<Clothes>();
    }

    public void Add(Clothes cl) { //Добавление в гардероб сета одежды
        wardrobe.add(cl);
    }

    public void Delete(int count) { //Удаление из гардероба сета одежды
        wardrobe.remove(count-1);
    }

    public void Read() { //Ввод в гардероб сетов одежды
        Scanner inp = new Scanner(System.in);
        int N;
        do {
            System.out.println("Сколько сетов одежды добавить в гардероб? (Не бельше пяти): ");
            N = inp.nextInt();
        } while (N < 1 || N > 5);
        Clothes[] cl = new Clothes[N];
        for (int i = 0; i < N; i++) {
            cl[i] = new Clothes();
            cl[i].Read();
            wardrobe.add(cl[i]);
        }
    }

    public void Display() { //Вывод на экран гардероба
        Iterator<Clothes> it = wardrobe.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void SortByClothesStatus() { //Сортировка гардероба по статусу одежды
        Collections.sort(wardrobe, new Comparator<Clothes>() {
            @Override
            public int compare(Clothes t1, Clothes t2) {
                if(t1.getClothesStatus() < t2.getClothesStatus())
                    return -1;
                else return 1;
            }
        });
    }

    public void SortByClothingSetCount() { //Сортировка гардероба по номеру сета одежды
        Collections.sort(wardrobe, new Comparator<Clothes>() {
            @Override
            public int compare(Clothes t1, Clothes t2) {
                if(t1.getClothingSetCount() > t2.getClothingSetCount())
                    return -1;
                else return 1;
            }
        });
    }
}
