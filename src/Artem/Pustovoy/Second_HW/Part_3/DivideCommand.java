package Artem.Pustovoy.Second_HW.Part_3;

public class DivideCommand extends Command {
    private final int operand;

    public DivideCommand(Calculator calculator, int operand) {
        super(calculator);
        this.operand = operand;
    }

    @Override
    protected void executeCommand() {
        calculator.divide(operand);
    }
}