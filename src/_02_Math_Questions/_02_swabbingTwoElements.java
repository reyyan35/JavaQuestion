package _02_Math_Questions;

public class _02_swabbingTwoElements {
    public static void main(String[] args) {
        //Swap the variables with and without using Temp variable

        int x=10;
        int y=19;

        // Solution 1
        System.out.println("Before first Solution = "+ x + " "+  y);
        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println("Afer first Solution = "+ x + " "+  y);

        System.out.println();

        // Solution 2
        x=10;
        y=19;
        System.out.println("Before second Solution = "+ x + " "+  y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After second Solution = "+ x + " "+  y);
    }
}

