package tutorial30daysofcode.Day14Scope;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference(){
        int length = elements.length, temp;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                temp = Math.abs(elements[i] - elements[j]);
                if (temp > maximumDifference){
                    maximumDifference = temp;
                }
            }
        }

        return maximumDifference;
    }
}
