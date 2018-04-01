package project;

public class Content {

    private int id;
    private String description;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id: " + id
                + ", description: " + description
                + ", title: " + title
                + "}";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Content(int id, String description, String title) {

        this.id = id;
        this.description = description;
        this.title = title;
    }
}
