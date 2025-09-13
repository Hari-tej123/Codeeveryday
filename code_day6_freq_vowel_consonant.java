import java.util.*;

public class code_day6_freq_vowel_consonant {
    public static int maxFreqSum(String s) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        HashMap<Character,Integer> constantmap=new HashMap<>();
         HashMap<Character,Integer> vowelmap=new HashMap<>();
        for(int i=0;i<n;i++){
            char x=arr[i];
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
                   vowelmap.put(x,vowelmap.getOrDefault(x,0)+1);
            else
              constantmap.put(x,constantmap.getOrDefault(x,0)+1);
        }
        int sum=0;
        int maxfreq=0;
        for (Map.Entry<Character, Integer> entry : vowelmap.entrySet()) {
            int currentFreq = entry.getValue();
            if (currentFreq > maxfreq) {
                maxfreq = currentFreq;
            }
        }
        sum+=maxfreq;
        maxfreq=0;
        for (Map.Entry<Character, Integer> entry : constantmap.entrySet()) {
            int currentFreq = entry.getValue();
            if (currentFreq > maxfreq) {
                maxfreq = currentFreq;
            }
        }
        sum+=maxfreq;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("enter a valid string:");
        s=sc.nextLine();
        int sum=maxFreqSum(s);
        System.out.println("sum of most occuring vowel and consonant is:"+sum);
    }
}