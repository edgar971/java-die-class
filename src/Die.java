/**
 * Created by edgar971 on 6/16/15.
 */
public class Die {
    private final int MAX = 6;
    private int faceValue;

    public Die() {
        faceValue = 1;
    }

    public int roll() {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    public void setFaceValue(int value) {
        faceValue = value;
    }

    public String getFaceValue() {
        String result = Integer.toString(faceValue);

        return result;
    }

}
