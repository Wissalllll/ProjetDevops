import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

public class OutputWriterTest {

    @Test
    public void testWriteOutputWithValidData() {
        OutputWriter writer = new OutputWriter();
        boolean result = writer.writeOutput("output data", "output.txt");
        assertTrue(result, "The data should be successfully written.");
    }

    @Test
    public void testWriteOutputWithInvalidFile() {
        OutputWriter writer = new OutputWriter();
        boolean result = writer.writeOutput("output data", "");
        assertFalse(result, "Writing to an invalid file should fail.");
    }

    @Test
    public void testWriteOutputWithNullData() {
        OutputWriter writer = new OutputWriter();
        boolean result = writer.writeOutput(null, "output.txt");
        assertFalse(result, "Null data should not be written.");
    }
}
