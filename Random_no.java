import java.util.Random;
public class Random_no {
    public static void main(String args[])
    {
        int number;
        Random random=new Random();
        number= random.nextInt();
        System.out.println("Any random number is:"+number);
    }
    
}
