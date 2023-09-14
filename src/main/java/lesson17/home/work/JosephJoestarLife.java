package lesson17.home.work;

public class JosephJoestarLife {
    
    // Метод для визначення, чи Джозеф Джостар є легендою
    static boolean isLegend() {
        return true;
    }

    // Метод для обчислення кількості врагів, яких переміг Джозеф Джостар
    static int calculateEnemiesDefeated(int battlesWon) {
        int enemiesDefeated = battlesWon * 3; // Припускаємо, що за кожну перемогу Джозеф Джостар перемагає 3 ворогів
        return enemiesDefeated;
    }

    // Метод для перевірки, чи Джозеф Джостар є ще живим
    static boolean isAlive(boolean isAlive) {
        return isAlive;
    }

    // Метод для визначення відомого вислову Джозефа Джостара
    static String famousQuote() {
        return "Нігілізм - це єдиний вихід!";
    }

    public static void main(String[] args) {
        // Інформація про Джозефа Джостара
        int battlesWon = 20;
        boolean isAlive = true;

        // Перевірка, чи Джозеф Джостар - легенда
        boolean isLegendary = isLegend();
        System.out.println("Джозеф Джостар - легенда? " + isLegendary);

        // Обчислення кількості врагів, яких переміг Джозеф Джостар
        int enemiesDefeated = calculateEnemiesDefeated(battlesWon);
        System.out.println("Джозеф Джостар переміг " + enemiesDefeated + " ворогів.");

        // Перевірка, чи Джозеф Джостар ще живий
        boolean isStillAlive = isAlive(isAlive);
        System.out.println("Джозеф Джостар ще живий? " + isStillAlive);

        // Виведення відомого вислову Джозефа Джостара
        String quote = famousQuote();
        System.out.println("Вислів Джозефа Джостара: \"" + quote + "\"");
    }
}
