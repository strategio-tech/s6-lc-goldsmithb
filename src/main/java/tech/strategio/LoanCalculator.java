package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * Calculate the debt owed on a loan after three months,
     * paying 10% back each month.
     * 
     * @param amount the initial amount owed
     * @return remaining amount owed after three months of payment
     */
    static int getRemainingAmountIn3Months(int amount) {
        // constant variable to hold amount of months to consider - always 3
        final int months = 3;
        for (int i = months; i > 0; i--) {
            int amountPaid = amount / 10;
            amount -= amountPaid;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
