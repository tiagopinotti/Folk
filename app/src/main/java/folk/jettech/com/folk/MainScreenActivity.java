package folk.jettech.com.folk;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;

public class MainScreenActivity extends AppCompatActivity {

    private FloatingSearchView mSearchInputView;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    private String[] items = {"Item","Item","Item","Item","Item","Item",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView)findViewById(R.id.drawer_list);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,items));

        mSearchInputView = (FloatingSearchView) findViewById(R.id.floating_search_view);
        mSearchInputView.setOnSearchListener(new FloatingSearchView.OnSearchListener() {
            @Override
            public void onSuggestionClicked(SearchSuggestion searchSuggestion) {

            }

            @Override
            public void onSearchAction(String currentQuery) {

            }
        });

        mSearchInputView.attachNavigationDrawerToMenuButton(mDrawerLayout);


    }
}
