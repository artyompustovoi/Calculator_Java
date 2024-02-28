package Artem.Pustovoy.Second_HW.Part_3;

public abstract class Command {
    protected final Calculator calculator;
    private final int previousValue;

    public Command(Calculator calculator) {
        this.calculator = calculator;
        this.previousValue = calculator.getCurrentValue();
    }

    public void execute() {
        executeCommand();
    }

    public void undo() {
        calculator.setCurrentValue(previousValue);
    }

    protected abstract void executeCommand();
}