package Singelton;

public class Undo {

    
    // fer un objecte o lloc on apunta el punter static de la clase osigui -> static i final
    static Undo instance;
    
    //constructor privat
    private Undo(){};


    public static Undo getInstance(){

        if(instance == null){
            instance = new Undo();
        }
        return instance;

    }
}
