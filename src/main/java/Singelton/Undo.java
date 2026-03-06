package Singelton;

import java.util.Stack;

public class Undo {

    static Undo instance;
    private Stack<String> orderCommands = new Stack<>();
    
    //constructor privat
    private Undo(){};


    public static Undo getInstance(){

        if(instance == null){
            instance = new Undo();
        }
        return instance;

    }

    public void addCommand(String command){
        orderCommands.push(command);
    }

    public String undoCommand(){
        if(orderCommands.isEmpty()){
            return "You haven't entered any commands yet.";
        }
        return orderCommands.pop();
    }

    public void showHistory(){
        //void showHistory(); – mostra totes les comandes emmagatzemades fins al moment.
        for (String command: orderCommands){
            System.out.println(command);
        }
    }

}
