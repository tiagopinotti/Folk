package folk.jettech.com.folk;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import folk.jettech.com.folk.res.recycler.adapater.RecyclerLineAdapter;
import folk.jettech.com.folk.res.recycler.adapater.RecyclerListAdapter;
import folk.jettech.com.folk.res.recycler.res.recycler.entities.Persona;

public class CategorySelectorActivity extends AppCompatActivity {

    private static final String TAG = "Folk";

    private Toolbar toolbar;
    private ActionBar actionBar;
    private static final String NOT_IMPLEMENTED_YET_MESSAGE = "This feature is not implemented yet";

    private RecyclerView mRecyclerView;
    private RecyclerLineAdapter mRecyclerLineAdapter;
    private RecyclerListAdapter mRecyclerListAdapter;
    private List<Persona> Personas;
    private ImageView imageView;

    public void setupRecycler() {

        Personas = new ArrayList<>();

        imageView = (ImageView) findViewById(R.id.image_background);

        Personas.add(new Persona(imageView, "Goals", "Create a visual language that synthesizes classic principles of good design with the innovation and possibility of technology and science."));
        Personas.add(new Persona(imageView, "Material is the metaphor", "A material metaphor is the unifying theory of a rationalized space and a system of motion."));
        Personas.add(new Persona(imageView, "Bold, graphic, intentional", "The foundational elements of print-based design – typography, grids, space, scale, color, and use of imagery – guide visual treatments."));
        Personas.add(new Persona(imageView, "Motion provides meaning", "Motion respects and reinforces the user as the prime mover. Primary user actions are inflection points that initiate motion, transforming the whole design."));
        Personas.add(new Persona(imageView, "Light and shadow", "Within the material environment, virtual lights illuminate the scene. Key lights create directional shadows, while ambient light creates soft shadows from all angles."));
        Personas.add(new Persona(imageView, "Physical properties", "Material has varying x & y dimensions (measured in dp) and a uniform thickness (1dp)."));
        Personas.add(new Persona(imageView, "Transforming material ", "When split, material can heal. For example, if you remove a portion of material from a sheet of material, the sheet of material will become a whole sheet again. "));

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        /** getStaggeredGridLayoutManager - @Params
         * int spanCount - Defines the columns of the Layout
         * int ORIENTATION - Defines the Orientation of LayoutManager */
        StaggeredGridLayoutManager staggeredGridLayoutManager = getStaggeredLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);


        GridLayoutManager gridLayoutManager = getGridLayoutManager(this, 2);

        /** getLinearLayoutManager - @Params
         * Context context - The actual context
         * int ORIENTATION - Defines the Orientation of LinearLayoutManager
         * boolean reverseLayout - If true reverse the distribution of elements*/
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        /** Sets the Layout Manager for Recycler View*/
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);

        mRecyclerLineAdapter = new RecyclerLineAdapter(Personas);
        //mRecyclerListAdapter = new RecyclerListAdapter(Personas);
        mRecyclerView.setAdapter(mRecyclerLineAdapter);

        /* If uses as Simple List- LinearLayoutManager on VERTICAL orientation implementation. */
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selector);

        toolbar = (Toolbar) findViewById(R.id.toolbar_main_activity);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setupRecycler();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                this.defaultAction();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void defaultAction() {
        Toast.makeText(this, NOT_IMPLEMENTED_YET_MESSAGE, Toast.LENGTH_SHORT).show();
    }

    /**
     * @param spanCount
     * @param LAYOUT_ORIENTATION
     * @return StaggeredGridLayoutManager
     */
    private StaggeredGridLayoutManager getStaggeredLayoutManager(int spanCount, int LAYOUT_ORIENTATION) {
        return new StaggeredGridLayoutManager(spanCount, LAYOUT_ORIENTATION);
    }

    /**
     * @param context
     * @param LAYOUT_ORIENTATION
     * @param reverseLayout
     * @return LinearLayoutManager
     */
    private LinearLayoutManager getLinearLayoutManager(Context context, int LAYOUT_ORIENTATION, boolean reverseLayout) {
        return new LinearLayoutManager(context, LAYOUT_ORIENTATION, reverseLayout);
    }

    /**
     * @param context
     * @param spanCount
     * @return GridLayoutManager
     */
    private GridLayoutManager getGridLayoutManager(Context context, int spanCount) {
        return new GridLayoutManager(context, spanCount);
    }

}
