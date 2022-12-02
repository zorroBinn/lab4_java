public class SetColor extends Clothes{
    protected String color;

    public SetColor(){
        new Clothes();
        this.color = "";
    }
    public SetColor(String color) {
        this.color = color;
    }
    public SetColor(Clothes clothes, String color) {
        this.color = color;
        this.Body = clothes.Body;
        this.ClothingSetCount = clothes.ClothingSetCount;
        this.Pants = clothes.Pants;
        this.Shoes = clothes.Shoes;
        this.ClothesStatus = clothes.ClothesStatus;
    }
    public String toString(){
        return "Цвет сета под номером " + this.ClothingSetCount + ": " + this.color;
    }
}
