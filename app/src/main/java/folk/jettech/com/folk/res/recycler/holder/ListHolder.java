package folk.jettech.com.folk.res.recycler.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import folk.jettech.com.folk.R;

/**
 * Created by eduardo.willian on 15/02/2018.
 */

public class ListHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView primaryText, secondaryText;

    public ListHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image_list);
        primaryText = (TextView) itemView.findViewById(R.id.primary_text);
        secondaryText = (TextView) itemView.findViewById(R.id.secondary_text);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getPrimaryText() {
        return primaryText;
    }

    public void setPrimaryText(TextView primaryText) {
        this.primaryText = primaryText;
    }

    public TextView getSecondaryText() {
        return secondaryText;
    }

    public void setSecondaryText(TextView secondaryText) {
        this.secondaryText = secondaryText;
    }
}
