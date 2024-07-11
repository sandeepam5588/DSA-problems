package HashMap;

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String s)
    {
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            boolean found = true;

            for (int j = 0; j < n; ++j) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return i;
            }
        }
        return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "srishrti";
        System.out.println("index: " + firstUniqueChar(s));
    }

}
