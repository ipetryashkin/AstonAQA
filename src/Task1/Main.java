package Task1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] exampleNotUniqueWords = {
                "Мама",
                "Папа",
                "Брат",
                "Сестра",
                "Сестра",
                "Дедушка",
                "Бабушка",
                "Сын",
                "Внук",
                "Дядя",
                "Тетя",
                "Папа",
                "Сестра",
                "Внук",
                "Мама",
                "Папа",
                "Прабабушка",
                "Мама",
                "Мама",
        };

        wordsExample(exampleNotUniqueWords);
    }

    public static void wordsExample(String[] words) {
        System.out.println(System.lineSeparator());
        System.out.println("Task1.Word usage statistics:");
        for (Map.Entry<String, Integer> entry : Word.getWordUsageStatistic(words).entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println(System.lineSeparator());
        System.out.println("List of unique words:");
        for (String uniqueWord : Word.getUniqueWords(words)) {
            System.out.println(uniqueWord);
        }
    }
}