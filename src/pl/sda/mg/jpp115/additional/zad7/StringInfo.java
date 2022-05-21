package pl.sda.mg.jpp115.additional.zad7;

public class StringInfo {
    private final String text;

    private final static char[] VOWELS = {'a', 'e', 'i'};
    private final static char[] CONSONANTS = {'b', 'c', 'd'};

    public StringInfo(String text) {
        this.text = text;
    }

    public void printCharactersCount() {
        CharacterCount[] characterCounts = new CharacterCount[text.length()];
        int characterCountsIndex = 0;
        for (char character : text.toCharArray()) {
            CharacterCount characterCount = getCharacterCountOrNull(characterCounts, character);
            if (characterCount != null) {
                characterCount.increment();
            } else {
                characterCount = new CharacterCount(character);
                characterCounts[characterCountsIndex] = characterCount;
                characterCountsIndex++;
            }
        }

        for (CharacterCount characterCount : characterCounts) {
            if (characterCount != null) {
                System.out.println(characterCount);
            }
        }
    }

    private CharacterCount getCharacterCountOrNull(CharacterCount[] characterCounts, char character) {
        for (CharacterCount characterCount : characterCounts) {
            if (characterCount != null && characterCount.getCharacter() == character) {
                return characterCount;
            }
        }

        return null;
    }

    public boolean isPalindrom() {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public void printReverse() {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    public String firstAndLastLetterUpperCase() {
        String firstLetter = text.substring(0, 1);
        String lastLetter = text.substring(text.length() - 1);
        String other = text.substring(1, text.length() - 1);
        return firstLetter.toUpperCase() + other + lastLetter.toUpperCase();
    }

    public String getUpperCaseText() {
        return text.toUpperCase();
    }

    public int calculateConsonantCount() {
        int consonantCount = 0;
        for (char character : text.toCharArray()) {
            if (isConsonant(character)) {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    public int calculateVowelCount() {
        int vowelCount = 0;
        for (char character : text.toCharArray()) {
            if (isVowel(character)) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    private boolean isConsonant(char character) {
        for (char consonant : CONSONANTS) {
            if (character == consonant) {
                return true;
            }
        }

        return false;
    }

    private boolean isVowel(char character) {
        for (char vowel : VOWELS) {
            if (character == vowel) {
                return true;
            }
        }

        return false;
    }
}
