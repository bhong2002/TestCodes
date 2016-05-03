package bhong2002.testcodes;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import bhong2002.testcodes.helper.CustomList;
import bhong2002.testcodes.helper.ParseJSON;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener{
public class MainActivity extends AppCompatActivity{

    public static final String JSON_URL = "http://49.151.159.139/myphp/languageselect.php"; //http://simplifiedcoding.16mb.com/UserRegistration/json.php

    private Button buttonGet;

    private ListView listView;

//    // Alert dialog manager
//    AlertDialogManager alert = new AlertDialogManager();
//
//    }


    private ProgressDialog pDialog;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        buttonGet = (Button) findViewById(R.id.buttonGet);
//        buttonGet.setOnClickListener(this);
        sendRequest();
        listView = (ListView) findViewById(R.id.listView);


//        ColorDrawable devidrColor = new ColorDrawable();
//        listView.setDivider(devidrColor);
//        listView.setDividerHeight(1);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

//        ========================================
}
 // Activity end



    private void sendRequest(){

        StringRequest stringRequest = new StringRequest(JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
//                        Log.d("JSON ", response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this,error.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String json){
        ParseJSON pj = new ParseJSON(json);
        pj.parseJSON();

        Log.d("JSON main act ", json.toString());

        CustomList cl = new CustomList(this, ParseJSON.ids,ParseJSON.descriptions,ParseJSON.icons);
        listView.setAdapter(cl);
    }

//    @Override
//    public void onClick(View v) {
//        sendRequest();
//    }





}
