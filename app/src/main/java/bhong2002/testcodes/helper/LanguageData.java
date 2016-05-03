package bhong2002.testcodes.helper;

/**
 * Created by bhong on 4/22/2016.
 */
import java.util.List;

public class LanguageData {
    private String Languages;
    private List<LanguageFields> fields;

    public String Languages() {
        return Languages;
    }
    public void setLanguages(String Languages) {
        Languages = Languages;
    }
    public List<LanguageFields> getFields() {
        return fields;
    }
    public void setTrends(List<LanguageFields> fields) {
        this.fields = fields;
    }

}
