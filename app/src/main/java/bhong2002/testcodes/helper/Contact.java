package bhong2002.testcodes.helper;

/**
 * Created by bhong on 4/30/2016.
 */
public class Contact {
    private String COL_ID;
    private String COL_DESCRIPTION;
    private String COL_ICON;


    public Contact(String COL_ID, String COL_DESCRIPTION, String COL_ICON) {
        super();
        this.COL_ID = COL_ID;
        this.COL_DESCRIPTION = COL_DESCRIPTION;
        this.COL_ICON = COL_ICON;

    }

    public String getCOL_ID() {
        return COL_ID;
    }

    public void setCOL_ID(String COL_ID) {
        this.COL_ID = COL_ID;
    }

    public String getCOL_DESCRIPTION() {
        return COL_DESCRIPTION;
    }

    public void setCOL_DESCRIPTION(String COL_DESCRIPTION) {
        this.COL_DESCRIPTION = COL_DESCRIPTION;
    }

    public String getCOL_ICON() {
        return COL_ICON;
    }

    public void setCOL_ICONl(String COL_ICON) {
        this.COL_ICON = COL_ICON;
    }

}
