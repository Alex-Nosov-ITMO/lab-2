package pokemons;

import attacks.specialAttakcs.Thunderbolt;
import attacks.statusAttacs.Rest;
import attacks.statusAttacs.Tail_Whip;
import ru.ifmo.se.pokemon.Type;

public class Zigzagoon extends FixPokemons {
    public Zigzagoon(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(38, 30, 41, 30, 41, 60);
        this.addMove(new Thunderbolt());
        this.addMove(new Tail_Whip());
        this.addMove(new Rest());
    }
}
