public class Mobile extends Device {
    int mgpx;
    Mobile(String brand,double price,int mgpx){
        super(brand,price);
        this.mgpx=mgpx;
    }
    public void printMobiledet(){
        printDevicedet();
        System.out.println(mgpx);
    }
}
