import java.util.Scanner;

class taxcode {

    public static void main(String[] args) {
        
        int tier = 0;
        double childDiscount = 0;
        double salaryTax = 0;
        double totalTax;
        double minPayment;

        double income;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your income?");
        income = scan.nextDouble();

        double children;
        System.out.println("How many children do you have?");
        children = scan.nextDouble();

        double age;
        System.out.println("How old are you?");
        age = scan.nextDouble();

        if (income < 10000) {
            tier = 1;
            salaryTax = 0;

        }
        if (income >= 10000 && income < 25000) {
            tier = 2;
            salaryTax = income * 0.1;

        }
        if (income >= 25000 && income < 75000) {
            tier = 3;
            salaryTax = income * 0.2;

        }
        if (income >= 75000 && income < 250000) {
            tier = 4;
            salaryTax = income * 0.3;

        }
        if (income >= 250000) {
            tier = 5;
            salaryTax = income * 0.5;

        }
        if (children < 3 && children >= 1) {
            childDiscount = 1000;

        }
        else if (children >= 3) {
            childDiscount = 1000 + (children - 2) * 500;

        }

        totalTax = salaryTax - childDiscount;

        if (age <= 15) {
            totalTax = totalTax * 0.5;
            
        }
        if (age >= 16 && age <= 21) {
            totalTax = totalTax * 0.75;
            
        }
        if (age >= 22 && age <= 63) {
            totalTax = totalTax * 1.00;
            
        }
        if (age >= 64 && age <= 72) {
            totalTax = totalTax * 0.67;
            
        }
        if (age >= 73 && age <= 80) {
            totalTax = totalTax * 0.33;
            
        }
        if (age >= 81) {
            totalTax = totalTax * 0;
            
        }



        if (tier == 1) {
            minPayment = 0;
            if (minPayment > totalTax) {
                totalTax = minPayment;
            }
        }
        if (tier == 2) {
            minPayment = 500;
            if (minPayment > totalTax) {
                totalTax = minPayment;
            }
        }
        if (tier == 3) {
            minPayment = 5000;
            if (minPayment > totalTax) {
                totalTax = minPayment;
            }
        }
        if (tier == 4) {
            minPayment = 10000;
            if (minPayment > totalTax) {
                totalTax = minPayment;
            }
        }
        if (tier == 5) {
            minPayment = 25000;
            if (minPayment > totalTax) {
                totalTax = minPayment;
            }
        }

        System.out.println("Your total taxes are: $" + totalTax);

    }


}