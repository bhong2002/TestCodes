package bhong2002.testcodes.helper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bhong on 4/22/2016.
 */
public class LanguageFields {
    @SerializedName("COL_ID")
    @Expose
    private String COLID;
    @SerializedName("COL_DESCRIPTION")
    @Expose
    private String COLDESCRIPTION;
    @SerializedName("COL_ICON")
    @Expose
    private String COLICON;

    /**
     *
     * @return
     * The COLID
     */
    public String getCOLID() {
        return COLID;
    }

    /**
     *
     * @param COLID
     * The COL_ID
     */
    public void setCOLID(String COLID) {
        this.COLID = COLID;
    }

    /**
     *
     * @return
     * The COLDESCRIPTION
     */
    public String getCOLDESCRIPTION() {
        return COLDESCRIPTION;
    }

    /**
     *
     * @param COLDESCRIPTION
     * The COL_DESCRIPTION
     */
    public void setCOLDESCRIPTION(String COLDESCRIPTION) {
        this.COLDESCRIPTION = COLDESCRIPTION;
    }

    /**
     *
     * @return
     * The COLICON
     */
    public String getCOLICON() {
        return COLICON;
    }

    /**
     *
     * @param COLICON
     * The COL_ICON
     */
    public void setCOLICON(String COLICON) {
        this.COLICON = COLICON;
    }


}
