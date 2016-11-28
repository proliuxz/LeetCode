/**
 * Created by Xinzhuo on 2016/11/15 0015.
 */
public class E51DuplicationInArray {
    public boolean duplicate(int[] arr){
        if(arr== null || arr.length <= 0){
            return false;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < 0 || arr[i] > arr.length-1)
                return false;
        }
        int flag = 0;
        for(int i = 0;i<arr.length;i++){
            while(arr[i] != i){
                if(arr[i] == arr[arr[i]]){
                    System.out.println(flag++);
                    return true;
                }
                else{
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                    System.out.println(flag++);
                }
            }
        }

        return false;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,5,0,1,1};
        E51DuplicationInArray test = new E51DuplicationInArray();
        System.out.println(test.duplicate(arr));
    }
}
