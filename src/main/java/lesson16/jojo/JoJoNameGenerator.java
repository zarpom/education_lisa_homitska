package lesson16.jojo;

import java.util.Random; //імпортуємо класс Random

/**
 * Клас `JoJoNameGenerator` генерує ім'я Джо Джо за допомогою випадкового вибору імен та прізвищ.
 */
public class JoJoNameGenerator {
    public static void main(String[] args) {
        System.out.println("Діо не зник, а що ще гірше, він почав знову створювати свою армію.\n" +
                "Запусти код, щоб дізнатись майбутнє ім'я Джо Джо!");

        // Масиви для генерації імен Джо Джо
        String[] firstNames = {"Джо", "Джон", "Джеймс", "Джек", "Джастін", "Джейсон", "Джаред", "Джордж"};
        String[] lastNames = {"Джорікевіч", "Джонсон", "Джексон", "Джастінсон", "Джейсонсон", "Джаредсон", "Джорджсон"};

        // Створення об'єкта класу Random для випадкової генерації чисел (підглянь в RandomExample щоб зрозуміти як це працює)
        Random rand = new Random();

        // Вибір випадкового імені та прізвища
        String firstName = firstNames[rand.nextInt(firstNames.length)];
        String lastName = lastNames[rand.nextInt(lastNames.length)];

        // Виведення імені Джо Джо на екран
        String jojoName = firstName + " " + lastName;
        System.out.println("Ім'я нового Джо Джо: " + jojoName);
    }
}
