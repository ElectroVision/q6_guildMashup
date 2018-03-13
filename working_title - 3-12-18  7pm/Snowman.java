import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowman extends ScrollObjects
{
    private int gravity;
    private int groundHeight = getImage().getHeight()/2 + 290;
    /**
     * Act - do whatever the Snowman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Allows actor to jump at random times a short distance in the air.
        if(getY() == groundHeight)
        { 
            if(Greenfoot.getRandomNumber(100)<5) 
            {
                gravity = -8;
                setLocation(getX(), getY() + gravity);
            }
        }
        
        //Induces "gravity" to bring the actor back down. 
        if(getY() != groundHeight)
        {
            gravity++;
            setLocation(getX(), getY() + gravity);
        }
    }    
}
