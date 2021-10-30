import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England","London");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("India","Delhi");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        //capitalCities.remove("England");
        System.out.println(capitalCities);
        //capitalCities.clear();
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        for(String i: capitalCities.keySet())
        {
            System.out.println(i);
        }
        for(String j: capitalCities.values())
        {
            System.out.println(j);
        }
        for (String i : capitalCities.keySet())
        {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

    }
}
