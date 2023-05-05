package J1SP0001.src;
/**
 *
 * @author phucnthe176442
 */
public class Validation {

    public static boolean validateInt(String num) {
        // check empty input
        if (num.isEmpty()) {
            System.out.println("Input cannot be empty");
        } else {
            boolean checkDigit = true;
            // reach each character
            for (int i = 0; i < num.length(); ++i) {
                // check character is digit
                if ("0123456789".contains("" + num.charAt(i)) == false) {
                    checkDigit = false;
                    break;
                }
            }

            // check not digit exist  
            if (!checkDigit) {
                System.out.println("Input should be digits only and positive integer");
            } else {
                int tmpNum = Integer.parseInt(num);
                // check input = 0
                if (tmpNum == 0) {
                    System.out.println("Input should be positive integer");
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
