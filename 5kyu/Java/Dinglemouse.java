import java.util.*;

public class Dinglemouse {

    public static String[] whoEatsWho(final String zoo) {


        Map<String, Set<String>> eats = new HashMap<>();
        add(eats, "antelope", "grass");
        add(eats, "big-fish", "little-fish");
        add(eats, "bug", "leaves");
        add(eats, "bear", "big-fish", "bug", "chicken", "cow", "leaves", "sheep");
        add(eats, "chicken", "bug");
        add(eats, "cow", "grass");
        add(eats, "fox", "chicken", "sheep");
        add(eats, "giraffe", "leaves");
        add(eats, "lion", "antelope", "cow");
        add(eats, "panda", "leaves");
        add(eats, "sheep", "grass");

        List<String> result = new ArrayList<>();
        result.add(zoo);

        List<String> animals = new ArrayList<>(Arrays.asList(zoo.split(",")));

        boolean ate;

        do {
            ate = false;

            for (int i = 0; i < animals.size(); i++) {
                String animal = animals.get(i);

                if (!eats.containsKey(animal)) continue;


                if (i > 0 && eats.get(animal).contains(animals.get(i - 1))) {
                    String eaten = animals.remove(i - 1);
                    result.add(animal + " eats " + eaten);
                    ate = true;
                    break;
                }

                if (i < animals.size() - 1 && eats.get(animal).contains(animals.get(i + 1))) {
                    String eaten = animals.remove(i + 1);
                    result.add(animal + " eats " + eaten);
                    ate = true;
                    break;
                }
            }

        } while (ate);

        result.add(String.join(",", animals));

        return result.toArray(new String[0]);
    }

    private static void add(Map<String, Set<String>> map, String animal, String... food) {
        map.put(animal, new HashSet<>(Arrays.asList(food)));
    }
}
