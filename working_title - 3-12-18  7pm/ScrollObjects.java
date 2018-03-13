import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollObjects extends Actor
{
    /**
     * Act - do whatever the ScrollObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //No acting necessary, yet
    }    

    /**
     * Determines scroll movement and tiling for subclasses of ScrollObjects superclass. 
     */
    public void scroll(int newX)
    {
        // For tiling objects to the right, while scrolling left
        if (getX() < -getImage().getWidth()/2)
        {
            setLocation(getX()+ getWorld().getWidth()*2, getY());
        }
        
        // For tiling objects to the left, while scrolling scrolls right
        if (getX() >= getWorld().getWidth() + getImage().getWidth()/2)
        {
            setLocation(getX() - getWorld().getWidth()*2, getY());
        }
        
        setLocation(getX() + newX, getY()); // Moves objects 
    }
}
