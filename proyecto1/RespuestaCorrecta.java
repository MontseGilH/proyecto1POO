import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;  // importa color

/**
 * Write a description of class texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RespuestaCorrecta extends Actor
{
    public static int counter = 0;
    private Animal animalFoca;
    public RespuestaCorrecta(String text)
    {
        GreenfootImage img = new GreenfootImage(text.length()*20, 50);
        //img.setColor(Color.GREEN);
        img.drawString(text,2,20);
        setImage(img);
    
    }
    
    public void setText(String text)
    {
        GreenfootImage img = getImage();
        img.clear();
        img.drawString(text,2,20);
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
        {
            
            //Animal newAnimal = new Animal();
            //newAnimal.actFoca();
           
            counter = counter + 5;
            
        }
    }
    
    public static int getcounter()
    {
        return counter;
    }
}
