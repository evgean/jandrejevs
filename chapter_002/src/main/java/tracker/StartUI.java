package tracker;

public class StartUI {
    private static final String menuAdd = "0";
    private static final String menuShow = "1";
    private static final String menuEdit = "2";
    private static final String menuDelete = "3";
    private static final String menuFBI = "4";
    private static final String menuFBN = "5";
    private static final String menuExit = "6";

    private final Actions action;

    private StartUI(Actions action) {
        this.action = action;
    }

    private void init() {
        boolean exit = false;

        while(!exit) {
            String answer = this.action.statAction();
            if (answer.equals(menuAdd)) {
                this.action.createItem();
            } else if (answer.equals(menuShow)) {
                this.action.showItem();
            } else if (answer.equals(menuEdit)) {
                this.action.editItem();
            } else if (answer.equals(menuDelete)) {
                this.action.deleteItem();
            } else if (answer.equals(menuFBI)) {
                this.action.findByIdItem();
            } else if (answer.equals(menuFBN)) {
                this.action.findByNameItem();
            } else if (answer.equals(menuExit)) {
                this.action.endAction();
                exit = true;
            }
        }
    }



    public static void main(String[] args) {
        new StartUI(new Actions(new Decoration(), new Tracker(), new ConsoleInput())).init();
    }
}
