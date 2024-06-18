package Task2;

public class Main {
    public static void main(String[] args) {
        phoneDictionaryExample();
    }
    public static void phoneDictionaryExample() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add("Петров", "+71111112233");
        phoneDictionary.add("Петров", "+71111112233");
        phoneDictionary.add("Иванов", "+71111110000");
        phoneDictionary.add("Иванов", "+71111119001");

        String[] tests = {"Петров", "Иванов", "Сидоров" };
        for (String familyName : tests) {
            if (phoneDictionary.get(familyName) != null)
            {
                System.out.printf("По фамилии %s было найдено: %s%n", familyName, phoneDictionary.get(familyName));
            }
            else {
                System.out.printf("По фамилии %s ничего не было найдено%n", familyName);
            }
        }
    }
}
