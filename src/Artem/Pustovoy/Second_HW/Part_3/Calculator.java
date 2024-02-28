package Artem.Pustovoy.Second_HW.Part_3;

public class Calculator {
    private int currentValue;

    public Calculator() {
        this.currentValue = 0;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int value) {
        this.currentValue = value;
    }

    public void add(int value) {
        currentValue += value;
    }

    public void subtract(int value) {
        currentValue -= value;
    }
    public void divide(int value) {
        currentValue = currentValue/value;
    }

    public void multiply(int value) {
        currentValue = currentValue*value;
    }

}