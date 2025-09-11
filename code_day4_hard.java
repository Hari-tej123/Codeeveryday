import java.util.*;

public class code_day4_hard {
    public String sortVowels(String s) {
        String str = "AEIOUaeiou";
        int n = s.length();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            if (str.indexOf(x) != -1) {
                list.add(x);
            }
        }

        Collections.sort(list);

        int l = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char y = s.charAt(i);
            if (str.indexOf(y) != -1) {
                sb.append(list.get(l));
                l++;
            } else {
                sb.append(y);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        code_day4_hard sol =  new  code_day4_hard();
        System.out.println("Output: " + sol.sortVowels(input));
    }
}
