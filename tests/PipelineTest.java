import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PipelineTest {

    @Test
    public void testPipelineWithValidData() {
        Pipeline pipeline = new Pipeline();
        boolean result = pipeline.run("valid input");
        assertTrue(result, "The pipeline should run successfully with valid input.");
    }

    @Test
    public void testPipelineWithInvalidData() {
        Pipeline pipeline = new Pipeline();
        boolean result = pipeline.run("");
        assertFalse(result, "The pipeline should fail with invalid input.");
    }

    @Test
    public void testPipelineWithNullData() {
        Pipeline pipeline = new Pipeline();
        boolean result = pipeline.run(null);
        assertFalse(result, "The pipeline should fail with null input.");
    }
}
