import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuildWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuildWorld extends World
{
    public static final int HEIGHT = 400;
    public static final int WIDTH = 800;
    private BG bg1, bg2;
    private ScrollObjects scroll;
    Sample ball = new Sample();
    /**
     * Constructor for objects of class GuildWorld.
     * 
     */
    public GuildWorld()
    {    
        super(WIDTH, HEIGHT, 1, false); 
        setPaintOrder(Sample.class, BG.class);
        prepare();
    }

    public void prepare()
    {
        bg1 = new BG();
        addObject(bg1, getWidth()/2, getHeight()/2); 
        bg2 = new BG();
        addObject(bg2, getWidth() + getWidth()/2, getHeight()/2); 
        addObject(ball, getWidth()/2, 318);
        scroll = new ScrollObjects();
        addObject(scroll, 0, 0);
    }
    
    public void useScroll(int amount)
    {
        bg1.scroll(amount);
        bg2.scroll(amount);
    }
    
    bens
}
