package attacks.statusAttacs;

import ru.ifmo.se.pokemon.*;

public class Tail_Whip extends StatusMove {
    public Tail_Whip(){super(Type.NORMAL, 0, 100);}

    @Override
    protected String describe() {
        return "Применяет Tail_Whip!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect d =new Effect().stat(Stat.DEFENSE, -1);
        pokemon.addEffect(d);
        super.applyOppEffects(pokemon);
    }
}
