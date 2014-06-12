package kata.ufthtc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by benwu on 14-6-13.
 */
public class FileSource implements ConvertingSource {
    private String fullFilenameWithPath;

    @Override
    public Reader getReader() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(this.fullFilenameWithPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileReader;
    }

    public void setFullFilenameWithPath(String fullFilenameWithPath) {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }
}
