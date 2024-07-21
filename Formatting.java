public class Formatting {
    public static void main(String[] args) {
        double amt = 1234.56789;
        String firstName = "YourFirstName";
        String lastName = "YourLastName";
        int birthDay = 21;
        String birthMonth = "July";
        int birthYear = 2000;

        System.out.printf("The amount is $%,.2f%n", amt);
        System.out.printf("My name is %s %s and I was born on %s %d, %d%n", firstName, lastName, birthMonth, birthDay, birthYear);
        System.out.printf("%s %s - %7d%n", firstName, lastName, birthYear);
    }
}
