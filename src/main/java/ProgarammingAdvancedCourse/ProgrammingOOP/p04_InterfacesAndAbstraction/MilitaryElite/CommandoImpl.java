package p04_InterfacesAndAbstraction.MilitaryElite;

import java.util.ArrayList;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        missions = new ArrayList<>();
    }


    public void addMission(Mission mission) {
        missions.add(mission);
    }

    @Override
    public List<Mission> getMissions() {
        return missions;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        missions.forEach(m -> stringBuilder.append(m.toString()).append(System.lineSeparator()));
        if (!stringBuilder.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (missions.isEmpty()) {
            return super.toString() + System.lineSeparator() + "Missions:";
        }
        return super.toString() + System.lineSeparator() + "Missions:" + System.lineSeparator() + stringBuilder;
    }
}
