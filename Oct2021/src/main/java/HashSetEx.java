import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Kia");
        System.out.println(cars);
        cars.contains("Mazda");
        cars.remove("BMW");
        System.out.println(cars.size());
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
