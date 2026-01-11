package src.main.java.org.example.coreapi.bigdecimal;

public class ProblemWithDoubleAndFloat {

    public static void main(String[] args) {

        double policyAmount = 100_000_000;

        int beneficiaries = 3;

        float percentageFloat = 1.0f / beneficiaries;

        double percentageDouble = 1.0 / beneficiaries;

        System.out.printf("Payout = %,.2f%n", policyAmount * percentageFloat);

        System.out.printf("Payout = %,.2f%n", policyAmount * percentageDouble);

        double totalUsingFloat = policyAmount - ((policyAmount * percentageFloat) * beneficiaries);

        System.out.printf("Total Using Float: %,.2f%n", totalUsingFloat);

        double totalUsingDouble = policyAmount - ((policyAmount * percentageDouble) * beneficiaries);

        System.out.printf("Total Using Double: %,.2f%n", totalUsingDouble);

    }

}
