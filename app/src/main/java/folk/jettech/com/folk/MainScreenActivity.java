package folk.jettech.com.folk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.arlib.floatingsearchview.FloatingSearchView;
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion;

import folk.jettech.com.folk.ui.view.viewpager.ViewPagerAdapter;
import folk.jettech.com.folk.ui.view.viewpager.ui.view.viewpager.animation.DepthInViewPager;
import folk.jettech.com.folk.ui.view.viewpager.ui.view.viewpager.animation.ZoomOutViewPager;

public class MainScreenActivity extends AppCompatActivity {

    private FloatingSearchView mSearchInputView;
    private DrawerLayout mDrawerLayout;
    //private RecyclerView mRecyclerViewMain, mRecyclerViewItem;
    //private RecyclerLineAdapter recyclerLineAdapter;
    //private RecyclerItemBookAdapter recyclerItemBookAdapter;
    //private List<Persona> personas;

    private ViewPager mViewPagerStart, mViewPagerMid;
    private PagerAdapter mPageAdapterStart, mPageAdapterMid;

    private CardView cardView;

    public static final int NUM_PAGES = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //mRecyclerViewMain = (RecyclerView) findViewById(R.id.recycler_view_main);
        //mRecyclerViewItem = (RecyclerView) findViewById(R.id.simple_items);

        cardView = (CardView) findViewById(R.id.break_content_card);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreenActivity.this, CategorySelectorActivity.class);
                startActivity(intent);
            }
        });

        mViewPagerStart = (ViewPager) findViewById(R.id.view_pager_items);
        mViewPagerMid = (ViewPager) findViewById(R.id.view_pager_mid);

        mPageAdapterStart = new ViewPagerAdapter(getSupportFragmentManager());
        mPageAdapterMid = new ViewPagerAdapter(getSupportFragmentManager());

        mViewPagerStart.setAdapter(mPageAdapterStart);
        mViewPagerMid.setAdapter(mPageAdapterMid);
        mViewPagerStart.setPageTransformer(true, new DepthInViewPager());
        mViewPagerMid.setPageTransformer(true, new ZoomOutViewPager());

        //personas = new ArrayList<>();

        //personas.add(new Persona("Title", "Item description"));
//        personas.add(new Persona("Title", "Item description"));
//        personas.add(new Persona("Title", "Item description"));
//        personas.add(new Persona("Title", "Item description"));
//        personas.add(new Persona("Title", "Item description"));
//        personas.add(new Persona("Title", "Item description"));
//
//        recyclerLineAdapter = new RecyclerLineAdapter(personas);
//        recyclerItemBookAdapter = new RecyclerItemBookAdapter(personas);
//
//        mRecyclerViewItem.setAdapter(recyclerItemBookAdapter);
//        mRecyclerViewItem.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
//
//        mRecyclerViewMain.setAdapter(recyclerLineAdapter);
//        mRecyclerViewMain.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

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
