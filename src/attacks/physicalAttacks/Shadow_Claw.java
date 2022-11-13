package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Shadow_Claw extends PhysicalMove {

    public  Shadow_Claw(){super(Type.GHOST, 70, 100);}

    @Override
    protected String describe() {return "Применяет  Shadow_Claw";}

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getStat(Stat.SPEED) / 128.0 > Math.random()) {
            System.out.println("Увеличенный критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }
}

