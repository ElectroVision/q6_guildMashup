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
    Snowman sM = new Snowman();
    
    /**
     * Constructor for objects of class GuildWorld. Sets size of viewable world, removes window bounds,
     * sets paint order, and calls prepare()
     * 
     */
    public GuildWorld()
    {    
        super(WIDTH, HEIGHT, 1, false); 
        setPaintOrder(Sample.class, Snowman.class, BG.class);
        prepare();
    }

    /**
     * Adds background and actors to world. Adds invisible ScrollObjects object so we can use it.
     */
    public void prepare()
    {
        bg1 = new BG();
        addObject(bg1, getWidth()/2, getHeight()/2); 
        bg2 = new BG();
        addObject(bg2, getWidth() + getWidth()/2, getHeight()/2); 
        
        addObject(ball, getWidth()/10, 318);
        
        addObject(sM, getWidth()/2, 318);
        
        scroll = new ScrollObjects();
        addObject(scroll, 0, 0);
    }
    
    /**
     * Allows actors to access scroll method from ScrollObjects. Integers casted from player character determine 
     * scroll speed. I kept the code here so that actors could be easily added in one place. 
     */
    public void useScroll(int amount)
    {
        bg1.scroll(amount);
        bg2.scroll(amount);
        sM.scroll(amount);
    }
}
