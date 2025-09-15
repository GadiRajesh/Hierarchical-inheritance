public class Laptop extends Device{
    int ssd;
    Laptop(String brand,double price,int ssd){
        super(brand,price);
        this.ssd=ssd;
    }
    public void printLaptopdet(){
printDevicedet();
        System.out.println(ssd);
    }
}
