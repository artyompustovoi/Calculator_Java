package Artem.Pustovoy.Second_HW.Part_2;

import Artem.Pustovoy.Second_HW.Part_2.ValidateString;

public class ValidateInverse implements ValidateString {
    private final ValidateString validator;

    public ValidateInverse(ValidateString validator) {
        this.validator = validator;
    }

    @Override
    public boolean isValid(String s) {
        return !validator.isValid(s);
    }
}