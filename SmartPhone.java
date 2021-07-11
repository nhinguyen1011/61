package nhi3;

import java.util.Scanner;

public class SmartPhone {
    private String brand ;
    private boolean hasBluetooth;
    private boolean has5G ;
    private boolean hasWifi;
    private String os ;
    private float memory ;
    private String color ;
    private long price ;
    private int totalSold;

    public SmartPhone(Scanner scanner,int index) {
        System.out.println("brand: " );
        this.brand = scanner.nextLine();
        System.out.println("has bluetooth : ");
        this.hasBluetooth =scanner.nextBoolean();
        System.out.println("has 5G : ");
        this.has5G = scanner.nextBoolean();
        System.out.println("has wifi: ");
        this.hasWifi = scanner.nextBoolean();
        this.os =  scanner.nextLine();
        System.out.println("memory: ");
        this.memory =scanner.nextInt();
        System.out.println("color: ");
        this.color =scanner.nextLine();
        System.out.println("price: ");
        this.price= scanner.nextInt();
        System.out.println("total: ");
        this.totalSold =scanner.nextInt();
    }

    public SmartPhone() {

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = this.brand;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                ", has5G=" + has5G +
                ", hasWifi=" + hasWifi +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                 ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }
    public void print(int i){
        System.out.println("\t\t - infor of smartphone "+i+": ");
        System.out.println("\t\t\t - name of brand:"+brand);
        System.out.println("\t\t\t - smartphone has bluetooth:"+ (hasBluetooth? "yes":"no") );
        System.out.println("\t\t\t - smartphone has 5g:"+(has5G? "yes":"no") );
        System.out.println("\t\t\t - smartphone has wifi:"+(hasWifi? "yes":"no") );
        System.out.println("\t\t\t - os of smartphone:"+os);
        System.out.println("\t\t\t - memory of smartphone:"+memory);
        System.out.println("\t\t\t - color of smartphone:"+color);
        System.out.println("\t\t\t - price of smartphone:"+price);
        System.out.println("\t\t\t - total of smartphone:"+totalSold);
    }
}
