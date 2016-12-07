package com.ashutech.diff_link_listview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] arr = {"Gmail","Google","Facebook","Twitter","Wikipedia"};
    ArrayAdapter<String> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);

        aa = new ArrayAdapter<String>(this,R.layout.row,arr);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  String[] links = getResources().getStringArray(R.array.link);
              //  Uri uri = Uri.parse(links[i]);
               //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
               Intent intent = new Intent(MainActivity.this, WebviewActivity.class);

                // pass name to intent with put extra
                intent.putExtra("i",i);
                startActivity(intent);

            }
        });



    }
}
