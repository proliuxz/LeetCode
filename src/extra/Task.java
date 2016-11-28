package extra;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 10/18/2016.
 * 2. Task那道题，很多面经都提到过。就是比如给你一串task，再给一个cooldown，执行每个task需要时间1，两个相同task之间必须至少相距cooldown的时间，问执行所有task总共需要多少时间。比如执行如下task：12323，假设cooldown是3。总共需要的时间应该是 1 2 3 _ _ 2 3，也就是7个单位的时间。再比如 1242353，假设cool down是4，那总共时间就是 1 2 4 _ _ _ 2 3 5 _ _ _ 3，也就是13个单位的时间。
 */
public class Task {
    public int taskSolver(String task, int coolDown)
    {
        int time = task.length();
        if (task==null||task.length()==0)
            return 0;
        if (coolDown==0)
            return time;
        HashMap hashMap = new HashMap<Character, Integer>();
        int add = 0;
        for (int i = 0; i <task.length() ; i++)
        {
            char temp = task.charAt(i);
            if (!hashMap.containsKey(temp))

            {
                hashMap.put(temp, i + add);
            }
            else
            {
                int len = i + add - (int) hashMap.get(temp);
                System.out.println(i+";"+len);
                if (len<coolDown+1)
                {
                    add += coolDown+1 - len;
                }
                hashMap.put(temp,i+add);
            }
        }
        return time+add;
    }
    public static void main(String[] args)
    {
        String tasks = "1242353" ;
        int coolDown = 4;
        Task task = new Task();
        System.out.println(task.taskSolver(tasks,coolDown));
    }
}
