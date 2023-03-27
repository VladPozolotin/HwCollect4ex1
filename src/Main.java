import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> characters = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (!characters.containsKey(ch)) {
                    characters.put(ch, 1);
                } else {
                    Integer val = characters.get(ch);
                    characters.put(ch, val + 1);
                }
            }
        }
        Map.Entry<Character, Integer> min = null;
        Map.Entry<Character, Integer> max = null;
        for (Map.Entry<Character, Integer> entry : characters.entrySet()){
            if (min == null || min.getValue() > entry.getValue()){
                min = entry;
            }
        }
        for (Map.Entry<Character, Integer> entry : characters.entrySet()){
            if (max == null || max.getValue() < entry.getValue()){
                max = entry;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}