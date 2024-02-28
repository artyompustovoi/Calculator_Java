package Artem.Pustovoy.Second_HW.Part_2;

import Artem.Pustovoy.Second_HW.Part_2.ValidateString;

public class ValidatePalindrom implements ValidateString {
    @Override
    public boolean isValid(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}