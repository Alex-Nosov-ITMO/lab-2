package attacks.statusAttacs;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost(){super(Type.FLYING, 0, 0);}

    @Override
    protected String describe() {return "Применяет Roost";}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect d = new Effect();
        d.stat(Stat.HP);
        pokemon.addEffect(d);
        super.applySelfEffects(pokemon);
    }
}
