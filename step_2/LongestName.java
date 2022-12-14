package step_2;

public class LongestName {
    public static String longestName(String[] names) {
        String longest = "";
        for (String name : names) {
            if (longest.length() < name.length()) {
                longest = name;
            }
        }
        return longest;
    }

    static String[] peopleNames = { "Can", "Dilan", "Robin" };

    public static void main(String[] args) {
        System.out.println(longestName(peopleNames));
    }

}
