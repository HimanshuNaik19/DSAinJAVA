public class ClimbingStairs {
    public int climbingStairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int first =1;
        int second = 2;
        for(int i=3;i<=n;i++){
            int third = first +second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 9;
        System.out.println(cs.climbingStairs(n));
    }
}
