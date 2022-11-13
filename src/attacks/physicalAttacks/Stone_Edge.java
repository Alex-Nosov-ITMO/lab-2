package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Stone_Edge extends PhysicalMove {
    public Stone_Edge(){ super(Type.ROCK, 100, 80);}

    @Override
    protected String describe() {
        return "Применяет Stone_Edge";
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getStat(Stat.SPEED) * 3 / 512.0 > Math.random()) {
            System.out.println("Увеличенный критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }
}








