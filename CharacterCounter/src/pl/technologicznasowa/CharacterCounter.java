package pl.technologicznasowa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

    public static void printCountedInput(Map<Character, Integer> characterCounter) {
        for (Map.Entry<Character, Integer> entry : characterCounter.entrySet()) {
            System.out.println("Sign: "+entry.getKey().toString()+" Count: "+entry.getValue());
        }
    }
}
