package folk.jettech.com.folk;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;

import java.util.ArrayList;
import java.util.List;

import folk.jettech.com.folk.res.recycler.adapater.RecyclerLineAdapter;
import folk.jettech.com.folk.res.recycler.res.recycler.entities.Persona;

public class MainScreenActivity extends AppCompatActivity {

    private FloatingSearchView mSearchInputView;
    private DrawerLayout mDrawerLayout;
    private RecyclerView mRecyclerView;
    private RecyclerLineAdapter recyclerLineAdapter;
    private List<Persona> personas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view_main);
        personas = new ArrayList<>();

        personas.add(new Persona("Item", "Item description"));
        personas.add(new Persona("Item", "Item description"));
        personas.add(new Persona("Item", "Item description"));
        personas.add(new Persona("Item", "Item description"));
        personas.add(new Persona("Item", "Item description"));
        personas.add(new Persona("Item", "Item description"));

        recyclerLineAdapter = new RecyclerLineAdapter(personas);
        mRecyclerView.setAdapter(recyclerLineAdapter);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

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
