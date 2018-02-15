package folk.jettech.com.folk.res.recycler.holder;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import folk.jettech.com.folk.R;

/**
 * Created by eduardo.willian on 15/02/2018.
 */

public class LineHolder extends RecyclerView.ViewHolder {

    private TextView title, description;

    public LineHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title_item);
        description = (TextView) itemView.findViewById(R.id.description_item);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getDescription() {
        return description;
    }

    public void setDescription(TextView description) {
        this.description = description;
    }

}
