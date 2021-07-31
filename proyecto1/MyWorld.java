import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
//musica obtenida de https://www.bensound.com
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //Greenfoot.playSound("bensound-memories.wav");
    Preguntas questions = new Preguntas();
    texto counterLabel = new texto("Puntos: 0");
    texto wrngLbl = new texto("Vidas: 3");
    texto Pregunta = new texto("Pregunta: ");
    int amountQuestion = questions.culturaSize();
    int questionNumber = 0;
    int ansNum = 0;
    int wrng = 3;
    int change = 0;
    int ansOrder = 1;
    
    RespuestaCorrecta Respuesta1 = new RespuestaCorrecta("a) ");
    RespuestaIncorrecta Respuesta2 = new RespuestaIncorrecta("b) ");
    RespuestaIncorrecta Respuesta3 = new RespuestaIncorrecta("c) ");
    RespuestaIncorrecta Respuesta4 = new RespuestaIncorrecta("d) ");
    
    private String getQuestion(int add){
        String culturaQuestion = questions.getPreguntaCultura(questionNumber);
        questionNumber += add;
        return culturaQuestion;
    }
    
    private String[] getAns(int add){
        String[] answrs = {questions.getRespuestaCultura(ansNum, 1), 
            questions.getRespuestaCultura(ansNum, 2), 
            questions.getRespuestaCultura(ansNum, 3), 
            questions.getRespuestaCultura(ansNum, 4)
        };
        ansNum += add;
        return answrs;
    }
    
    RespuestaCorrecta Repueta = new RespuestaCorrecta("a) ");
    
    private void chngQstn(){
        String qstn ="";
        int rnd = 0;
        
        if (change< RespuestaCorrecta.counter){
            removeObject(Respuesta1);
            removeObject(Respuesta2);
            removeObject(Respuesta3);
            removeObject(Respuesta4);
            qstn = getQuestion(1);
            String[] answers = getAns(1);
            Pregunta.setText(qstn);
            rnd = new Random().nextInt(answers.length);
            ansOrder = rnd;
            if (rnd == 1){
                Respuesta1 = new RespuestaCorrecta("a) " + answers[0]);
                Respuesta2 = new RespuestaIncorrecta("b) " + answers[1]);
                Respuesta3 = new RespuestaIncorrecta("c) " + answers[2]);
                Respuesta4 = new RespuestaIncorrecta("d) " + answers[3]);
                addObject(Respuesta1,100,275);
                addObject(Respuesta2,100,395);
                addObject(Respuesta3,375,275);
                addObject(Respuesta4,375,395);
            } else if (rnd == 2){
                Respuesta1 = new RespuestaCorrecta("b) " + answers[0]);
                Respuesta2 = new RespuestaIncorrecta("d) " + answers[1]);
                Respuesta3 = new RespuestaIncorrecta("c) " + answers[2]);
                Respuesta4 = new RespuestaIncorrecta("a) " + answers[3]);
                addObject(Respuesta4,100,275);
                addObject(Respuesta1,100,395);
                addObject(Respuesta2,375,275);
                addObject(Respuesta3,375,395);
            } else if (rnd == 3){
                Respuesta1 = new RespuestaCorrecta("c) " + answers[0]);
                Respuesta2 = new RespuestaIncorrecta("d) " + answers[1]);
                Respuesta3 = new RespuestaIncorrecta("a) " + answers[2]);
                Respuesta4 = new RespuestaIncorrecta("b) " + answers[3]);
                addObject(Respuesta3,100,275);
                addObject(Respuesta4,100,395);
                addObject(Respuesta1,375,275);
                addObject(Respuesta2,375,395);
            } else if (rnd == 4){
                Respuesta1 = new RespuestaCorrecta("d) " + answers[0]);
                Respuesta2 = new RespuestaIncorrecta("a) " + answers[1]);
                Respuesta3 = new RespuestaIncorrecta("b) " + answers[2]);
                Respuesta4 = new RespuestaIncorrecta("c) " + answers[3]);
                addObject(Respuesta2,100,275);
                addObject(Respuesta3,100,395);
                addObject(Respuesta4,375,275);
                addObject(Respuesta1,375,395);
            }
            
            change += 5;
            
        } 
            else{
                qstn = getQuestion(0);
                Pregunta.setText(qstn);
        }
    }
    
    
    
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
        addObject(wrngLbl, 325, 50);
        addObject(Pregunta, 350,130);
        addObject(Respuesta1,100, 275);
        addObject(Respuesta2,100,395);
        addObject(Respuesta3,375,275);
        addObject(Respuesta4,375,395);
        
    }
    
    public void act()
    {
        
        counterLabel.setText("Puntos: "+RespuestaCorrecta.counter);
        wrngLbl.setText("Vidas: " + RespuestaIncorrecta.counter);
        chngQstn();
        //int posicion = Preguntas.culturaSize();
        //int pregunt = Greenfoot.getRandomNumber(posicion);
        //boolean ef = false;
        
    }
}
