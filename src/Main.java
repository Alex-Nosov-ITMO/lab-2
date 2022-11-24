import pokemons.*;

public class Main {
    public static void main(String[] args)
    {
        FixPokemons Terrakion = new Terrakion("Великолепный покемон",-5);
        FixPokemons Zigzagoon = new Zigzagoon("Суир", -7);
        FixPokemons Linoone = new Linoone("Пегас", 6);
        FixPokemons Vibrava = new Vibrava("Данила", 5);
        FixPokemons Trapinch = new Trapinch("Саня", -8);
        FixPokemons Flygon = new Flygon("Лаба", 7);


        FixPokemons[] Foe = {Terrakion, Zigzagoon, Trapinch};
        FixPokemons[] Ally = {Linoone, Vibrava, Flygon};
        FixBattle b = new FixBattle(Ally, Foe);
        b.go();
    }
}
