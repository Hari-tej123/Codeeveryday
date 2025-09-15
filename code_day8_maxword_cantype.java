import java.util.Scanner;

public class code_day8_maxword_cantype {
    public static int canBeTypedWords(String text, String brokenLetters) {
        int n=brokenLetters.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            char x=brokenLetters.charAt(i);
            arr[x-'a']=1;
        }
        String[] words=text.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            String a=words[i];
            boolean consists=true;
            for(int j=0;j<a.length();j++){
                char c=a.charAt(j);
                if(arr[c-'a']==1){
                    consists=false;
                    break;
                }
            }
            if(consists)
              count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.nextLine();
        System.out.print("Enter broken letters: ");
        String brokenLetters = sc.nextLine();
        int result = canBeTypedWords(text, brokenLetters);
        System.out.println("Number of words that can be typed: " + result);
    }
}
