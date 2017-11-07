package andriod.training.cat.com.l02layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button click to Relative page
        Button bt_goto_relative = (Button) findViewById(R.id.lo_bt_goto_relative);
        bt_goto_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RelativeLOActivity.class));
            }
        });

        //Button click to Scroll page
        Button bt_goto_scroll = (Button) findViewById(R.id.lo_bt_goto_scroll);
        bt_goto_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScrollLOActivity.class));
            }
        });

        //Button click to listview page
        Button bt_goto_list = (Button) findViewById(R.id.lo_bt_goto_list);
        bt_goto_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListLOActivity.class));
            }
        });

        //Button click to listview page
        Button bt_goto_mix = (Button) findViewById(R.id.lo_bt_goto_mix);
        bt_goto_mix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MixingLOActivity.class));
            }
        });

        //Button click to  page
        Button bt_goto_list_advance = (Button) findViewById(R.id.lo_bt_goto_list_advance);
        bt_goto_list_advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListLOAdvanceActivity.class));
            }
        });

        //Button click to  page
        Button bt_goto_web_view  = (Button) findViewById(R.id.lo_bt_goto_web_view);
        bt_goto_web_view .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WebViewActivity.class));
            }
        });

    }

}
