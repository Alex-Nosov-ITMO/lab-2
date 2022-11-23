package pokemons;

import attacks.physicalAttacks.Poison_Jab;
import attacks.physicalAttacks.Quick_Attack;
import attacks.physicalAttacks.Stone_Edge;
import attacks.statusAttacs.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Terrakion extends FixPokemons {
    public Terrakion(String name, int lvl)
    {
        super(name,lvl);
        this.setType(Type.ROCK, Type.FIGHTING);
        this.setStats(91, 129, 90, 72, 90, 108);
        this.addMove(new Quick_Attack());
        this.addMove(new Stone_Edge());
        this.addMove(new Swagger());
        this.addMove(new Poison_Jab());
    }


}
