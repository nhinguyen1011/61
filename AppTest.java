package nhi3;

import java.util.Scanner;

public class AppTest {
    public void main(String[] args) {


        StoreManagement storemanagement = new StoreManagement();
        storemanagement.print();
        System.out.println("total of store: "+storemanagement.TotalBluetooth5GWifi());
        System.out.printf("find max: ", storemanagement.findmax());
        System.out.println("find min: "+storemanagement.findmin());

    }


}
