public class ValidAnagram {
    public static void main(String[] args) {
// check valid anagram
        String s = "Aameen";
        String t= "Neemaa";
       boolean result = isAnagram(s,t);
        System.out.println("Is the given both string is Amagram : "+result);
    }
    public static boolean isAnagram(String s , String t){
        s=s.toLowerCase();
        t=t.toLowerCase();
       if(s.length()!=t.length())
           return false;

       int[] freq = new int[256];

       for(char c:s.toCharArray()){
           freq[c]++;
       }

       for(char c:t.toCharArray()){
           freq[c]--;
           if(freq[c]<0){
               return false;
           }
       }
       return true;

        }

    }

