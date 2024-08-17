public class BrownBear extends Animal implements Walkable, Swimmable {

    private String subSpecies;

    public BrownBear() {
        super();
        this.subSpecies = "Alaskan";
    }

    public BrownBear(int simID, Location location, String subSpecies) {
        super(simID, location);
        if (!isValidSubSpecies(subSpecies)) {
            System.out.println("Invalid Subspecies. Setting to Siberian.");
            this.subSpecies = "Alaskan";
        } else {
            this.subSpecies = subSpecies;
        }
    }

    @Override
    public void walk(int direction) {
        int[] coords = this.location.getCoordinates();
        // Move 3 units
        switch (direction) {
            case 0: this.location.update(coords[0], coords[1] + 3); break;
            case 1: this.location.update(coords[0] + 3, coords[1]); break;
            case 2: this.location.update(coords[0], coords[1] - 3); break;
            case 3: this.location.update(coords[0] - 3, coords[1]); break;
        }
    }

    @Override
    public void swim(int direction) {
        int[] coords = this.location.getCoordinates();
        // Move 2 units
        switch (direction) {
            case 0: this.location.update(coords[0], coords[1] + 2); break;
            case 1: this.location.update(coords[0] + 2, coords[1]); break;
            case 2: this.location.update(coords[0], coords[1] - 2); break;
            case 3: this.location.update(coords[0] - 2, coords[1]); break;
        }
    }

    @Override
    public String toString() {
        return "BrownBear: simID = " + simID + ", location = (" + location.getCoordinates()[0] + ", " + location.getCoordinates()[1] + 
               "), subSpecies = " + subSpecies + ", full = " + full + ", rested = " + rested;
    }

    private boolean isValidSubSpecies(String subSpecies) {
        return subSpecies.equals("Alaskan") || subSpecies.equals("California") ||
               subSpecies.equals("European") || subSpecies.equals("Grizzly") ||
               subSpecies.equals("Kodiak") || subSpecies.equals("Siberian");
    }
}
