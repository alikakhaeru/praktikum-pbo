package abstraction.abstrak;

public class MainAbstrak {

    public static void main(String[] args) {
        Televisi tv = new Televisi("Samsung", 150);
        Radio r = new Radio("Sony", 50);

        tv.hidupkan();
        tv.matikan();

        r.hidupkan();
        r.matikan();
    }
}

