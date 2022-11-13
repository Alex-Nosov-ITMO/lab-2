import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new Terrakion("Великолепный покемон",5);
        Pokemon p2 = new Zigzagoon("Попик", 7);
        Pokemon p3 = new Linoone("Пегас", 6);
        Pokemon p4 = new Vibrava("Данила", 5);
        Pokemon p5 = new Trapinch("Саня", 8);
        Pokemon p6 = new Flygon("Лаба", 7);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p6);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p5);
        b.go();
    }
}
