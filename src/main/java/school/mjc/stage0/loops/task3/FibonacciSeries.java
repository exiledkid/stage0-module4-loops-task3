package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int first = 0;
        int second = 1;
        int third;

        for (int x = 0; x < lastFibonacci; x++) {
            third = first + second;
            System.out.println(first);
            first = second;
            second = third;
        }
    }
}
