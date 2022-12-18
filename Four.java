// Suppose that the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition will be $10,500. Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.

public class Four {
    public static void main(String[] args) {
        double rate = 0.05;
        int year = 10;
        double tuition_per_year = 10000.0;
        double tuition_at_year = tuition_per_year + (tuition_per_year * (year * rate));
        System.out.println("Tution in " + year + " = " + tuition_at_year);
        double total_cost = 0;
        int year_num = 4;
        for (int i = year + 1; i <= year + year_num; i++) {
            tuition_at_year = tuition_per_year + (tuition_per_year * (i * rate));
            total_cost += tuition_at_year;
        }
        System.out.println("Total cost from year " + year + " after " + year_num + " is: " + total_cost);

    }

}
