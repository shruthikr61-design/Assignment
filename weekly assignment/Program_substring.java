import java.util.ArrayList;

public class Program_substring {

    // Method to find all substrings
    static ArrayList<String> findSubstrings(String str) {

        ArrayList<String> substrings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                // Add substring from index i to j - 1
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }

    public static void main(String[] args) {

        String str = "ABC";

        ArrayList<String> substrings = findSubstrings(str);

        System.out.println("All substrings:");

        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}