public class Device {

    String brand;
    double price;
    Device(String brand,double price)
{
    this.brand=brand;
    this.price=price;
}
public void printDevicedet(){
    System.out.println(brand);
    System.out.println(price);
}
}