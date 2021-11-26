package p04_InterfacesAndAbstraction.MilitaryElite;

import java.util.*;


public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }


    public void addPrivate(Private priv) {
        privates.add(priv);
    }

    @Override
    public List<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        privates.sort((p1,p2) -> Integer.compare(p2.getId(),p1.getId()));
        privates.forEach(p-> stringBuilder.append("  ").append(p).append(System.lineSeparator()));
        if (!stringBuilder.isEmpty()) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (privates.isEmpty()) {
            return super.toString() + System.lineSeparator() + "Privates:";
        }
        return super.toString() + System.lineSeparator()
                + "Privates:" + System.lineSeparator()
                + stringBuilder;
    }
}
