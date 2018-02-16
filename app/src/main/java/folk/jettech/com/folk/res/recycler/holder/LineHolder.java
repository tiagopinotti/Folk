package folk.jettech.com.folk.res.recycler.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import folk.jettech.com.folk.R;

/**
 * Created by eduardo.willian on 15/02/2018.
 */

public class LineHolder extends RecyclerView.ViewHolder {

    private TextView title, description;
    private ImageView imageView;

    public LineHolder(final View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title_item);
        description = (TextView) itemView.findViewById(R.id.description_item);
        imageView = (ImageView) itemView.findViewById(R.id.image_background);
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

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
