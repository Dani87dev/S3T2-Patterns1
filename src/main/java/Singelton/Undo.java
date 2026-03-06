package Singelton;

import java.util.Stack;

public class Undo {

    static Undo instance;
    private Stack<String> orderComands;
    
    //constructor privat
    private Undo(){};


    public static Undo getInstance(){

        if(instance == null){
            instance = new Undo();
        }
        return instance;

    }

    public void addCommand(String command){
        orderComands.push(command);
    }

    public String undoCommand(){
        //String undoCommand(); – retorna i elimina l'última comanda.
        return orderComands.pop();
    }

    public void showHistory(){
        //void showHistory(); – mostra totes les comandes emmagatzemades fins al moment.
        for (String command:orderComands){
            System.out.println(command);
        }
    }



    //push("text")	Afegeix un element a sobre de tot de la pila.
    //pop()	Treu i retorna l'element que hi ha a dalt de tot.
    //peek()	Mira quin element hi ha a dalt de tot sense treure'l.
    //isEmpty()	Comprova si la pila està buida.
}
