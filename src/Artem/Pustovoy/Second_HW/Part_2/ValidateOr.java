package Artem.Pustovoy.Second_HW.Part_2;

import Artem.Pustovoy.Second_HW.Part_2.ValidateString;

public class ValidateOr implements ValidateString {
    private final ValidateString validator1;
    private final ValidateString validator2;

    public ValidateOr(ValidateString validator1, ValidateString validator2) {
        this.validator1 = validator1;
        this.validator2 = validator2;
    }

    @Override
    public boolean isValid(String s) {
        return validator1.isValid(s) || validator2.isValid(s);
    }
}
