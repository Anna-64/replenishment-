public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;// Первоначальная сумма//
        System.out.println("Ваш начальный баланс:" + initialAccount + " рублей ");
        int replenishment = 100;// Сумма пополнения//
        System.out.println("Сумма пополнения" + replenishment + " рублей ");
        int total = initialAccount + replenishment;// Итоговый баланс //
        if (replenishment >= 1000) {
            int bonusСalculation = replenishment / 100; //Расчет бонуса//
            System.out.println("Количество бонусов:" + bonusСalculation + " бонусных рублей ");
            int totalBonus = total + bonusСalculation;//Итоговый баланс с учетом бонусов//
            System.out.println("Ваш баланс с учетом бонусов составляет:" + totalBonus + " рублей ");
        } else {
            System.out.println("Ваш баланс составляет:" + total + " рублей ");
        }
    }
}




