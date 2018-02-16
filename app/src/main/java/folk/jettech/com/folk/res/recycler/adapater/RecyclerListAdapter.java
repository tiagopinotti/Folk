package folk.jettech.com.folk.res.recycler.adapater;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import folk.jettech.com.folk.R;
import folk.jettech.com.folk.res.recycler.holder.ListHolder;
import folk.jettech.com.folk.res.recycler.res.recycler.datasource.CharacterDataSource;

/**
 * Created by Eduardo Mendes on 15/02/2018.
 */

public class RecyclerListAdapter extends RecyclerView.Adapter<ListHolder> {

    private final List<CharacterDataSource> mUsers;

    public RecyclerListAdapter(List users) {
        mUsers = users;
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.character_item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        holder.getPrimaryText().setText(mUsers.get(position).getTitle());
        holder.getSecondaryText().setText(mUsers.get(position).getDescription());
        holder.getImageView().setImageResource(R.drawable.material_flat);
    }

    @Override
    public int getItemCount() {
        return mUsers != null ? mUsers.size() : 0;
    }
}
