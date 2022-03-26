package files.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

public class TextFormatter {

    private static final Pattern WORD_REGEX_PATTERN = Pattern.compile("[\\wа-яА-Я]+");
    private static final String SENTENCE_SPLIT_REGEX = "(?<=[?.!])\\s*";//что-либо
    private static final Pattern MID_WORD_HYPHEN_PATTERN = Pattern.compile("(?<=[\\wа-яА-Я])-[$\\r\\n]+(?=[\\wа-яА-Я])");

    public TextFormatter() {
    }

    public String wordsInString(String string) {
        String[] s1 = string.split("\\.");
        for (String strings : s1) {
            String[] s2 = strings.trim().split("\\s");
            if (s2.length >= 3 && s2.length <= 5) {
                return Arrays.toString(s2);
            }
        }
        return null;
    }

    public boolean searchPalindrome(String string) {
        String[] s1 = string.split("\\s");
        for (String strings : s1) {
            String reverseString = String.valueOf(new StringBuilder(strings).reverse()); //реверсирую все слова через СтрингБилдер и складываю их в reverseString
            if (reverseString.equals(strings) && isNotEmpty(reverseString) && strings.length() != 1) { // проверяю на эквивалентность, пустоту и чтобы это не была одна буква
                return true;
            }
        }
        return false;
    }


    public static List<String> getSentencesFromText(String text) {//[?.!]
        List<String> originalSentences = Arrays.asList(text.split(SENTENCE_SPLIT_REGEX));
        List<String> result = new ArrayList<>();
        for (String sentence : originalSentences) {
            Matcher mSentence = MID_WORD_HYPHEN_PATTERN.matcher(sentence);
            result.add(mSentence.replaceAll(""));
        }
        return result;
    }

    public static boolean hasBlacklistWordInString(String string, String[] blacklist) {
        for (String blWord : blacklist) {
            if (string.contains(blWord)) {
                return true;
            }
        }
        return false;
    }

//    public static int getCountWordsInString(String string) {
//        return identifyWords(string).size();
//    }
//
//    public static List<String> getPalindromes(List<String> strings) {
//        List<String> result = new ArrayList<>();
//        for (String string : strings) {
//            if (isPalindrome(string)) {
//                result.add(string);
//            }
//        }
//        return result;
//    }

//    public static boolean hasPalindromeInString(String string) {
//        for (String word : identifyWords(string)) {
//            if (isPalindrome(word)) {
//                return true;
//            }
//        }
//        return false;
//    }
//    private static List<String> identifyWords(String string) {
//        return WORD_REGEX_PATTERN.matcher(string)
//                .results()
//                .map(MatchResult::group)
//                .collect(Collectors.toList());
//    }
//
//    private static boolean isPalindrome(String string) {
//        if (string.length() < 2) {
//            return false;
//        }
//        StringBuilder sb = new StringBuilder(string);
//        return string.equalsIgnoreCase(sb.reverse().toString());
//    }
}

