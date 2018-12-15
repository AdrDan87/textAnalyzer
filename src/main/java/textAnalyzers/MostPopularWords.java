package textAnalyzers;

import java.util.*;
import java.util.stream.Collectors;

public class MostPopularWords implements Analyser {
    @Override
    public String analyze(String text) {
        String[] toLowerCaseOnlyLetters = text.toLowerCase().replaceAll("[^a-z]+", " ").split(" ");

        Map<String, Long> output = Arrays.stream(toLowerCaseOnlyLetters).collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        List<Map.Entry<String,Long>> result = output.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(10).collect(Collectors.toList());
        StringBuffer out = new StringBuffer();
        for (int i = 0; i < result.size(); i++) {
            out.append(result.get(i));
            out.append(' ');
        }
        return out.toString();
        }
    }

