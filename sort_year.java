import java.util.Arrays;

public class sort_year 
{
       public static void main (String[] args) {
        String arr [] = {"04-1967","10-2012","06-2012","01-1989","12-2000"};
        //String arr [] = {"04-2000","10-2000","06-2000","01-2000","12-2000"};
        int n= arr.length;
        System.out.println(n);
        String arrange_year [] = new String [n];
        String arrange_date [] = new String [n];
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            arrange_year[i]=arrangeYear(arr[i]);
            System.out.println(arrange_year[i]);
        }
        Arrays.sort(arrange_year);
        for(int i=0;i<n;i++){
            arrange_date[i]=arrangeDate(arrange_year[i]);
        }
        for(int i=0;i<arrange_date.length;i++){
            System.out.println(arrange_date[i]);
        }
    }
    public static String arrangeYear(String str){
        String date = "";
        String year = "";
        for(int i=0;i<2;i++){
            date = date + str.charAt(i);
        }
        for(int i=3;i<str.length();i++){
            year = year + str.charAt(i);
        }
        return (year+"-"+date);
    }
    public static String arrangeDate(String str){
        String date = "";
        String year = "";
        for(int i=0;i<4;i++){
            year = year + str.charAt(i);
        }
        for(int i=5;i<str.length();i++){
            date = date + str.charAt(i);
        }
        return (date+"-"+year);
    } 
}
    

