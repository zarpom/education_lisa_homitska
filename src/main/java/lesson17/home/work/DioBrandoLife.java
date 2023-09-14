package lesson17.home.work;

public class DioBrandoLife {
    
    // Метод для визначення, чи Діо Брандо володіє здатністю Заволодіння
    static boolean hasTheWorldAbility(boolean isVampire) {
        return isVampire;
    }

    // Метод для обчислення кількості людей, яких перетворив у вампірів Діо Брандо
    static int calculateVampireConversions(int victims) {
        return victims * 2; // Припускаємо, що він перетворює кожну жертву у двох вампірів
    }

    // Метод для визначення, чи Діо Брандо найважливіший персонаж аніме
    static boolean isTheMainCharacter(boolean isMainAntagonist) {
        return !isMainAntagonist;
    }

    // Метод для жартів про Діо Брандо
    static String dioJokes() {
        return "Ігноруйте Діо! Якщо не звертати на укуси на жопі - це ігнор!";
    }

    public static void main(String[] args) {
        // Інформація про Діо Брандо
        boolean isVampire = true;
        int victims = 10;
        boolean isMainAntagonist = true;

        // Перевірка, чи Діо Брандо володіє здатністю Заволодіння
        boolean hasTheWorld = hasTheWorldAbility(isVampire);
        System.out.println("Діо Брандо володіє Заволодінням? " + hasTheWorld);

        // Обчислення кількості людей, яких перетворив у вампірів Діо Брандо
        int vampireConversions = calculateVampireConversions(victims);
        System.out.println("Діо Брандо перетворив " + vampireConversions + " людей у вампірів.");

        // Перевірка, чи Діо Брандо найважливіший персонаж аніме
        boolean isMainCharacter = isTheMainCharacter(isMainAntagonist);
        System.out.println("Діо Брандо найважливіший персонаж аніме? " + isMainCharacter);

        // Виведення жартів про Діо Брандо
        String jokes = dioJokes();
        System.out.println("Жарт: " + jokes);
    }
}
