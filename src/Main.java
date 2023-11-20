import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Double> r = new ArrayList<>();
        r.add(6.3);
        r.add(5.9);

        FavoriteClasses<String, Integer, Double> a = new FavoriteClasses<>("Hello", 67, r.get(0));
        System.out.println("My favorites are " + a.getClass() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");

    }
}