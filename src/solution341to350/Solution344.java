package solution341to350;

/**
 * Created by Liu Xinzhuo on 2016/4/24 0024.
 *
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".

 Subscribe to see which companies asked this question
 */
public class Solution344 {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
