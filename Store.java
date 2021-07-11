package nhi3;

import java.util.Scanner;

public class Store {
    private String name;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store() {
    }

    public Store(Scanner scanner,int index) {
        System.out.println("name of store: ");
        this.name = scanner.nextLine();
        System.out.println("address of store: ");
        this.address = scanner.nextLine();
        System.out.println("address of store: ");
        this.n = scanner.nextInt();

        this.phones = new SmartPhone[n];
        for (int i=0;i<=n;i++){
            this.phones[i]=new SmartPhone(scanner,i+1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getPhones() {
        return phones;
    }

    public void setPhones(SmartPhone[] phones) {
        this.phones = phones;
    }

    public int getTotalSoldSmartPhone() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += phones[i].getTotalSold();
        }
        return sum;
    }


    public float getTotalPrice(){
        long sum =0;
        for (int i = 0; i < n; i++)
        {
            sum += phones[i].getTotalSold() * phones[i].getPrice() ;
        }
        return sum;
    }

    public long hasTotalBluetooth5GWifi(){
        long sum =0;
        for (int i = 0; i < n; i++)
        {
            if (phones[i].isHasWifi() && phones[i].isHas5G() && phones[i].isHasBluetooth())
            {
                sum ++;
            }
        }
        return sum;
    }


    public void print(int i) {
        System.out.println("name of store: "+i+getName());
        System.out.println("address of store: "+i+getAddress());
        System.out.println("number of store: "+i+getN());

        System.out.println("infor of store: ");
        for (int j = 0; j < n; j++)
        {
            phones[j].print(j+1);
        }
    }
}
