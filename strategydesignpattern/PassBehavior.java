package strategydesignpattern;

import java.util.Random;


/**
 * Class Pass Behavior that implements OffenseBehavior
 * @author Seth Baugh
 */
public class PassBehavior implements OffenseBehavior {

    @Override
    /**
     * Method that randomly selects a passing play
     * @return A string representation of a passing play
     */
    public String play() {
        Random Random = new Random();
        int rand = Random.nextInt();
        rand = rand % 10;
		if(rand <= -6)
        return "throws a hail mary";
        else if(rand >= -5 && rand <= -2)
        return "throws a screen pass";
        else if(rand >= -1 && rand <= 2)
        return "throws a seem route";
        else if(rand >= 3 && rand <= 6)
        return "throws an out route";
        else
        return "throws a slant route"; 
    }
    
}