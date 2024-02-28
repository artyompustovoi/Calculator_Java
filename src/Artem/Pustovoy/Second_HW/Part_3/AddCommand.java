package Artem.Pustovoy.Second_HW.Part_3;

public class AddCommand extends Command {
    private final int operand;

    public AddCommand(Calculator calculator, int operand) {
        super(calculator);
        this.operand = operand;
    }

    @Override
    protected void executeCommand() {
        calculator.add(operand);
    }
}



// Аналогично для умножения и деления
