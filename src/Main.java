public class Main {
    public static void main(String[] args) {

        int theAmountOnTheAccount = 100;
        int depositAmount = 1100;


        int bonus;
        if (depositAmount > 1000) {

        bonus = depositAmount / 100;

        } else bonus = 0;

        int total;
        total = theAmountOnTheAccount + depositAmount + bonus;
        System.out.println("Ваш бонус ");
        System.out.println((bonus));
        System.out.println("Итого:");
        System.out.println((total));
    }
}
