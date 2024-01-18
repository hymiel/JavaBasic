package extends1.ex4;

public class Album extends Item{
    private String artist;
    public Album(String name, int place, String artist) {
        super(name, place);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }


}
