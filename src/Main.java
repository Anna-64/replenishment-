public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        System.out.println("Ваш начальный баланс:" + initialAccount + " рублей ");
        int replenishment = 1100;
        int total = initialAccount + replenishment;
        System.out.println("Ваш баланс:" + total + " рублей ");
        int balance = replenishment / 100;
        if (replenishment >= 1000) {
            System.out.println("Ваш баланс:" + balance);
        }
        int totalBalance = total + balance;
        System.out.println("Ваш итоговый баланс:" + totalBalance + " рублей ");
    }
}




