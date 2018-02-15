package folk.jettech.com.folk;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import folk.jettech.com.folk.res.recycler.adapater.RecyclerLineAdapter;
import folk.jettech.com.folk.res.recycler.adapater.RecyclerListAdapter;
import folk.jettech.com.folk.res.recycler.res.recycler.datasource.CharacterDataSource;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Folk";

    private Toolbar toolbar;
    private ActionBar actionBar;
    private static final String NOT_IMPLEMENTED_YET_MESSAGE = "This feature is not implemented yet";

    private RecyclerView mRecyclerView;
    private RecyclerLineAdapter mRecyclerLineAdapter;
    private RecyclerListAdapter mRecyclerListAdapter;
    private List<CharacterDataSource> characterDataSources;

    public void setupRecycler() {

        characterDataSources = new ArrayList<>();

        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), "This is a Staggered Grid Layout on Action."));
        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), "This is a Staggered Grid Layout on Action."));
        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        characterDataSources.add(new CharacterDataSource(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        /** StaggeredGridLayoutManager - @Params
         * int spanCount - Defines the columns of the Layout
         * int ORIENTATION - Defines the Orientation of LayoutManager */
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);

        /** GridLayoutManager - @Params
         * Context context - The actual context
         * int spanCount - Defines the columns of the Layout*/
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        /** LinearLayoutManager - @Params
         * Context context - The actual context
         * int ORIENTATION - Defines the Orientation of LinearLayoutManager
         * boolean reverseLayout - If true reverse the distribution of elements*/
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        /** Sets the Layout Manager for Recycler View*/
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);


        //mRecyclerLineAdapter = new RecyclerLineAdapter(characterDataSources);
        mRecyclerListAdapter = new RecyclerListAdapter(characterDataSources);
        mRecyclerView.setAdapter(mRecyclerListAdapter);

        /** If uses as Simple List- LinearLayoutManager on VERTICAL orientation implementation. */
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main_activity);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        this.setupRecycler();
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
