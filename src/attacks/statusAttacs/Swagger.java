package attacks.statusAttacs;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(){ super(Type.NORMAL, 0, 85);}

    @Override
    protected String describe() {return "Применяет Swagger";}

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect d = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(d);
        super.applyOppEffects(p);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
    }
}
