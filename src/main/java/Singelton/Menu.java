package Singelton;

public class Menu {

    int optionUser = -1;

    public void startapp() {

        do {

            menuText();     //Ensenya el text amb el menu
            InOutInfo dataInput = new InOutInfo(); // crea una instancia de la clase que crea el scanner
            String inputCommand; //comando entrat per l'usuari


            System.out.println("Insert your option");
            optionUser = dataInput.getScanner().nextInt();

            //neteja de l buffer
            dataInput.getScanner().nextLine();

            switch (optionUser) {
                case 1:
                    System.out.println("Insert one command please");
                    inputCommand = dataInput.getScanner().nextLine();
                    Undo.getInstance().addCommand(inputCommand);
                    System.out.println("You have insert command \"" + inputCommand + " correctly!");
                    break;
                case 2:
                    System.out.println(Undo.getInstance().undoCommand());
                    break;
                case 4:
                    System.out.println("Closing programm...");
                    break;
            }
        } while (optionUser != 4);

    }

    //Ensenya el text amb el menu
    public void menuText() {

        System.out.println("\n << MENU APP UNDO >> \n" +
                "\n1 - Add command" +
                "\n2 - Undo command" +
                "\n3 - Show history commands" +
                "\n4 - Exit programm +" +
                "\n\npress one option (0 - 4)");
    }


}
