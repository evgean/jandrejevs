package tracker;

public class StartUI {
    private static final String MENU_ADD = "0";
    private static final String MENU_SHOW = "1";
    private static final String MENU_EDIT = "2";
    private static final String MENU_DELETE = "3";
    private static final String MENU_FBI = "4";
    private static final String MENU_FBN = "5";
    private static final String MENU_EXIT = "6";

    private final Actions action;

    StartUI(Actions action) {
        this.action = action;
    }

    void init() {
        boolean exit = false;

        while (!exit) {
            String answer = this.action.statAction();
            if (answer.equals(MENU_ADD)) {
                this.action.createItem();
            } else if (answer.equals(MENU_SHOW)) {
                this.action.showItem();
            } else if (answer.equals(MENU_EDIT)) {
                this.action.editItem();
            } else if (answer.equals(MENU_DELETE)) {
                this.action.deleteItem();
            } else if (answer.equals(MENU_FBI)) {
                this.action.findByIdItem();
            } else if (answer.equals(MENU_FBN)) {
                this.action.findByNameItem();
            } else if (answer.equals(MENU_EXIT)) {
                this.action.endAction();
                exit = true;
            }
        }
    }



    public static void main(String[] args) {
        new StartUI(new Actions(new Decoration(), new Tracker(), new ConsoleInput())).init();
    }
}
