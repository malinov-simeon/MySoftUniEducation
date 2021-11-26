package p04_InterfacesAndAbstraction.MilitaryElite;

public class Repair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("  Part name: %s Hours Worked: %d", partName, hoursWorked);
    }
}
