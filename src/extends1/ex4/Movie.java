package extends1.ex4;

public class Movie extends Item{
    String director;
    String actor;

    public Movie(String name, int place, String director, String actor) {
        super(name, place);
        this.director = director;
        this.actor = actor;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + director + ", 배우" + actor);
    }

}
