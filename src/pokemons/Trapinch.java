package pokemons;

import attacks.specialAttakcs.Mud_Slap;
import attacks.statusAttacs.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Trapinch extends FixPokemons {
    public Trapinch(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GROUND);
        this.setStats(45, 100, 45, 45, 45, 10);
        this.addMove(new Swagger());
        this.addMove(new Mud_Slap());
    }
}
