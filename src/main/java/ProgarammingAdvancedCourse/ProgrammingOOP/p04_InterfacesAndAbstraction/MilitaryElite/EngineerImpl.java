package p04_InterfacesAndAbstraction.MilitaryElite;

import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }


    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public List<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        repairs.forEach(r -> stringBuilder.append(r.toString()).append(System.lineSeparator()));
        if (!stringBuilder.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (repairs.isEmpty()) {
            return super.toString() + System.lineSeparator() + "Repairs:";
        }
        return super.toString() + System.lineSeparator() + "Repairs:" + System.lineSeparator() + stringBuilder;
    }
}
