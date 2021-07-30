/**
 * Aquí se almacenan todas las preguntas junto a sus respuestas
 * 
 * @author Montserrat
 * @version (a version number or a date)
 */
public class Preguntas  
{
    // instance variables - replace the example below with your own
    private static final String[][] ciencias = {
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        
    };
    private static final String[][] matematicas = {
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        
    };
    private static final String[][] musica = {
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        
    };
    private static final String[][] culturaGeneral = {
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        {"¿Cual es la?","rB","r2","r3","r4"},
        
    };
    //conseguir el largo de cada grupo de preguntas para saber cual es el máximo de preguntas que se pueden hacer
    public static int cienciasSize()
    {
        return ciencias.length;
    }
    public static int mateSize()
    {
        return matematicas.length;
    }
    public static int musicaSize()
    {
        return musica.length;
    }
    public static int culturaSize()
    {
        return culturaGeneral.length;
    }
    
    //Conseguir preguntas de cada tema, se necesita un número
    public static String getPreguntaCiencias(int n)
    {
       return ciencias[n][0]; 
    }
    public static String getPreguntaMate(int n)
    {
       return matematicas[n][0]; 
    }
    public static String getPreguntaMusica(int n)
    {
       return musica[n][0]; 
    }
    public static String getPreguntaCultura(int n)
    {
       return culturaGeneral[n][0]; 
    }
    
    //Conseguir las respuestas a las preguntas
    //IMPORTANTE las respuestas correctas siempre están en la posición 1
    public static String getRespuestaCiencias(int n, int r)
    {
        // n representa la pregunta, r la respuesta. 
        //En la posición 1 esta la correcta, en la 2 3 y 4 las incorrectas
        //en la posición 0 esta la pregunta
        return ciencias[n][r];
    }
    public static String getRespuestaMate(int n, int r)
    {
        return matematicas[n][r];
    }
    public static String getRespuestaMusica(int n, int r)
    {
        return musica[n][r];
    }
    public static String getRespuestaCultura(int n, int r)
    {
        return culturaGeneral[n][r];
    }
}
