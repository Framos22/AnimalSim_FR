public class Location {

    private int xCoord;
    private int yCoord;

    public Location() {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    public Location(int x, int y) {
        if (x < 0 || y < 0) {
            System.out.println("The coordinate is invalid. Setting both to 0.");
            this.xCoord = 0;
            this.yCoord = 0;
        } else {
            this.xCoord = x;
            this.yCoord = y;
        }
    }

    public void update(int x, int y) {
        if (x < 0 || y < 0) {
            System.out.println("The coordinate is invalid. No update performed.");
        } else {
            this.xCoord = x;
            this.yCoord = y;
        }
    }

    public int[] getCoordinates() {
        return new int[]{xCoord, yCoord};
    }
}


