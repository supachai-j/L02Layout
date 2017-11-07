package andriod.training.cat.com.l02layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by LqLconf on 11/7/2017.
 */

public class ListLOAdvanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String[] operating_systems = getResources().getStringArray(R.array.strXML_operating_systems);

        ListLOAdvanceAdapter adapter = new ListLOAdvanceAdapter(this, operating_systems);
        ListView lv = (ListView) findViewById(R.id.lo_lv);
        lv.setAdapter(adapter);
    }
}

