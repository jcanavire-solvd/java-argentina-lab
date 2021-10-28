package Areas.Salas;

public class Room {
    private String name;
    private String description;
    private String[] exits;
    private String[] items;

    public Room(String name, String description, String[] exits, String[] items) {
        this.name = name;
        this.description = description;
        this.exits = exits;
        this.items = items;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getExits() {
        return this.exits;
    }

    public void setExits(String[] exits) {
        this.exits = exits;
    }

    public String[] getItems() {
        return this.items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public Room name(String name) {
        setName(name);
        return this;
    }

    public Room description(String description) {
        setDescription(description);
        return this;
    }

    public Room exits(String[] exits) {
        setExits(exits);
        return this;
    }

    public Room items(String[] items) {
        setItems(items);
        return this;
    }



    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", exits='" + getExits() + "'" +
            ", items='" + getItems() + "'" +
            "}";
    }
    
}
