public class WhoIsRicher<T extends Human> {
    public T WhoisRicher(T t1, T t2) {
        if(t1.MoneyBalance >= t2.MoneyBalance)
            return t1;
        else
            return t2;
    }
}
