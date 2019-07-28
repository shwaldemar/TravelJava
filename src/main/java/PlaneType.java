public enum PlaneType {
    // Planes reserve half their weight for bags
    // Each bag weighs 10kg
    // Passenger weight allowance is 20kg

    AIRBUSA340(10,400),
    BOEING747(20,800),
    AIRBUS333(30,1200),
    BOEING777(40,1600);

    private int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {

        return this.capacity = capacity;
    }

    public int getTotalWeight() {

        return this.totalWeight = totalWeight;
    }
}
