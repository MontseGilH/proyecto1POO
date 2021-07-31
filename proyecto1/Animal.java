import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class palabras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    
    
    /**
     * Act - do whatever the palabras wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void actFoca()
    {
        setImage("seal2.png");
        wait(7);
        setImage("seal.png");
        wait(7);
        
        
    }
    
    public void wait(int time)
    {
        Greenfoot.delay(time);
    }
}
