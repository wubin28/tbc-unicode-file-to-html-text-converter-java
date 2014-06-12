package kata.ufthtc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverterTest {
    // TODO-acceptance-test-working-on: should convert ampersand
    @Test
    public void should_convert_ampersand() {
        // Arrange
        StringSource stringSource = new StringSource();
        stringSource.setSourceString("H&M");
        UnicodeFileToHtmlTextConverter converter = new UnicodeFileToHtmlTextConverter(stringSource);

        // Act
        // Assert
        assertEquals("H&amp;M<br />", converter.convertToHtml());
    }

    // TODO-acceptance-test: should convert greater than and less than
    // TODO-acceptance-test: should add a line break for a new line
    // TODO-new-feature: Make the method convertToHtml() working for not only a file but also a string
}
