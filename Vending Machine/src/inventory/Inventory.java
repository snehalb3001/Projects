package inventory;

import item.Item;
import item.ItemShelf;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n) {
        inventory = new ItemShelf[n];
        initialEmptyInventory();
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    public ItemShelf[] getInventory() {
        return this.inventory;
    }

    public void initialEmptyInventory() {
        int code = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setItemCode(code);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            code++;
        }

    }

    public void addItem(Item item, int itemCode) {
        for (ItemShelf shelf : inventory) {
            if (shelf.getItemCode() == itemCode) {
                if (shelf.getSoldOut()) {
                    shelf.setItem(item);
                    shelf.setSoldOut(false);
                }
            }
        }
    }

    public Item getItem(int itemCode) {
        for (ItemShelf shelf : inventory) {
            if (shelf.getItemCode() == itemCode) {
                if (shelf.getSoldOut() == true) {
                    System.out.println("The item is already sold out");
                    return new Item();
                } else {
                    shelf.getItem();
                }
            }
        }
        System.out.println("Invalid Item Code");
        return new Item();
    }

    public void updateSoldOutItem(int itemCodeNumber) {
        for(ItemShelf shelf: inventory) {
            if (shelf.getItemCode() == itemCodeNumber) {
                shelf.setSoldOut(true);
            }
        }
    }

}
