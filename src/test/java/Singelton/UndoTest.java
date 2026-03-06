package Singelton;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UndoTest {

    //We check if all instances are the same object to check Singelton pattern in applied correctly
    @Test
    void testingSingeltonUniqueInstanceWorksFine(){
        Undo instance1 = Undo.getInstance();
        Undo instance2 = Undo.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    void testAddCommand(){
        Undo.getInstance().addCommand("test command");

        assertEquals("test command", Undo.getInstance().undoCommand());
    }

    @Test
    void testUndoCommand(){
        Undo.getInstance().addCommand("command1");
        Undo.getInstance().addCommand("command2");
        Undo.getInstance().addCommand("command3");
        Undo.getInstance().addCommand("command4");

        assertEquals("command4", Undo.getInstance().undoCommand());
        assertEquals("command3", Undo.getInstance().undoCommand());
        assertEquals("command2", Undo.getInstance().undoCommand());
        assertEquals("command1", Undo.getInstance().undoCommand());
        assertEquals("You haven't entered any commands yet.",Undo.getInstance().undoCommand() );
    }

    @Test
    void testShowHistory(){
        Undo.getInstance().addCommand("command1");
        Undo.getInstance().addCommand("command2");
        Undo.getInstance().addCommand("command3");
        Undo.getInstance().addCommand("command4");

        List<String> desideredList = List.of("command1", "command2", "command3", "command4");

        assertEquals(desideredList, Undo.getInstance().showHistory());

    }
}
