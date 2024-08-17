public class Goldfinch extends Animal implements Flyable, Walkable {

    private double wingSpan;

    public Goldfinch() {
        super();
        this.wingSpan = 9.0;
    }

    public Goldfinch(int simID, Location location, double wingSpan) {
        super(simID, location);
        if (wingSpan < 5.0 || wingSpan > 11.0) {
            System.out.println("Incorrect wingspan. Setting to 9.0.");
            this.wingSpan = 9.0;
        } else {
            this.wingSpan = wingSpan;
        }
    }

    @Override
    public void fly(Location location) {
        this.location = location;
    }

    @Override
    public void walk(int direction) {
        int[] coords = this.location.getCoordinates();
        // Move 1 unit
        switch (direction) {
            case 0: this.location.update(coords[0], coords[1] + 1); break;
            case 1: this.location.update(coords[0] + 1, coords[1]); break;
            case 2: this.location.update(coords[0], coords[1] - 1); break;
            case 3: this.location.update(coords[0] - 1, coords[1]); break;
        }
    }

    @Override
    public String toString() {
        return "Goldfinch: simID = " + simID + ", location = (" + location.getCoordinates()[0] + ", " + location.getCoordinates()[1] + 
               "), wingSpan = " + wingSpan + "cm, full = " + full + ", rested = " + rested;
    }
}
