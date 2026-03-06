package Singelton;

public class Menu {

    int optionUser = 1;

    public void startapp() {

        do {

            menuText();     //Ensenya el text amb el menu
            InOutInfo dataInput = new InOutInfo(); // crea una instancia de la clase que crea el scanner
            String inputCommand; //comando entrat per l'usuari

            switch (optionUser) {

                case 1:
                    inputCommand = dataInput.getScanner().nextLine();
                    Undo.getInstance().addCommand(inputCommand);
                    System.out.println();
                    break;
                case 2:
                    System.out.println(Undo.getInstance().undoCommand());
                    break;
                case 0:
                    optionUser = 0;
                    break;
            }
        } while (optionUser != 0);

    }

    //Ensenya el text amb el menu
    public void menuText() {

        System.out.println("\n << MENU APP UNDO >> \n" +
                "\n1 - Add command" +
                "\n2 - Undo command" +
                "\n3 - Show history commands\n" +
                "\n4 - Exit programm");
    }


}
