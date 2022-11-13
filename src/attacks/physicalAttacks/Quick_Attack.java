package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class Quick_Attack extends PhysicalMove {
    public Quick_Attack() {super(Type.NORMAL, 40, 100, 1, 1 );}

    @Override
    protected String describe() {
        return "Применяет Quick_Attack";
    }

}
