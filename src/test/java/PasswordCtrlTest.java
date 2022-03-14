import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordCtrlTest {

    @Test
    void checkPassword_too_short(){
        boolean actual = PasswordCtrl.checkPassword("1234567");
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkPassword_correct_length(){
        boolean acutal = PasswordCtrl.checkPassword("1234567890");
        boolean expected = true;
        Assertions.assertEquals(expected, acutal);
    }

    @Test
    void checkPassword_too_long(){
        boolean actual = PasswordCtrl.checkPassword("12345678901234567890123456");
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void checkPassword_has_Lower_Characters(){
        boolean actual = PasswordCtrl.checkLower_Upper_Character_and_Numbers("abcdefghijk");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPassword_has_Upper_Characters(){
        boolean actual = PasswordCtrl.checkLower_Upper_Character_and_Numbers("ABCDEFGHIJK");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkPassword_has_Numbers(){
        boolean actual = PasswordCtrl.checkLower_Upper_Character_and_Numbers("1234567890");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }


}
