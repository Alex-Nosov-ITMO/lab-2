package attacks.statusAttacs;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){super(Type.PSYCHIC, 0, 100);}

    @Override
    protected String describe() {
        return "Применяет Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect d = new Effect();
        d.stat(Stat.HP);
        Effect.sleep(pokemon);
        pokemon.addEffect(d);
        super.applySelfEffects(pokemon);
    }
}





