package pokemons;

import attacks.physicalAttacks.Shadow_Claw;
import ru.ifmo.se.pokemon.Type;

public class Linoone extends Zigzagoon
{
    public Linoone(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(78, 70,61, 50, 61, 100);
        this.addMove(new Shadow_Claw());
    }
}
