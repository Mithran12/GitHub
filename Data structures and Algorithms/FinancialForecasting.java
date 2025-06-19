import java.util.HashMap;
import java.util.Scanner;

public class FinancialForecasting {

    public static double fvRec(double pv, double r, int y) {
        if (y == 0) return pv;
        return fvRec(pv, r, y - 1) * (1 + r);
    }

    public static double fvMemo(double pv, double r, int y, HashMap<Integer, Double> memo) {
        if (y == 0) return pv;
        if (memo.containsKey(y)) return memo.get(y);
        double val = fvMemo(pv, r, y - 1, memo) * (1 + r);
        memo.put(y, val);
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Present Value: ");
        double pv = sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double r = sc.nextDouble() / 100;

        System.out.print("Enter Years: ");
        int y = sc.nextInt();

        double res1 = fvRec(pv, r, y);
        System.out.printf("Recursion Result: ₹%.2f\n", res1);

        double res2 = fvMemo(pv, r, y, new HashMap<>());
        System.out.printf("Memoized Result: ₹%.2f\n", res2);

        sc.close();
    }
}
