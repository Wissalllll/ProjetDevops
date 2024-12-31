import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataTransformationTest {

    @Test
    public void testTransformWithValidData() {
        DataTransformation transformer = new DataTransformation();
        String result = transformer.transform("raw data");
        assertEquals("transformed data", result, "The data should be correctly transformed.");
    }

    @Test
    public void testTransformWithEmptyData() {
        DataTransformation transformer = new DataTransformation();
        String result = transformer.transform("");
        assertEquals("", result, "Empty input should return empty output.");
    }

    @Test
    public void testTransformWithNullData() {
        DataTransformation transformer = new DataTransformation();
        String result = transformer.transform(null);
        assertNull(result, "Null input should return null output.");
    }
}
