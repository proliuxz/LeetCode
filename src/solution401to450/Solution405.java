package solution401to450;

/**
 * Created by Xinzhuo Liu on 10/19/2016.
 * 405. Convert a Number to Hexadecimal   QuestionEditorial Solution  My Submissions
 Total Accepted: 6226
 Total Submissions: 14998
 Difficulty: Easy
 Contributors: Admin
 Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

 Note:

 All letters in hexadecimal (a-f) must be in lowercase.
 The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
 The given number is guaranteed to fit within the range of a 32-bit signed integer.
 You must not use any method provided by the library which converts/formats the number to hex directly.
 Example 1:

 Input:
 26

 Output:
 "1a"
 Example 2:

 Input:
 -1

 Output:
 "ffffffff"
 */
public class Solution405 {
    public String toHex(int num) {
        return Integer.toHexString(num);
    }
}
