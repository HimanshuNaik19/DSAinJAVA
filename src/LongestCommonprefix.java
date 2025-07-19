public class LongestCommonprefix {
    public String CommonPrefix(String[] s){
        if (s == null || s.length == 0) {
            return "";
        }
        String pre= s[0];
        for(int i=0;i<=s.length ;i++){
            while(s[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
                if(pre.isEmpty()){
                    return "";
                }
            }
        }
        return pre;
    }
}
