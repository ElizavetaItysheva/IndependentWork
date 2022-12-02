public class Main {
    public static void main(String[] args) {
        System.out.println("Самостоятельная работа");
        double number1 = 5.573;
        double number2 = 5.622;
        int number = 10;
        boolean fisrtNumber = (number1 % number) > (number2 % number);
        if (fisrtNumber) {
            System.out.println("Число " + number1 + " ближе к 10.");
        } else {
            System.out.println("Число " + number2 + " ближе к 10.");
        }
    }
}