/**
 * Created by Edgar Pino on 6/16/15.
 */
public class RollDice {
    public static void main(String[] args) {
        //create object
        PairOfDie RollingDice2 = new PairOfDie();

        //roll the dice
        RollingDice2.roll();

        //output data
        System.out.print("Die #1 value: " + RollingDice2.getDie1() + ". Die #2 value: " + RollingDice2.getDie2() + ". The sum is: " + RollingDice2.getSum());




    }
}
