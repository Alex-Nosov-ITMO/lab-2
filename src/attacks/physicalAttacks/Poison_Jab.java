package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Poison_Jab extends PhysicalMove {
    public  Poison_Jab(){super(Type.POISON, 80, 100);}

    @Override
    protected String describe() {
        return "Применяет  Poison_Jab";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect d = new Effect().chance(0.3).condition(Status.POISON);
        pokemon.addEffect(d);
        super.applyOppEffects(pokemon);
    }
}
