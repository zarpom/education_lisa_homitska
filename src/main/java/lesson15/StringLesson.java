package lesson15;

import java.io.*;

public class StringLesson {
    public static void main(String[] args) {
//        System.out.println("Its just a cigarette"); // це строчка
//        String text  = "I love cola and chipusu";
//        System.out.println(text);
//
//        String login = "Vasia1488";
//
//        System.out.println("Hello, dear " + login);

//        String name = "Elisaveta";
//        name = name.toUpperCase();// незмінний тип, тобто бере
//        // за основу стару строчку
//        // робить строчку з великими буквами і присвоює старій
//        System.out.println(name);
//        System.out.println(name.toLowerCase());//повертає нову строчку
//        System.out.println(name);
//        name = name.toLowerCase();
//        System.out.println(name);

//        String[] names = {"олег", "Єлизавета", "Наталія",
//                "Борис", "Наталія", "12"};
//
//        String name = "Олег";
//
//        for (int i = 0; i < names.length; i++) {
//            if (name.toUpperCase().equals(names[i].toUpperCase())) {
//                System.out.println("Людина " + name + " є в списку!!");
//            }
//        }


//        String text = " menu-categories__item-ng-star-insert1ed_1 " +
//                " menu-categories__item-ng-star-inserte1d_2123" +
//                " menu-categories__item-ng-star-insertded_34";
////        String newText = text.replace("menu-categories__item-ng-star-inserted","товар");
//
//        text = text.replaceAll("[a-z_-]+","товар");
//
//
//        System.out.println(text);


        String fileName = "src/main/java/lesson15/text.txt";
        String sourceText  = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                 sourceText+=line + System.lineSeparator();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



//        String sourceText = "Мене звуть Поліна я люблю їсти печиво та гулять на повітрі";

//        String[] words = sourceText.split(" ");
//        String result = "";
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].equals("для")) {
//                result += "бля" + " ";
//            } else {
//                result += words[i] + " ";
//            }
//        }
//        System.out.println(result);
        sourceText =  sourceText.replace("себе","гівнюка" );
        //  Поліна = ***
        //  Люблю = їм
        //  дім = собача будка

        // шлях до файлу з словником
        // шлях до файлу з текстом



        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/lesson15/порошенко.txt"))) {
            String textToWrite = sourceText;
             writer.write(textToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
