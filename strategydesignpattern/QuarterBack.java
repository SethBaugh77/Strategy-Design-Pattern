package strategydesignpattern;

import java.util.Random;
/**
 * QuarterBack class that represents a football position
 * @author Seth Baugh
 */
public class QuarterBack extends Player {
	/**
	 * Creates a quarterback with the intended name
	 * @param _name Name of the Quarterback
	 */
     public QuarterBack(String _name) {
		super(_name);
        setOffenseBehavior();
        setDefenseBehavior();
	}

	

	@Override
	/**
	 * Sets defenseBehavior to null
	 */
	public void setDefenseBehavior() {
       
		
	}

	@Override
	/**
	 * Sets OffenseBehavior to either passBehavior RunBehavior
	 */
	public void setOffenseBehavior() {
        Random Random = new Random();
		int rand = Random.nextInt();
		if(rand >= 0)
        offenseBehavior = new PassBehavior();
        if(rand < 0)
        offenseBehavior = new RunBehavior();
        
		
	}

	
}
