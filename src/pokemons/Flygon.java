package pokemons;

import attacks.statusAttacs.Roost;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Vibrava{
    public Flygon(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GROUND, Type.DRAGON);
        this.setStats(80, 100, 80, 80, 80, 100);
        this.addMove(new Roost());
    }
}
