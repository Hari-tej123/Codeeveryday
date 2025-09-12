import java.util.*;

public class code_day5_vowelgame {
    public boolean doesAliceWin(String s) {
        int vowelcount=0;
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0;i<n;i++){
            char x=arr[i];
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                vowelcount++;
            }
        }
        if(vowelcount==0)
           return false;
        else if(vowelcount%2!=0)
        return true;
        else if(vowelcount>=2&&vowelcount%2==0)
         return true;
        else
         return false;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        code_day5_vowelgame sol = new code_day5_vowelgame();
        boolean result = sol.doesAliceWin(input);

        if (result) {
            System.out.println("Alice wins");
        } else {
            System.out.println("Alice loses");
        }
    }
    
}

