package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        if (first == 0) {
            System.out.println(second);

        } else if (second == 0) {
            System.out.println(first);

        } else if (first >= second) {
            for (int x = second; x >= 0; x--) {

                if (first % x == 0 && second % x == 0) {
                    System.out.println(x);
                    break;
                }
            }
        } else {
            for (int x = first; x >= 0; x--) {

                if (second % x == 0 && first % x == 0) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
