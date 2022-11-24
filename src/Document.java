import java.lang.Math;

public abstract class Document {
    protected int nomber;

    Document() {
        this.nomber = (int)(Math.random()*9999+1) + 10000;
    }
    Document(int nomber) {
        this.nomber = nomber;
    }

}
