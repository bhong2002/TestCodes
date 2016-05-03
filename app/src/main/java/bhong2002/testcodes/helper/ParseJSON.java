package bhong2002.testcodes.helper;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by bhong on 5/1/2016.
 */
public class ParseJSON {
    public static String[] ids;
    public static String[] descriptions;
    public static String[] icons;

    public static final String JSON_ARRAY = "languages";
    public static final String COL_ID = "COL_ID";
    public static final String COL_DESCRIPTION = "COL_DESCRIPTION";
    public static final String COL_ICON = "COL_ICON";

    private JSONArray languages = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    public void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            languages = jsonObject.getJSONArray(JSON_ARRAY);

            ids = new String[languages.length()];
            descriptions = new String[languages.length()];
            icons = new String[languages.length()];
            Log.d("JSON parse", ids.length + " -  -" +  languages.toString());

            for(int i = 0; i < languages.length(); i++){
                JSONObject jo = languages.getJSONObject(i);
                ids[i] = jo.getString(COL_ID);
                descriptions[i] = jo.getString(COL_DESCRIPTION);
                icons[i] = jo.getString(COL_ICON);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
