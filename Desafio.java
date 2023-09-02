import java.util.Scanner;

public class Desafio {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (var inputScanner = new Scanner(System.in)) {
            float valueSalary = inputScanner.nextFloat();
            float valueAdvantages = inputScanner.nextFloat();
            float valueTaxation = 0;

            if (valueSalary >= 0 && valueSalary > 1100) {
                valueTaxation = 0.5F * valueSalary;
            } else if (valueSalary <= 2500) {
                valueTaxation = 0.10F * valueSalary;
            } else {
                valueTaxation = 0.15F * valueSalary;
            }

            float ouput = valueSalary - valueTaxation + valueAdvantages;
            System.out.println(String.format("%.2f", ouput));
        }

    }
}