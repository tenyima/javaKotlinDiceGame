import java.util.Random;

public class DiceGame {


    public static void main(String[] args){
        // DiceGame dg = new DiceGame();
        // DiceGame.Dice d = dg.new Dice(6);

        Dice d = new Dice(6);

        for(int i = 1; i < 11; i++)
            System.out.println(d.roll());

    }

    /*
    private class Dice{
        private int rangeEnd;

        public Dice(){};

        public Dice(int rangeEnd)
        {
            this.rangeEnd = rangeEnd;
        }


        public int roll(){
            Random rn = new Random();
            return rn.nextInt(this.rangeEnd)+1;
        }

    }
    */
}

class Dice{
    private int rangeEnd;

    public Dice(int rangeEnd)
    {
        this.rangeEnd = rangeEnd;
    }

    public int roll(){
        Random rn = new Random();
        return rn.nextInt(this.rangeEnd)+1;
    }

}
