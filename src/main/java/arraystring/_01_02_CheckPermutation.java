package arraystring;

import java.util.HashMap;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation
{
    boolean check(String a, String b)
    {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < a.length(); i++)
        {
            if (!counts.containsKey(a.charAt(i)))
            {
                counts.put(a.charAt(i), 0);
            }
            counts.put(a.charAt(i), counts.get(a.charAt(i)) + 1);
        }

        for (int i = 0; i < b.length(); i++)
        {
            if (!counts.containsKey(b.charAt(i))) return false;

            int charCount = counts.get(b.charAt(i));
            if (charCount == 1)
            {
                counts.remove(b.charAt(i));
            }
            else
            {
                counts.put(b.charAt(i), charCount - 1);
            }
        }
        return counts.isEmpty();
    }
}
