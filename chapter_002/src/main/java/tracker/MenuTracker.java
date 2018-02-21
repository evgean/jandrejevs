package tracker;

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] action = new UserAction[7];

    public MenuTracker(Input input, Tracker trakcer) {
        this.input = input;
        this.tracker = trakcer;
    }

    public void fillAction() {
        this.action[0] = new AddItem();
        this.action[1] = new ShowItems();
        this.action[2] = new EditItem();
        this.action[3] = new DeleteItem();
        this.action[4] = new FindIBI();
        this.action[5] = new FindIBN();
        this.action[6] = new ExitApp();
    }

    public void select(int key) {
        this.action[key - 1].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.action) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 1;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter the name: ");
            String desc = input.ask("Please enter the descriprion: ");
            tracker.add(new Item(name, desc, System.currentTimeMillis()));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }

    private static class ShowItems implements UserAction {
        public int key() {
            return 2;
        }

        public void execute(Input input, Tracker tracker) {
            Item[] items = tracker.findAll();
            if (items.length != 0) {
                int position = 1;
                for (Item key : items)  {
                    String text = String.format("ID: %s, Name: %s, Desc: %s", key.getId(), key.getName(), key.getDescription());
                    System.out.println(text);
                }
            } else {
                System.out.println("No items was added yet!");
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }

    private class EditItem implements UserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the ID: ");
            String name = input.ask("Please enter the Name: ");
            String desc = input.ask("Please enter the descriprion: ");
            tracker.replace(id, name, desc);
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Edit item.");
        }
    }

    private static class DeleteItem implements UserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the ID: ");
            Item item = tracker.findById(id);
            if (item != null) {
                String text = String.format("ID: %s, Name: %s, Desc: %s - was deleted", item.getId(), item.getName(), item.getDescription());
                System.out.println(text);
                tracker.delete(id);
            } else {
                System.out.println("Do not found item");
            }

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }

    private static class FindIBI implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please enter the ID: ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(String.format("ID: %s, Name: %s, Desc: %s", item.getId(), item.getName(), item.getDescription()));
            } else {
                System.out.println("Do not found item");
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id.");
        }
    }

    private static class FindIBN implements UserAction {
        public int key() {
            return 6;
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please enter the Name: ");
            Item[] items = tracker.findByName(name);
            if (items.length == 0 || items[0] == null) {
                System.out.println("Do not found items");
            } else {
                for (Item key : items) {
                    if (key != null) {
                        System.out.println(String.format("ID: %s, Name: %s, Desc: %s", key.getId(), key.getName(), key.getDescription()));
                    }
                }
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name.");
        }
    }

    private static class ExitApp implements UserAction {
        public int key() {
            return 7;
        }

        public void execute(Input input, Tracker tracker) {

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Exit Program.");
        }
    }
}
