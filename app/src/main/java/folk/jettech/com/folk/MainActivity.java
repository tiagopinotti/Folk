package folk.jettech.com.folk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Folk";

    private ListView listView;
    private List<String> characters;
    private static final String NOT_IMPLEMENTED_YET_MESSAGE = "This feature is not implemented yet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characters = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            characters.add(new Character("List Item", null, null).getName());
        }

        listView = (ListView) findViewById(R.id.list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, CharacterViewActivity.class);
                startActivity(intent);
            }
        });

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                this.defaultAction();
                break;

            case R.id.settings:
                this.defaultAction();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void defaultAction() {
        Toast.makeText(this, NOT_IMPLEMENTED_YET_MESSAGE, Toast.LENGTH_SHORT).show();
    }

}
