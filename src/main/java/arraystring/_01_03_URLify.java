package arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength)
    {
        int copyTo = chars.length - 1;

        for (int copyFrom = trueLength - 1; copyFrom >= 0; copyFrom--)
        {
            if (chars[copyFrom] != ' ')
            {
                chars[copyTo--] = chars[copyFrom];
            }
            else
            {
                chars[copyTo] = '0';
                chars[copyTo - 1] = '2';
                chars[copyTo - 2] = '%';
                copyTo -= 3;
            }
        }

        return chars;
    }
}
