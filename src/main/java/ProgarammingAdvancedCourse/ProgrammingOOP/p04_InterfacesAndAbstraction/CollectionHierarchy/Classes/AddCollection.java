package p04_InterfacesAndAbstraction.CollectionHierarchy.Classes;

import p04_InterfacesAndAbstraction.CollectionHierarchy.Interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String add) {
        super.items.add(super.items.size(), add);
        return super.items.indexOf(add);
    }
}
