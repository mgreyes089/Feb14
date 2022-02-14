import java.util.Random;

public class Dau {
    private int value;

    public Dau() {
        throwDice();
    }

    public int getValue(){
        return value;
    }
    public int throwDice() {
        this.value= new Random().nextInt(6) + 1;

        return 0;
    }


}
