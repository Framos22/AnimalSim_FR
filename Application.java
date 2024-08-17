import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Location loc1 = new Location();
        Location loc2 = new Location(5, 10);
        Location loc3 = new Location(-1, 10);

        loc1.update(2, 3);

        Goldfinch goldfinch1 = new Goldfinch();
        Goldfinch goldfinch2 = new Goldfinch(1, loc2, 10.0);
        goldfinch1.walk(1);
        goldfinch1.fly(new Location(3, 4));

        BrownBear bear1 = new BrownBear();
        BrownBear bear2 = new BrownBear(3, loc1, "Grizzly");
        bear1.walk(0);
        bear1.swim(1);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Goldfinch(5, new Location(1, 2), 8.0));
        animalList.add(new BrownBear(7, new Location(4, 5), "Siberian"));

        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}
