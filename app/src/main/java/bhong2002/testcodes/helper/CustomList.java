package bhong2002.testcodes.helper;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import bhong2002.testcodes.R;

/**
 * Created by bhong on 5/1/2016.
 */
public class CustomList extends ArrayAdapter<String> {

    private String[] ids;
    private String[] descriptions;
    private String[] icons;
    private Activity context;

    public CustomList(Activity context, String[] ids, String[] descriptions, String[] icons) {
        super(context, R.layout.list_view_layout, ids);
        this.context = context;
        this.ids = ids;
        this.descriptions = descriptions;
        this.icons = icons;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_layout, null, true);

//        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
//        ImageView imageViewIcon = (ImageView) listViewItem.findViewById(R.id.flag_photo);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewDescription);
        TextView textViewEmail = (TextView) listViewItem.findViewById(R.id.textViewIcon);

//        textViewId.setText(ids[position]);
        textViewName.setText(descriptions[position]);
        textViewEmail.setText(icons[position]);

        return listViewItem;
    }

}
