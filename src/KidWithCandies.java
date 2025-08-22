import java.util.ArrayList;
import java.util.List;

public class KidWithCandies {
    public List<Boolean> kidWithCandies(int[] candies, int extracandies){
        List<Boolean> result = new ArrayList<>();
        int  maxCandies = 0;
        for( int candy : candies){
           if(candy > maxCandies) maxCandies = candy;
        }
        for(int candy : candies){
             result.add(candy + extracandies >=  maxCandies);
        }
        return result;
    }
}
