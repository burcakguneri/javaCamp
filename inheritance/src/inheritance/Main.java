package inheritance;

public class Main {

    public static void main(String[] args) {
    	IndividualCustomer engin = new IndividualCustomer();
        engin.CustomerNumber = "67886";

     /*   CorporateCustomer abc = new CorporateCustomer();
        abc.CustomerNumber = "999";*/

        SendikaCustomer abc = new SendikaCustomer();
        abc.CustomerNumber = "455000";


        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.CustomerNumber = "9898";

        CustomerManager customerManager = new CustomerManager();


        Customer[] customers = {engin, abc, hepsiBurada};

        customerManager.addMultiple(customers);

    }
}