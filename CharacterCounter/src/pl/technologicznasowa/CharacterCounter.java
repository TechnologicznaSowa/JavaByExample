package pl.technologicznasowa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter {

    private CharacterCounter() {}

    public static Map<Character, Integer> countCharacters(String userInput) {
        if(userInput == null || userInput.isEmpty()) return Collections.emptyMap();

        Map<Character, Integer> characterCounter = new HashMap<>();
        for (char c : userInput.toCharArray()) {
            Integer value = characterCounter.get(c);
            if (value != null) {
                value++;
            } else {
                value = 1;
            }
            characterCounter.put(c,value);
        }

        return characterCounter;
    }

	public static Map<Character, Long> countCharactersStream(String userInput) {
		return userInput.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

    public static void printCountedInput(Map<Character, ? extends Number> characterCounter) {
        for (Map.Entry<Character, ? extends Number> entry : characterCounter.entrySet()) {
            System.out.println("Sign: "+entry.getKey().toString()+" Count: "+entry.getValue());
        }
    }
}
