

import java.util.Random;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Problem3 {
    public static int findIndex(int arr[], int t) {
        if(arr==null) return-1;
        int len=arr.length;
        int i=0;
       while(i<arr.length) {
           if (arr[i] == t) return i;
           else i=i+1;
       }
       return i;
    }
    public static void main(String[] args) {
        Random random=new Random();
        int max = 100;
        int min = 1;
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            int randomInt = random.nextInt(max - min + 1) + min;
            arr[i] = randomInt;
            System.out.println("Value of Position #" + i + " = " + randomInt);
        }
        int temp=arr[1];
        arr[1]=arr[2];
        arr[2]=temp;
        System.out.println();
        System.out.println("New Value of Position #1: "+arr[1]);
        System.out.println("New Value of Position #2: "+arr[2]);

    }
}





       /* Random random = new Random();
        int max = 100;
        int min = 1;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int randomInt = random.nextInt(max - min + 1) + min;
            arr[i] = randomInt;
            System.out.println("Value of Position #" + i + " = " + randomInt);
            System.out.println();
            int a, b, temp;
            arr.=15;
            b=27;
            System.out.println();
            temp=a;
            a=b;
            b=temp;
            public static int findIndex(arr,int t){
            int i=0;
            while(i<arr.length){
                if(arr[i]==t){
                    System.out.println("Special Number :"+i);
                }
                else{
                    i=i+1;
                }
                public static void main(String[] args){
                    int [] arr={1,2,3,4,5,6,7,8,9,10};
                    System.out.println("Index Position of 5 is:"+findIndex(arr,1));
                    System.out.println("Index Position of 5 is:"+findIndex(arr,2));
                }
            }

            }



            }
*/



