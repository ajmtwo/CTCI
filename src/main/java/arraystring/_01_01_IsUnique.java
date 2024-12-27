package arraystring;

import java.util.HashSet;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique
{

    boolean isUnique(String str)
    {
        HashSet<Character> foundChars = new HashSet<>();
        for (int i = 0; i < str.length(); i++)
        {
            if (foundChars.contains(str.charAt(i))) return false;
            foundChars.add(str.charAt(i));
        }
        return true;
    }

}
