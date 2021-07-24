import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    texto counterLabel = new texto("Puntos: 0");
    texto Pregunta = new texto("Pregunta: ");
    texto Respuesta1 = new texto("a) ");
    texto Respuesta2 = new texto("b) ");
    texto Respuesta3 = new texto("c) ");
    texto Respuesta4 = new texto("d) ");
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        
        prepare();
        
    }
    
    private void prepare()
    {
        Animal foca = new Animal();
        addObject(foca,795,195);
        
        addObject(counterLabel, 200,50);
        addObject(Pregunta, 200,130);
        addObject(Respuesta1,100, 275);
        addObject(Respuesta2,100,395);
        addObject(Respuesta3,375,275);
        addObject(Respuesta4,375,395);
        
    }
    
    public void act()
    {
        counterLabel.setText("Puntos: "+Animal.counter);
    }
}
