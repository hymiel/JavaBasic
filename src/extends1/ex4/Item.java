package extends1.ex4;

public class Item {
    private String name;
    private int place;

    public Item(String name, int place) {
        this.name = name;
        this.place = place;
    }

    public void print() {
        System.out.println("이름 : " + name + "가격 : " + place);
    }

    public int gerPrice() {
        return place;
    }
}
