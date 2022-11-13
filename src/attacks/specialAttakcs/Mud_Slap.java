package attacks.specialAttakcs;

import ru.ifmo.se.pokemon.*;

public class Mud_Slap extends SpecialMove {
    public Mud_Slap(){super(Type.GROUND, 20, 100);}

    @Override
    protected String describe() {return "Применяет Mud_Slap";}


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect d = new Effect().stat(Stat.ACCURACY, -1);
        pokemon.addEffect(d);
        super.applyOppEffects(pokemon);
    }
}
