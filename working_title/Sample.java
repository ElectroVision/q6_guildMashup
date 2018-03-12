import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sample extends Actor
{
    private int xMove = 0;
    private int yMove = 0;
    private int groundHeight = getImage().getHeight()/2 + 290;
    private int imgHeight = getImage().getHeight();
    private int imgWidth = getImage().getWidth()/2;
    private int gravity;
    private int timer = 0;

    /**
     * Act - do whatever the Sample wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyPress();
    } 

    private void keyPress()
    {
        int leftEdge = 0;
        int rightEdge = getWorld().getWidth();
        checkGravity();
        GuildWorld gW = (GuildWorld) getWorld();

        if(getX() <= imgWidth)
        {
            setLocation(leftEdge + imgWidth + 1, getY());
            gW.useScroll(5);
        }
        else
        {
            if(Greenfoot.isKeyDown("a"))
            {
                //setLocation(getX() -5  , getY());
                gW.useScroll(5);
            }
        }

        if(getX() >= rightEdge - imgWidth)
        {
            setLocation(rightEdge - imgWidth -1, getY());
            gW.useScroll(-5);
        }
        else
        {
            if(Greenfoot.isKeyDown("d"))
            {
                //setLocation(getX() + 5 , getY());
                gW.useScroll(-5);
            }
        }
    }

    private void checkGravity()
    {
        if(timer==0)
        {
            if(getY() == groundHeight)
            { 
                if(Greenfoot.isKeyDown("space")) 
                {
                    gravity = -20;
                    setLocation(getX(), getY() + gravity);
                    timer=50;
                }
            }
        }
        else
        {
            timer--;
        }

        if(getY() != groundHeight)
        {
            gravity++;
            setLocation(getX(), getY() + gravity);
        }
    }
}
