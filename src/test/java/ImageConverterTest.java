import com.redbird.ImageConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ImageConverterTest {

    @Test
    @DisplayName("From jpg to png")
    void jpgToPng() {
        String inputImage = "./img/test.jpg";
        String outputImage = "./img/test.png";
        String formatName = "PNG";
        try {
            boolean result = ImageConverter.convertFormat(inputImage,
                    outputImage, formatName);
            assertTrue(result);
            boolean delete = new File(outputImage).delete();
            assertTrue(delete);
        } catch (IOException e) {
            System.out.println("Error during converting image.");
            e.printStackTrace();
        }
    }
}