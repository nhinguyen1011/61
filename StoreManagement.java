package nhi3;

import java.util.Arrays;

public class StoreManagement {
    private int n;
    private Store[] stores;


    public StoreManagement() {

    }

    public StoreManagement(int n, Store[] stores) {
        this.n = n;
        this.stores = stores;
    }

    @Override
    public String toString() {
        return "StoreManagement{" +
                "n=" + n +
                ", stores=" + Arrays.toString(stores) +
                '}';
    }

    public long TotalBluetooth5GWifi() {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stores[i].hasTotalBluetooth5GWifi();
        }
        return sum;
    }

    public Object findmin() {
         int min = stores[0].getTotalSoldSmartPhone();
        float minpr = stores[0].getTotalPrice();
        for (int k = 0; k < stores.length; k++) {
            if (min > stores[k].getTotalSoldSmartPhone()) {
                min = stores[k].getTotalSoldSmartPhone();
            }
            if (minpr > stores[k].getTotalPrice()) {
                min = stores[k].getTotalSoldSmartPhone();
            }
        }
        return null;
    }

    public Object findmax() {
        int  max = stores[0].getTotalSoldSmartPhone();
        float maxpr = stores[0].getTotalPrice();
        for (int k = 0; k < stores.length; k++) {
            if (max < stores[k].getTotalSoldSmartPhone()) {
                max = stores[k].getTotalSoldSmartPhone();
            }
            if (maxpr< stores[k].getTotalPrice()) {
                maxpr = stores[k].getTotalSoldSmartPhone();
            }
        }

        return null;
    }
    public void print(){
        for (int i = 0; i < n; i++)
        {
            stores[i].print(i+1);

        }
    }
}

