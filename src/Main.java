import java.util.Random;
public class Main{
    public static void main(String args[]) {
        Random random=new Random();
        int max=6;
        int min=1;
        int count=0,x;
        for(x=0;x<20;x++){
        }
            System.out.println(count);
            int[] arr = new int[20];
            for(int i=0;i<arr.length;i++){
                int randomInt=random.nextInt(max-min+1)+min;
                System.out.println("Value of Position #"+i+" = "+ randomInt);
                if(randomInt==1){
                    count++;
                }
            }
            System.out.println("1 has occurred "+count+" times.");
    }
}
