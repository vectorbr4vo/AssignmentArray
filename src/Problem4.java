import java.util.Random;
public class Problem4 {
    public static void main(String args[]) {
        Random random = new Random();
        int max = 100;
        int min = 1;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int randomInt = random.nextInt(max - min + 1) + min;
            arr[i] = randomInt;
            System.out.println("Value of Position #" + i + " = " + randomInt);
        }
        System.out.println();
        System.out.println("(New) Value of Position #0 = " + arr[9]);
        System.out.println("(New) Value of Position #1 = " + arr[8]);
        System.out.println("(New) Value of Position #2 = " + arr[7]);
        System.out.println("(New) Value of Position #3 = " + arr[6]);
        System.out.println("(New) Value of Position #4 =  " + arr[5]);
        System.out.println("(New) Value of Position #5 =  " + arr[4]);
        System.out.println("(New) Value of Position #6 =  " + arr[3]);
        System.out.println("(New) Value of Position #7 =  " + arr[2]);
        System.out.println("(New) Value of Position #8 =  " + arr[1]);
        System.out.println("(New) Value of Position #9 =  " + arr[0]);
    }
}