package solution281to290;

import java.util.Iterator;

/**
 * Created by Liu Xinzhuo on 2015/12/21.
 */
public class Solution284 implements Iterator<Integer> {
    Integer peek;  // use to visit and store the next element
    Iterator<Integer> it;
    public Solution284(Iterator<Integer> iterator) {
        // initialize any member here.
        it = iterator;
        peek = it.hasNext()?it.next():null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer tmp = peek;
        if(it.hasNext())
            peek=it.next();
        else
            peek=null;
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return peek!=null;
    }
}
