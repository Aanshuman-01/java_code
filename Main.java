import java.util.Scanner;
class Main
{
 public static void main(String[] args)
 {
    int travelDirection;
    int timeTaken1;
    int timeTaken2;
    int distanceTravelled1;
    int distanceTravelled2;
    try (Scanner sc = new Scanner(System.in)) {
      travelDirection=sc.nextInt();
      timeTaken1=sc.nextInt();
      timeTaken2=sc.nextInt();
      distanceTravelled1=sc.nextInt();
      distanceTravelled2=sc.nextInt();
    }
    System.out.println("The Relative speed is:"+Relativespeed(travelDirection,timeTaken1,timeTaken2,distanceTravelled1,distanceTravelled2));
 }
   public static float Relativespeed(int td,int tt1,int tt2,int dt1,int dt2)
   {
     float speed1=(float)dt1/tt1;
     float speed2=(float)dt2/tt2;
     float relativeSpeed;
     if(td==0)
     {
       relativeSpeed=speed1+speed2;
     }
     else
     {
       relativeSpeed=speed1-speed2;
     }
     return relativeSpeed;
    } 
}
