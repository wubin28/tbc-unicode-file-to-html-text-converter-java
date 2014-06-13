package kata.ufthtc;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Created by benwu on 14-6-13.
 */
public class ApacheCommonsEscaper implements HtmlEscaper {
    @Override
    public String escape(String string) {
        return StringEscapeUtils.escapeHtml(string);
    }
}
