import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    static int fact (int n)
    {
        if (n == 0) // Base Case.
        {
            return 1;
        }

        int ans = fact(n - 1);
        return (n * ans);
    }
}
