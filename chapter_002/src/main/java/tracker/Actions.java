package tracker;

public class Actions {
    private final Decoration decoration;
    private final Tracker tracker;
    private final Input input;

    public Actions(Decoration decoration, Tracker tracker, Input input) {
        this.decoration = decoration;
        this.tracker = tracker;
        this.input = input;
    }

    public Input getInput() {
        return this.input;
    }

    public Tracker getTracker() {
        return this.tracker;
    }

    String statAction() {
        System.out.println();
        this.decoration.greeting();
        this.decoration.menu();
        this.decoration.user();
        return this.input.ask("Select number from menu: ");
    }

    void endAction() {
        this.decoration.bye();
    }

    void createItem() {
        this.decoration.next();
        this.decoration.menuNext("Add new Item");
        this.decoration.user();
        String name = this.input.ask("Please, enter item name: ");
        String description = this.input.ask("Please, enter item description: ");
        Item item = new Item(name, description, System.currentTimeMillis());
        this.tracker.add(item);
        this.decoration.output("Item was created. Item name: " + item.getName() + ". Item ID: " + item.getId());
    }

    void showItem() {
        this.decoration.next();
        this.decoration.menuNext("Show all items");
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            int position = 1;
            for (Item key : items)  {
                System.out.println("++ item N" + position++);
                System.out.println("ID: " + key.getId());
                System.out.println("Name: " + key.getName());
                System.out.println("Description: " + key.getDescription());
                System.out.println("---------");
            }
        } else {
            System.out.println("No Items was added yet!");
        }
    }

    void editItem() {
        this.decoration.next();
        this.decoration.menuNext("Edit item");
        this.decoration.user();
        String id = this.input.ask("Please, enter item ID: ");
        Item answer = this.tracker.findById(id);
        if (answer != null) {
            this.decoration.next();
            this.decoration.menuNext("Edit item");
            this.decoration.editorMenu();
            this.decoration.user();
            String answer2 = this.input.ask("Choose number form menu: ");
            if (answer2.equals("0")) {
                String name = this.input.ask("Previous name: " + answer.getName() + ". Enter new name: ");
                if (name.equals("")) {
                    System.out.println("You need to enter something to change name");
                } else {
                    answer.setName(name);
                    System.out.println("!!! Name was changed to: " + answer.getName() + " !!!");
                }
            } else if (answer2.equals("1")) {
                String desc = this.input.ask("Enter new description: ");
                if (desc.equals("")) {
                    System.out.println("You need to enter something to change description");
                } else {
                    answer.setDescription(desc);
                    System.out.println("!!! Description was changed to: " + answer.getDescription() + " !!!");
                }
            }
        } else {
            System.out.println("Item not found!!!");
        }
    }

    void deleteItem() {
        this.decoration.next();
        this.decoration.menuNext("Delete item");
        this.decoration.user();
        String id = this.input.ask("Enter ID: ");
        boolean answer = this.tracker.delete(id);
        System.out.println(answer ? "Item was deleted" : "Do not found item");
    }

    void findByIdItem() {
        this.decoration.next();
        this.decoration.menuNext("Find item by Id");
        this.decoration.user();
        String id = this.input.ask("Enter ID: ");
        Item item = this.tracker.findById(id);
        this.decoration.next();
        if (item != null) {
            System.out.println("ID: " + item.getId());
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("---------");
        } else {
            System.out.println("Do not found item");
        }

    }

    void findByNameItem() {
        this.decoration.next();
        this.decoration.menuNext("Find item by Id");
        this.decoration.user();
        String name = this.input.ask("Enter name: ");
        Item[] items = this.tracker.findByName(name);
        if (items.length == 0 || items[0] == null) {
            System.out.println("Do not found items");
        } else {
            for (Item key : items) {
                if (key != null) {
                    System.out.println("ID: " + key.getId());
                    System.out.println("Name: " + key.getName());
                    System.out.println("Description: " + key.getDescription());
                    System.out.println("---------");
                }
            }
        }
    }
}
