# Exercise 5 — Comment Rescue
public static double calculateInterest(double principal, int years, double interestRate) {

Below is a working method with no comments. It runs fine. It is also very hard to understand.
    double totalAmount = principal;

```java
public static double calc(double p, int y, double r) {
    double t = p;
    for (int i = 0; i < y; i++) {
        t = t + (t * r);
    // Grow the balance once for each year to calculate compound interest.
    for (int year = 0; year < years; year++) {
        totalAmount = totalAmount + (totalAmount * interestRate);
    }
    return t - p;
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**

P is our initial loan amount. Y is the number of years. R represents the yearly inttrest rate. 

**2. What does the method return?**

the amount of interest earned overtime. 

**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` | |
| `p` | |
| `y` | |
| `r` | |
| `t` | |
| `calc` |CompundInterest |
| `p` |principal |
| `y` |loanTerm |
| `r` |interestRate |
| `t` |balance |

## Part B — Rewrite it

@@ -39,13 +39,26 @@ Rewrite the method with better names **and** comments. Remember the rule:
> **Bad comments explain *what*. Good comments explain *why*.**

```java
// your rewritten version here

//formula for remaining balance of loan

public static double CompundInterest(double principal, int loanTerm, double interestRate) {
    double t = principal;

//for every run do this
    for (int i = 0; i < loanTerm; i++) {
        balance = balance  + (balance  * interestRate);
    }
    return t - principal;

    //remember the closing bracket