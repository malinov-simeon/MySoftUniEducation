package barracksWars.models.commands;

import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

public class Fight extends Command {
    protected Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
