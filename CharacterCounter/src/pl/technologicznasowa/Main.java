package pl.technologicznasowa;

import java.util.Scanner;

import static pl.technologicznasowa.CharacterCounter.countCharacters;
import static pl.technologicznasowa.CharacterCounter.printCountedInput;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input sentence: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        printCountedInput(countCharacters(userInput));
    }

}
