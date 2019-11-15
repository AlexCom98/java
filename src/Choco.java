import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Choco {
    public static void main(String[] args) {

        int money = 0;
        int chocolates = 0;
        int price = 1;

    /*    while (money > price) {
            chocolates++;
            // money = money - price;
            money -= price;
        }
        System.out.println(chocolates);*/

        do {
        chocolates++;
        //money = money - price;
        money -= price;

    } while(money > price);
System.out.println(chocolates);
}

}
