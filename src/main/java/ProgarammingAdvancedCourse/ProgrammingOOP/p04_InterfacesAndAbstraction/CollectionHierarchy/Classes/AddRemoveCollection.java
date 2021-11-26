package p04_InterfacesAndAbstraction.CollectionHierarchy.Classes;

import p04_InterfacesAndAbstraction.CollectionHierarchy.Interfaces.AddRemovable;

public class AddRemoveCollection extends Collection implements AddRemovable {
    @Override
    public String remove() {
        return super.items.remove(super.items.size() - 1);
    }

    @Override
    public int add(String element) {
        super.items.add(0, element);
        return 0;
    }
}
