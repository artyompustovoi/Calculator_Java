package Artem.Pustovoy.Second_HW.Part_3;

public class MultiplyCommand extends Command {
    private final int operand;

    public MultiplyCommand(Calculator calculator, int operand) {
        super(calculator);
        this.operand = operand;
    }

    @Override
    protected void executeCommand() {
        calculator.multiply(operand);
    }
}