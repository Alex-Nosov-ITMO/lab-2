package attacks.specialAttakcs;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){super(Type.ELECTRIC, 90, 100);}

    @Override
    protected String describe() {
        return "Применяет Thunderbolt";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect d = new Effect().chance(0.1).condition(Status.PARALYZE);
        pokemon.addEffect(d);
        super.applyOppEffects(pokemon);
    }
}
