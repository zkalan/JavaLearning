
import java.util.Random;

public class StringTools{
    public static void main(String[] args){
        Random r = new Random();
        int[] result = {0,0,0,0,0};
        int i = -1;
        int num = 0;
        int times = 0;
        while(num < 5){
            i = r.nextInt(5);
            if(result[i] == 0){
                result[i] = i;
                num++;
                System.out.println(i);
            }
            times++;
        }
        System.out.println("--------------------"+times+"-----------------");
    }
}
