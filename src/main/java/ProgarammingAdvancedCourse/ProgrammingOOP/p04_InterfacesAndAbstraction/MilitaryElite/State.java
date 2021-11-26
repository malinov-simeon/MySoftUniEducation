package p04_InterfacesAndAbstraction.MilitaryElite;

public enum State {
    IN_PROGRESS("inProgress"),
    FINISHED("finished");

    private String name;

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
