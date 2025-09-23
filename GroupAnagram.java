import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagram(strs);
        System.out.println(result);
    }

    public static List<List<String>> groupAnagram(String[] str){

     Map<String,List<String>> map = new HashMap<>();

     for(String s:str){
     char[] chars = s.toCharArray();
     Arrays.sort(chars);
     String key = new String(chars);

     map.computeIfAbsent(key,k-> new ArrayList<>()).add(s);
     }

     return new ArrayList<>(map.values());
    }
}
