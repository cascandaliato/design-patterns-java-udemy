package decorator;

public class Dragon {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public String fly() {
        Bird bird = new Bird();
        bird.age = age;
        return bird.fly();
    }

    public String crawl() {
        Lizard lizard = new Lizard();
        lizard.age = age;
        return lizard.crawl();
    }
}