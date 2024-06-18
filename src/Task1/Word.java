package Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Word {

    public static Set<String> getUniqueWords(String[] notUniqueWords) {
        HashMap<String, Integer> preparedHashMap = getWordUsageStatistic(notUniqueWords);
        Stream<Map.Entry<String, Integer>> hashMapStream = preparedHashMap.entrySet().stream();
        hashMapStream = hashMapStream.filter(entry -> entry.getValue() == 1);
        Stream<String> filteredWordsStream = hashMapStream.map(Map.Entry::getKey);
        Set<String> filteredWords = filteredWordsStream.collect(Collectors.toSet());
        return filteredWords;
    }

    public static HashMap<String, Integer> getWordUsageStatistic(String[] notUniqueWords) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : notUniqueWords) {
            Integer count = hashMap.get(word);
            if (count == null)
            {
                hashMap.put(word, 1);
            }
            else {
                hashMap.put(word, count + 1);
            }
        }
        return hashMap;
    }
}