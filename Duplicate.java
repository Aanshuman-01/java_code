public class Duplicate {
    public static void main(String args[])
    {
        String str=new String("java programmer");
        char[] ch=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.println("Duplicate character in string is:"+ch[j]);
                    count++;
                }
            }
        }
        System.out.println("count is:"+count);
    }
    
}
