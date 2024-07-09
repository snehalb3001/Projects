package vendingMachine;
import java.util.*;
import coin.Coin;
import item.Item;
import vendingMachine.VendingMachine;

public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("Machine is in Idle state");
    }
    public void clickOnStartProductSelectionButton(){
        System.out.println("Machine is in HasMoney State");
    }

    public void insertCoin(VendingMachine vendingMachine,Coin coin){
        System.out.println("Machine is in HasMoney State");
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);

    }
    public void chooseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        // 1. Get item for itemCodeNumber
        // 2. Total amount paid by User
        // 3. Compare the product and amount paid by the user
        // 4. Dispense the product

        Item item = vendingMachine.getInventory().getItem(itemCodeNumber);

        int paidByUser = 0;
        for (Coin coin: vendingMachine.getCoinList()) {
            paidByUser += coin.getValue();
        }

        if (item.getPrice() > paidByUser) {
            refundMoney(vendingMachine);
            return;
        } else {
            getChange(item.getPrice(), paidByUser);
            dispenseProduct(vendingMachine, itemCodeNumber);
            return;
        }


    }

    public List<Coin> refundMoney(VendingMachine vendingMachine){
        System.out.println("Returned the full amount back in the coin dispense tray");
        vendingMachine.setVendingMachineState(new VendingMachineState());
        return vendingMachine.getCoinList();
    }

    public void updateInventoy(VendingMachine vendingMachine,Item item,int itemCode){
        vendingMachine.getInventory().addItem(item, itemCode);

    }

    public void dispenseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        System.out.println("Currently vending machine is in Dispense State");
        System.out.println("Product has been dispense");
        vendingMachine.getInventory().updateSoldOutItem(itemCodeNumber);
        vendingMachine.setVendingMachineState(new VendingMachineState());
    }

    public void getChange(int paidByUser,int itemPrice){
        System.out.println("Returned the change in the Coin Dispense Tray: " + (paidByUser- itemPrice));
    }

}
