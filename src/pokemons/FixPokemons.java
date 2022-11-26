package pokemons;

import ru.ifmo.se.pokemon.Pokemon;

import java.util.Objects;

public class FixPokemons extends Pokemon {
    final boolean assignet_lvl;

    public FixPokemons(String name, int lvl){
        super(Objects.requireNonNullElse(name, "noname"), lvl);

        if (lvl < 1){
            assignet_lvl = false;
            System.out.println("Уровень покемона" + name + "не входит в требуемый диапазон (lvl > 1)");
        }else {
            assignet_lvl = true;
        }
    }
    public boolean get_lvl(){return assignet_lvl;}
}


