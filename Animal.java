public abstract class Animal {

    protected int simID;
    protected Location location;
    protected boolean full;
    protected boolean rested;

    public Animal() {
        this.simID = 0;
        this.location = new Location();
        this.full = false;
        this.rested = true;
    }

    public Animal(int simID, Location location) {
        if (simID <= 0) {
            System.out.println("SimID is incorrect. Setting to 0.");
            this.simID = 0;
        } else {
            this.simID = simID;
        }
        this.location = location;
        this.full = false;
        this.rested = true;
    }

    public boolean eat() {
        this.full = Math.random() > 0.5;
        return this.full;
    }

    public boolean sleep() {
        this.rested = Math.random() > 0.5;
        return this.rested;
    }

    public int getSimID() {
        return simID;
    }

    public void setSimID(int simID) {
        this.simID = simID > 0 ? simID : 0;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isRested() {
        return rested;
    }

    public void setRested(boolean rested) {
        this.rested = rested;
    }
}

