public class Haystack {
    public int strStr(String haystack, String needle) {
        /* return haystack.indexOf(needle); */
        if(needle.isEmpty()){
            return 0;
        }
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        Haystack hs = new Haystack();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(hs.strStr(haystack, needle));
    }
}
