import java.util.*;

public class IntersectionOfTwoArray {

    //Intersection of Two Array II

    public static void main(String[] args) {

        int num1[]={1,2,2,1};
        int num2[]={2,2};

        int[] result = intersect(num1,num2);

        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] num1, int[] num2){

        Map<Integer,Integer> map = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(int n: num1){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int n :num2){
            if(map.containsKey(n)&& map.get(n)>0){
                result.add(n);
                map.put(n,map.get(n)-1);
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
