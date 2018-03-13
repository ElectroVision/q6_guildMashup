import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sample here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sample extends Actor
{
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

    /**
     * Checks for user input. "A" for left, "B" for right, and "SPACE" for jump.
     */
    private void keyPress()
    {
        int leftEdge = 0;
        int rightEdge = getWorld().getWidth();
        //checkGravity();
        GuildWorld gW = (GuildWorld) getWorld();
        
        /*
         * Delete following if/else statement and if statement after, then reenable everything else to use
         * free left/right movement in window. 
         */
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
        
        /*
         * Used for when player can freely move in window 
         
        if(getX() <= imgWidth)
        {
            setLocation(leftEdge + imgWidth + 1, getY()); //Left window boundary 
            gW.useScroll(5); //When reaching window boundary, moves background to the right
        }
        else
        */
        {
            if(Greenfoot.isKeyDown("a"))
            {
                //setLocation(getX() -5  , getY());//Enable for movement in window
                gW.useScroll(5); //Scrolls background to the right
            }
        }

        /*
         * Used for when player can freely move in window
        
        if(getX() >= rightEdge - imgWidth)
        {
            setLocation(rightEdge - imgWidth -1, getY()); //Right window boundary 
            gW.useScroll(-5); //When reaching window boundary, moves background to the left
        }
        else
        */
        {
            if(Greenfoot.isKeyDown("d"))
            {
                //setLocation(getX() + 5 , getY()); ////Enable for movement in window
                gW.useScroll(-5); //Scrolls background to the left
            }
        }
    }

    
    /* *
     * Checks if timer has reached 0. If not, timer counts down. If so, checks if user is "on the ground". 
     * If so, checks if space bar is pressed. If it is, Y movement equals the gravity variable. If not "on
     * the ground", gravity variable increases, and sets Y movement to gravity variable. 
     */
    /*
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
    */
   
}
