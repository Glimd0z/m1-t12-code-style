import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        DepositCalculator depositCalculator = new DepositCalculator();
        depositCalculator.calculateProfitFromDeposite();
    }

    double calculateComplexPercent(double depositAmount, double yearRate, int depositPeriod) {
        double currentDeposit = depositAmount * Math.pow((1 + yearRate / 12), 12 * depositPeriod);
        return round(currentDeposit, 2);
    }

    double calculateSimplePercent(double depositAmount, double yearRate, int depositPeriod) {
        return round(doubleAmount + doubleAmount * yearRate * depositPeriod, 2);
    }

    double round(double value, int exponent) {
        double scale = Math.pow(10, exponent);
        return Math.round(value * scale) / scale;
    }

    void calculateProfitFromDeposite() {

        Scanner scaner = new Scanner(System.in);

        double yearRate = 0.06;
        double profitFromDeposit = 0;

        int depositType;
        int depositAmount;
        int depositPeriod;

        System.out.println("Введите сумму вклада в рублях:");
        depositAmount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        depositPeriod = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        depositType = scanner.nextInt();

        if (depositType == 1) {
            profitFromDeposit = calculateSimplePercent(depositAmount, yearRate, depositPeriod);
        } else if (depositType == 2) {
            profitFromDeposit = calculateComplexPercent(depositAmount, yearRate, depositPeriod);
        }

        System.out.println("Результат вклада: "
                + depositAmount + " за "
                + depositPeriod + " лет превратятся в "
                + profitFromDeposit);
    }
}
