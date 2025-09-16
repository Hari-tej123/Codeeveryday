import java.util.*;

public class code_day9_NONCOPRIME {
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            stack.push(nums[i]);

            while (stack.size() > 1) {
                int x = stack.pop();
                int y = stack.pop();
                int c = gcd(x, y);

                boolean noncoprime;
                if (c == 1) {
                    noncoprime = false;
                } else {
                    noncoprime = true;
                }

                if (noncoprime == true) {
                    int z = LCM(x, y);
                    stack.push(z);
                } else {
                    stack.push(y);
                    stack.push(x);
                    break;
                }
            }
        }
        return new ArrayList<>(stack);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int x, int y) {
        return x / gcd(x, y) * y; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result =replaceNonCoprimes(nums);

        System.out.println("Output: " + result);
    }
}

