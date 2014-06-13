package kata.ufthtc;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverterTest {
    private StringSource stringSource;
    private UnicodeFileToHtmlTextConverter converter;

    @Before
    public void initialize() {
        // Arrange
        stringSource = new StringSource();
        converter = new UnicodeFileToHtmlTextConverter(stringSource);
    }

    @Test
    public void should_convert_ampersand() throws IOException{
        // Arrange
        stringSource.setSourceString("H&M");

        // Act
        // Assert
        assertEquals("H&amp;M<br />", converter.convertToHtml());
    }

    @Test
    public void should_convert_greater_than_and_less_than() throws IOException{
        // Arrange
        stringSource.setSourceString(">_<|||");

        // Act
        // Assert
        assertEquals("&gt;_&lt;|||<br />", converter.convertToHtml());
    }

    @Test
    public void should_add_a_line_break_for_a_new_line() throws IOException{
        // Arrange
        stringSource.setSourceString("Cheers\nBen Wu");

        // Act
        // Assert
        assertEquals("Cheers<br />Ben Wu<br />", converter.convertToHtml());
    }

    // TODO-new-feature: Make the method convertToHtml() working for not only a file but also a string
}
