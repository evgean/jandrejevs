package tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(generateId());
        this.items[this.position++] = item;
        return item;
    }

    public void replace(String id, String name, String desc) {
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                this.items[index].setName(name);
                this.items[index].setDescription(desc);
                break;
            }
        }
    }

    public boolean delete(String id) {
        boolean answer = false;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position - index);
                this.position--;
                this.items[this.position] = null;
                answer = true;
            }
        }
        return answer;
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
        return Arrays.copyOf(rslt, rsltIndex);
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




