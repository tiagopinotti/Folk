package folk.jettech.com.folk.ui.view.viewpager.ui.view.viewpager.adapter.ui.view.viewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import folk.jettech.com.folk.R;

/**
 * Created by Eduardo on 18/02/2018.
 */

public class SlidePageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.persona_card_view, container, false);
        return viewGroup;
    }
}
