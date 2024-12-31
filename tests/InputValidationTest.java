import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputValidationTest {

    @Test
    public void testIsValidInputWithValidInput() {
        InputValidation validator = new InputValidation();
        boolean result = validator.isValidInput("valid input");
        assertTrue(result, "The input should be valid.");
    }

    @Test
    public void testIsValidInputWithInvalidInput() {
        InputValidation validator = new InputValidation();
        boolean result = validator.isValidInput("");
        assertFalse(result, "The input should be invalid.");
    }

    @Test
    public void testIsValidInputWithNullInput() {
        InputValidation validator = new InputValidation();
        boolean result = validator.isValidInput(null);
        assertFalse(result, "Null input should be invalid.");
    }
}
