import java.util.*;

public class code_day2 {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int num = x % 10;
            x = x / 10;
            rev = rev * 10 + num;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        return (int) rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        code_day2 obj = new code_day2();
  try {
      System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = obj.reverse(n);
        System.out.println("Reversed integer: " + result);
  } catch (InputMismatchException e) {
     System.out.println("Error wrong input give from"+" "+Integer.MIN_VALUE+"to"+" "+Integer.MAX_VALUE);
     System.out.println(0);
  }
        sc.close();
    }
}

