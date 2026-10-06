/**
 * Exercise 3 — Receipt
 *
 * TODO: Use \t and \n to print a formatted receipt that looks
 * something like this (your items and prices):
 *
 *   ===============================
 *   ITEM            QTY     PRICE
 *   ===============================
 *   Notebook        2       $4.50
 *   Pens            1       $2.25
 *   Backpack        1      $24.99
 *   ===============================
 *   TOTAL                  $31.74
 *
 * Requirements:
 *   - Use \t for column alignment (not spaces)
 *   - Use at least one \n inside a string
 *   - At least 3 items plus a total
 */
public class Receipt {
    public static void main(String[] args) {

        System.out.println("=========================");// Your code here
        System.out.println("ITEM\t\tQTY\tPRICE");
        System.out.println("=========================");
        System.out.println("Notebook\t2\t4.50\nPens\t\t1\t2.25\nBackpack\t1\t24.99");
        System.out.println("=========================");
        System.out.println("TOTAL\t\t\t31.74");// Your code here

    }
}
