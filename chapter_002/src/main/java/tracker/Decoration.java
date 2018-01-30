package tracker;

public class Decoration {

    public void greeting() {
        System.out.println("--------------------");
        System.out.println("|      WELCOM      |");
        System.out.println("--------------------");
    }

    public void menu() {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public void user() {
        System.out.println("------USER------");
    }

    public void bye() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("|  THANK YOU. BYE-BYE  |");
        System.out.println("------------------------");
    }

    public void output(String text) {
        System.out.println("!!! " + text + " !!!");
        System.out.println();
    }

    public void menuNext(String menuTex) {
        System.out.println("**** MENU: " + menuTex.toUpperCase() + " ****");
    }

    public void editorMenu() {
        System.out.println("0.Edit name");
        System.out.println("1.Edit Description");
        System.out.println("2.Exit");
    }

    public void next() {
        System.out.println("--------------------");
        System.out.println("|   PROCESSING...  |");
        System.out.println("--------------------");
    }
}
