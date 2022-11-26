import pokemons.FixPokemons;
import ru.ifmo.se.pokemon.Battle;

public class FixBattle {
    Battle pokemonBattle = new Battle();

    private int allyCnt_lvl = 0;
    private int foeCnt_lvl = 0;
    public FixBattle(FixPokemons[] pokemonsAlly, FixPokemons[] pokemonsFoe) {
        for (FixPokemons fixPokemons : pokemonsAlly) {
            if (fixPokemons.get_lvl()) {
                pokemonBattle.addAlly(fixPokemons);
                allyCnt_lvl++;
            }
        }
        for (FixPokemons fixPokemons : pokemonsFoe) {
            if (fixPokemons.get_lvl()) {
                pokemonBattle.addFoe(fixPokemons);
                foeCnt_lvl ++;
            }

        }
    }
    public void go(){
         if (allyCnt_lvl == 0 && foeCnt_lvl == 0){
            System.out.println("Уровень ниодного из покемонов не удовлетворяет условию, бой не может состояться");
        }else if (allyCnt_lvl + foeCnt_lvl == 1){
            System.out.println("Одного покемона недостаточно для проведения боя");
        }else if(allyCnt_lvl == 0 || foeCnt_lvl == 0){
            System.out.println("У всех покемонов одной из команд присвоенны уровни, неудвлетворяющие условию, поэтому бой не может начаться");
        }else {
            pokemonBattle.go();
        }
    }
}
