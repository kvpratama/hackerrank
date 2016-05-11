package tutorial30daysofcode.Day14Scope;

import java.util.Arrays;

public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length-1] - elements[0]);
    }
}
