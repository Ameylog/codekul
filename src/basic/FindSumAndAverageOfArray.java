package basic;

public class FindSumAndAverageOfArray {

    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 6, 4, 315, 1, 7};
        double sum = 0;
        double avg = 0;

        for (int i :arr) {
                sum=sum+i;
        }

        avg=sum/ arr.length;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }
}
