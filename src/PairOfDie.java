/**
 * Created by edgar971 on 6/16/15.
 */
public class PairOfDie extends Die {

    private Die die1, die2;
    private int sum;

    //cunstructor
    public PairOfDie() {
        die1 = new Die();
        die2 = new Die();

    }

    //set die1 value
    public void setDie1(int value) {
        die1.setFaceValue(value);
    }
    //set die2 value
    public void setDie2(int value) {
        die2.setFaceValue(value);
    }
    //get die1 face value
    public String getDie1() {

        return die1.getFaceValue();

    }
    //get die2 face value
    public String getDie2() {
        return die2.getFaceValue();
    }
    //roll the dice
    public int roll() {

        return sum = die1.roll() + die2.roll();

    }
    //get the sum of the dice
    public int getSum() {
        return sum;
    }





}
