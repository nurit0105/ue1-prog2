import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://github.com/nurit0105/ue1-prog2.git

class PasswordCtrlTest {

    @Test
    void checkPassword_too_short(){
        boolean actual = PasswordCtrl.checkPasswordLength("1234567");
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkPassword_correct_length(){
        boolean acutal = PasswordCtrl.checkPasswordLength("1234567890");
        boolean expected = true;
        Assertions.assertEquals(expected, acutal);
    }

    @Test
    void checkPassword_too_long(){
        boolean actual = PasswordCtrl.checkPasswordLength("12345678901234567890123456");
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkPassword_has_noLower_Characters(){
        boolean actual = PasswordCtrl.checkLower_Upper_Character_and_Numbers("ABCDEFGHIJ2!");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPassword_has_noUpper_Characters(){
        boolean actual = PasswordCtrl.checkLower_Upper_Character_and_Numbers("abcdeghij2!");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPassword_has_noNumbers(){
        boolean actual = PasswordCtrl.checkLower_Upper_Character_and_Numbers("bcdebcdebcdebcde");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
