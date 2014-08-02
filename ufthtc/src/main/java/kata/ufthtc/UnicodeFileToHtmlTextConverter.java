package kata.ufthtc;

import org.apache.commons.lang.StringEscapeUtils;

import java.io.*;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverter {
    private Reader reader;

    public UnicodeFileToHtmlTextConverter(String fullFilenameWithPath) throws FileNotFoundException {
        this.reader = new FileReader(fullFilenameWithPath);
    }

    public UnicodeFileToHtmlTextConverter(Reader reader) {
        this.reader = reader;
    }

    public String convertToHtml() throws IOException{

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
