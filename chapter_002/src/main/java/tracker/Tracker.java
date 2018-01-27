package tracker;

import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    public void add(Item item) {
        item.setId(generateId());
        this.items[this.position++] = item;
    }

    public void replace(String id, Item item) {
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                this.items[index] = item;
                break;
            }
        }
    }

    public void delete(String id) {
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position - index);
//                this.items[index] = null;
                this.position--;
//                for (int i = index; i < this.position; i++) {
//                    this.items[i] = this.items[i + 1];
//                }
                this.items[this.position] = null;
            }
        }
    }

    public Item[] findAll() {
        Item[] rslt = new Item[this.position];
        for (int index = 0; index < this.position; index++) {
            rslt[index] = this.items[index];
        }
        return rslt;
    }

    public Item[] findByName(String key) {
        Item[] rslt = new Item[this.position];
        int rsltIndex = 0;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] != null && this.items[index].getName().equals(key)) {
                rslt[rsltIndex] = this.items[index];
                rsltIndex++;
            }
        }
        return rslt;
    }

    public Item findById(String id) {
        Item rslt = null;
        for (Item key : this.items) {
            if (key != null && key.getId().equals(id)) {
                rslt = key;
                break;
            }
        }
        return rslt;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}




