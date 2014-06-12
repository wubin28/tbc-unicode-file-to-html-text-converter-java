package kata.ufthtc;

import java.io.Reader;
import java.io.StringReader;

/**
 * Created by benwu on 14-6-12.
 */
public class StringSource implements ConvertingSource {
    private String sourceString;

    public void setSourceString(String sourceString) {
        this.sourceString = sourceString;
    }

    @Override
    public Reader getReader() {
        return new StringReader(this.sourceString);
    }
}
