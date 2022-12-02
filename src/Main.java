public class Main {
    public static void main(String[] args) {
        System.out.println("Самостоятельная работа~");
        double number1 = 5.573;
        double number2 = 5.556;
        boolean fisrtNumber = (number1 % 10.0) > (number2 % 10.0);
        if (fisrtNumber) {
            System.out.println("Число " + number1 + " ближе к 10.");
        } else {
            System.out.println("Число " + number2 + " ближе к 10.");
        }
    }
}