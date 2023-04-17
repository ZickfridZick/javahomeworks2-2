public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для начального счёта и суммы пополнения
        int initialBalance = 100; // Начальный счёт клиента
        int replenishmentAmount = 1100; // Сумма пополнения

        // Объявляем переменную для хранения суммы бонуса
        int bonusAmount = 0;

        // Проверяем, превысила ли сумма пополнения порог в 1000 рублей
        if (replenishmentAmount > 1000) {
            // Если да, то рассчитываем количество бонусных рублей
            bonusAmount = (replenishmentAmount / 100) - 10;
            // Округляем количество бонусных рублей до целого числа
            bonusAmount = (int) Math.floor(bonusAmount);
        }

        // Увеличиваем начальный счёт на сумму пополнения и добавляем бонусы
        int finalBalance = initialBalance + replenishmentAmount + bonusAmount;

        // Выводим результат на экран
        System.out.println("Начальный счёт: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + replenishmentAmount + " рублей");

        // Проверяем, были ли начислены бонусы, и выводим результат
        if (bonusAmount > 0) {
            System.out.println("Бонусы: " + bonusAmount + " рублей");
        }

        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
    }
}
