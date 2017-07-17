package sg.edu.rp.c346.simplemovielist;

/**
 * Created by 16046473 on 17/7/2017.
 */

public class MovieList {
    private String title;
    private String description;

    public MovieList(String title, String description){
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
    @Override
    public String toString(){
        return "MovieList{" +
                "title='" + title + '\'' +
                ", description=" + description + '\''+

                '}';
    }

}
