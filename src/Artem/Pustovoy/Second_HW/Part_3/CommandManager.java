package Artem.Pustovoy.Second_HW.Part_3;

import java.util.Stack;

public class CommandManager {
    public final Calculator calculator;
    private final Stack<Command> history = new Stack<>();
    private final Stack<Command> redoStack = new Stack<>();

    public CommandManager(Calculator calculator) {
        this.calculator = calculator;
    }

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
        redoStack.clear(); // После выполнения новой команды отменяем возможность повтора предыдущей
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
            redoStack.push(lastCommand);
        } else {
            System.out.println("Нет операций для отмены.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command lastUndoneCommand = redoStack.pop();
            lastUndoneCommand.execute();
            history.push(lastUndoneCommand);
        } else {
            System.out.println("Нет отмененных операций для повтора.");
        }
    }
}
