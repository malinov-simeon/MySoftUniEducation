package p04_InterfacesAndAbstraction.MilitaryElite;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("  Code name : %s State: %s", codeName, state.getName());
    }

    // TODO: 14.11.2021 г. completeMission()

    public void completeMission() {
        state = State.FINISHED;
    }
}
