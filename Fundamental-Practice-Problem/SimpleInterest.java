public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // Principal amount
        double rate = 5.0; // Annual interest rate in percentage
        double time = 3.0; // Time in years

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest for principal " + principal + " at rate " + rate + "% for " + time + " years is: " + simpleInterest);
    }
}
