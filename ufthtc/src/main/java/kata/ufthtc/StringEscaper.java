package kata.ufthtc;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Created by benwu on 14-8-2.
 */
public class StringEscaper {
    public String escapeHtml(String originalString) {
        return StringEscapeUtils.escapeHtml(originalString);
    }
}
