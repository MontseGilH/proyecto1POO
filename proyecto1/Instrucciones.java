import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instrucciones extends World
{
    texto instrucciones1 = new texto("Responde las siguientes preguntas");
    texto instrucciones2 = new texto("Si respondes mal, perderás una vida");
    texto instrucciones3 = new texto("Tienes tres vidas, si las pierdes, el juego se acaba");
    /**
     * Constructor for objects of class Instrucciones.
     * 
     */
    public Instrucciones()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        prepare();
    }
    private void prepare()
    {
        addObject(instrucciones1, 600,50);
        addObject(instrucciones2, 600,150);
        addObject(instrucciones3, 600,250);
    }
}
