package folk.jettech.com.folk.res.recycler.res.recycler.entities;

import android.widget.ImageView;

/**
 * Created by eduardo.willian on 15/02/2018.
 */

public class Persona {

    private String title, description;
    private ImageView imageView;
    private int imageSource;

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Persona(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Persona(ImageView imageView, String title, String description) {
        this.imageView = imageView;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
