package folk.jettech.com.folk.res.recycler.res.recycler.datasource;

/**
 * Created by eduardo.willian on 15/02/2018.
 */

public class UserModel {

    private String title, description;

    public UserModel(String title, String description) {
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
