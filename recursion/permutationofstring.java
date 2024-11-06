package recursion;

public class permutationofstring {
    public static void permutationofstring(String s,int i)
    {
        if(i==s.length()-1)
        {
            System.out.println(s);

        }
        else
        {
            for(int j=i;j<s.length();j++){
            s=swap(s,i,j);
            permutationofstring(s, i+1);
            s=swap(s,i,j);
        }

        }
    }
    public static String swap(String a,int i,int j)
    {
        char temp;
        char c[]=a.toCharArray();
        temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        String s = "ABC";
		int n = s.length();
		permutationofstring(s, 0);
    }
}
