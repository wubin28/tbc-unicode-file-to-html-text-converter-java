package kata.ufthtc;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverterTest {
    @Test
    public void should_convert_ampersand() throws IOException{
        // Arrange
        StringSource stringSource = new StringSource();
        stringSource.setSourceString("H&M");
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(stringSource);

        // Act
        // Assert
        assertEquals("H&amp;M<br />", converter.convertToHtml());
    }

    @Test
    public void should_convert_greater_than_and_less_than() throws IOException{
        // Arrange
        StringSource stringSource = new StringSource();
        stringSource.setSourceString(">_<|||");
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(stringSource);

        // Act
        // Assert
        assertEquals("&gt;_&lt;|||<br />", converter.convertToHtml());
    }

    // TODO-acceptance-test: should add a line break for a new line
    // TODO-new-feature: Make the method convertToHtml() working for not only a file but also a string
}
