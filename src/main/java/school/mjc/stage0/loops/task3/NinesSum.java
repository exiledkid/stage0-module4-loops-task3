package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;

        String nine = "";

        for (int x = 0; x < lengthOfLastNumber; x++){
            nine = nine + "9";
            sum = sum + Integer.parseInt(nine);
        }
        System.out.println(sum);
    }
}
