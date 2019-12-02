import java.util.Random;
public class Problem2{
    public static void main(String args[]) {
        Random random = new Random();
        int max=100;
        int min=1;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int randomInt = random.nextInt(max - min + 1) + min;
            arr[i]=randomInt;
            System.out.println("Value of Position #"+i+" = " + randomInt);
        }
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The average of this array is "+sum/arr.length+".");
    }
}
