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

    private int[] ranges = new int[Integer.parseInt(MENU_EXIT) + 1];

    StartUI(Actions action) {
        this.action = action;
    }

    void init() {
        MenuTracker menu = new MenuTracker(action.getInput(), action.getTracker());
        for (int i = 0; i < this.ranges.length; i++) {
            ranges[i] = i + 1;
        }
        menu.fillAction();
//        Boolean loop = true;
        do {
            menu.show();
//            int key = Integer.valueOf(action.getInput().ask("Select: "));
            menu.select(this.action.getInput().ask("Select: ", ranges));
//            if (key != 7) {
//                menu.select(key);
//                if ("y".equals(action.getInput().ask("Do you want exit?(y): "))) {
//                    loop = false;
//                }
//            } else {
//                loop = false;
//            }

        } while (!"y".equals(action.getInput().ask("Do you want exit?(y): ")));
    }



    public static void main(String[] args) {
        new StartUI(new Actions(new Decoration(), new Tracker(), new ValidateInput())).init();
    }
}
