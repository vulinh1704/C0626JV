package validator;

import lib.InputHelper;

import java.util.regex.Pattern;

public class ProductValidator {
    public static String inputName() {
        String nameRegex = "^(?=.*[a-zA-ZÀ-ỹ])[a-zA-Z0-9À-ỹ ]{5,15}$";
        while (true) {
            String name = InputHelper.inputString();
            boolean isMatch = Pattern.matches(nameRegex, name);
            if (isMatch) return name;
            else {
                System.out.println("Product name invalid");
            }
        }
    }


}
