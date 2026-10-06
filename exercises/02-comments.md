public static double calculateInterest(double principal, int years, double interestRate) {

    double totalAmount = principal;

    // Grow the balance once for each year to calculate compound interest.
    for (int year = 0; year < years; year++) {
        totalAmount = totalAmount + (totalAmount * interestRate);
    }

    // Subtract the original principal to return only the interest earned.
    return totalAmount - principal;
}