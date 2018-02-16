package folk.jettech.com.folk.res.recycler.adapater;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import folk.jettech.com.folk.R;
import folk.jettech.com.folk.res.recycler.holder.LineHolder;
import folk.jettech.com.folk.res.recycler.res.recycler.entities.Persona;

/**
 * Created by eduardo.willian on 15/02/2018.
 */

public class RecyclerLineAdapter extends RecyclerView.Adapter<LineHolder> {

    private final List<Persona> mUsers;

    public RecyclerLineAdapter(List users) {
        mUsers = users;
    }

    @Override
    public LineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LineHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.persona_card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(LineHolder holder, int position) {
        holder.getTitle().setText(mUsers.get(position).getTitle());
        holder.getDescription().setText(mUsers.get(position).getDescription());
        holder.getImageView().setImageResource(mUsers.get(position).getImageSource());
    }

    @Override
    public int getItemCount() {
        return mUsers != null ? mUsers.size() : 0;
    }


}
