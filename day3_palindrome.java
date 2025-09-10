import java.util.*;
public class day3_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num to check:");
        int x=sc.nextInt();
        boolean y=isPalindrome(x);
        if(y==true)
         System.out.println("true");
         else
          System.out.println("false");
    }
    public static boolean isPalindrome(int x) {
        if(x<0)
          return false;
        int original=x;
        int rev=0;
        while(x!=0){
            int num=x%10;
            x=x/10;
            rev=rev*10+num;
        }
        if(rev==original)
         return true;
        return false;
    }
}

