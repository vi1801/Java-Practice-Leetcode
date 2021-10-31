import java.util.HashMap;

/*Create a HashMap object called people that will store String keys and Integer values*/
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Jane", 32);
        people.put("anna", 20);
        people.put("Zoya",25);

        for(String i : people.keySet()) {
            System.out.println("keys: " + i + "\nvalues: " + people.get(i));
        }
    }
}
