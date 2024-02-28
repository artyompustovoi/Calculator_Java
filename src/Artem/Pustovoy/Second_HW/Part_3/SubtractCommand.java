package Artem.Pustovoy.Second_HW.Part_3;

public class SubtractCommand extends Command {
    private final int operand;

    public SubtractCommand(Calculator calculator, int operand) {
        super(calculator);
        this.operand = operand;
    }

    @Override
    protected void executeCommand() {
        calculator.subtract(operand);
    }
}