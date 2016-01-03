package cheonhyang.moon_pinnamon.twitdown;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setOnItemClickListener(click);
    }

    AdapterView.OnItemClickListener click = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    Intent start_setting = new Intent(MainActivity.this, Setting_Action.class);
                    startActivity(start_setting);
                    break;
                case 1:
                    Intent account_setting = new Intent(MainActivity.this, Setting_Action.class);
                    startActivity(account_setting);
                    break;
                case 2:
                    Intent save_setting = new Intent(MainActivity.this, Setting_Action.class);
                    startActivity(save_setting);
                    break;
            }
        }
    };
}
