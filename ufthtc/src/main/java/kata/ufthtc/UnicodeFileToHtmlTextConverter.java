package kata.ufthtc;

import org.apache.commons.lang.StringEscapeUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverter {
    private ConvertingSource convertingSource;

    public UnicodeFileToHtmlTextConverter(String fullFilenameWithPath)
    {
        FileSource fileSource = new FileSource();
        fileSource.setFullFilenameWithPath(fullFilenameWithPath);
        this.convertingSource = fileSource;
    }

    public UnicodeFileToHtmlTextConverter(ConvertingSource convertingSource) {
        this.convertingSource = convertingSource;
    }

    public String convertToHtml() throws IOException{

        BufferedReader reader = new BufferedReader(convertingSource.getReader());

        String line = reader.readLine();
        String html = "";
        while (line != null)
        {
            // TODO-working-on: Depending on the third party library violates the Dependency Inversion Principle and Open-Closed Principle
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }
}
