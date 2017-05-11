package solution251to300;

/**
 * Created by Liu Xinzhuo on 2015/9/15.
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

 Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

 You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class Solution278 {
    public int firstBadVersion(int n) {
        if(n==1)
        {
            if(isBadVersion(1)==true)
                return 1;
            else
                return 0;
        }
        return firstBadVersionHelper(1,n);
    }
    public int firstBadVersionHelper(int left, int right)
    {
        if (left==right)
            return left;
        int mid = left/2+right/2;
        if (isBadVersion(mid))
        {
            return firstBadVersionHelper(left,mid);
        }
        else
            return firstBadVersionHelper(mid+1,right);
    }
    public boolean isBadVersion(int version)
    {
        if(version>=1702766719)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        Solution278 s278 = new Solution278();
        System.out.println(s278.firstBadVersion(2126753390));
    }
}
