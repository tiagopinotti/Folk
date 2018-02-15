package folk.jettech.com.folk;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import folk.jettech.com.folk.res.recycler.adapater.LineAdapter;
import folk.jettech.com.folk.res.recycler.res.recycler.datasource.UserModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Folk";

    private Toolbar toolbar;
    private ActionBar actionBar;
    private static final String NOT_IMPLEMENTED_YET_MESSAGE = "This feature is not implemented yet";

    private RecyclerView mRecyclerView;
    private LineAdapter mLineAdapter;

    private List<UserModel> userModels;

    public void setupRecycler() {

        userModels = new ArrayList<>();

        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));
        userModels.add(new UserModel(getResources().getString(R.string.story_title), getResources().getString(R.string.story_description)));

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = getLinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false, mRecyclerView);
        mRecyclerView.setLayoutManager(layoutManager);

        mLineAdapter = new LineAdapter(userModels);
        mRecyclerView.setAdapter(mLineAdapter);

        // ItemDecorator
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    public LinearLayoutManager getLinearLayoutManager(Context context, int LINEAR_LAYOUT_ORIENTATION_PARAM, boolean reverseLayout, RecyclerView recyclerView) {
        if(LINEAR_LAYOUT_ORIENTATION_PARAM == LinearLayoutManager.VERTICAL){
            return new LinearLayoutManager(context, LINEAR_LAYOUT_ORIENTATION_PARAM, reverseLayout);
        }else{
            recyclerView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL));
            return new LinearLayoutManager(context, LINEAR_LAYOUT_ORIENTATION_PARAM, reverseLayout);
        }
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
