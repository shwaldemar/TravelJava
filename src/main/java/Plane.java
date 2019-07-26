public class Plane {
    private PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public int getCapacity() {
        return this.type.getCapacity();
    }

    public int getTotalWeight() {
        return this.type.getTotalWeight();
    }

}
