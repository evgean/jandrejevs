package tracker;

public class Item {
    private String id;
    private String name;
    private String description;
    private long created;
    private String[] comments;
    private int commentPosition = 0;

    public Item(String name, String description, long created) {
        this.name = name;
        this.description = description;
        this.created = created;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getComments() {
        return this.comments;
    }

    public void setComment(String comment) {
        this.comments[commentPosition++] = comment;
    }
}
