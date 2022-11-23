package pokemons;

import ru.ifmo.se.pokemon.Pokemon;

public class FixPokemons extends Pokemon {
    final boolean assignet_lvl;
    final boolean assignet_name;


    public FixPokemons(String name, int lvl){
        super(name, lvl);
        if (lvl < 1){
            assignet_lvl = false;
            System.out.println("Уровень покемона" + name + "не входит в требуемый диапазон (lvl > 1)");
        }else {
            assignet_lvl = true;
        }

        if (name == null){
            assignet_name = false;
        }else{
            assignet_name = true;
        }
    }

    public boolean get_lvl(){return assignet_lvl;}
    public boolean get_name(){return assignet_name;}
}


