public class PasswordCtrl {
    public static boolean checkPassword(String password) {
        if (!checkPasswordLength(password))
            return false;

        if(!checkLower_Upper_Character_and_Numbers(password))
            return false;

          return true;
    }

    static boolean checkPasswordLength(String password){
        return (password.length() >= 8 && password.length() <= 25);
    }

    static boolean checkLower_Upper_Character_and_Numbers(String password){
        return (password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])"));
    }
}
