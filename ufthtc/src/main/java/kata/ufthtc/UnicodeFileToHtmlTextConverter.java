package kata.ufthtc;

import org.apache.commons.lang.StringEscapeUtils;

import java.io.*;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverter {
    private String fullFilenameWithPath;
    private Reader reader;

    public UnicodeFileToHtmlTextConverter(String fullFilenameWithPath)
    {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public UnicodeFileToHtmlTextConverter(Reader reader) {

    }

    public String convertToHtml() throws IOException{

        // TODO-working-on: Depending on the file system violates the Dependency Inversion Principle and Open-Closed Principle
        BufferedReader reader = new BufferedReader(this.reader);

        String line = reader.readLine();
        String html = "";
        while (line != null)
        {
            // TODO: Depending on the third party library violates the Dependency Inversion Principle and Open-Closed Principle
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }
}
