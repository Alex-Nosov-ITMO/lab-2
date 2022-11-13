package attacks.specialAttakcs;

import ru.ifmo.se.pokemon.*;

public class Bug_Buzz extends SpecialMove {
    public Bug_Buzz(){super(Type.BUG, 90, 100);}

    @Override
    protected String describe() {return "Применяет Bug Buzz";}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect d = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(d);
        super.applyOppEffects(pokemon);
    }
}
