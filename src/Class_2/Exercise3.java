package Class_2;

// Exercise 3 - From PDF found on Moodle.
public class Exercise3 {

    public static void main(String[] args) {

        int currentYear = 2021;
        int birthYear = 1972;
        int yearSpan = currentYear - birthYear;
        int months = yearSpan * 12;
        int days = yearSpan * 365;

        System.out.println("Difference in years  = " + yearSpan);
        System.out.println("Difference in months = " + months);
        System.out.println("Difference in days   = " + days);
    }

}
