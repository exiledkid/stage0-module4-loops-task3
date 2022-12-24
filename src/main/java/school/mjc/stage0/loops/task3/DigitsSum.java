package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0) {
            t = t * -1;
        }
        int sum = 0;
        String str = t + "";
        for (int x = 0; x < str.length(); x++) {
            sum = sum + t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }
}