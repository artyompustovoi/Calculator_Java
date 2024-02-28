package Artem.Pustovoy.Second_HW.Part_2;

import Artem.Pustovoy.Second_HW.Part_2.ValidateString;

public class ValidateNoSpace implements ValidateString {
    @Override
    public boolean isValid(String s) {
        return !s.contains(" ");
    }
}