package interfaces;

public class CustomerManager {
    private  Logger[] loggers;

    public CustomerManager(Logger[] logger) {
        this.loggers = logger;
    }


    public void add(Customer customer){
        System.out.println("M��teri eklendi : " + customer.getFirstName());
        Utils.RunLogger(loggers , customer.getFirstName());
        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + " \nveri taban�na logland�");
     
     /* for(Logger logger: loggers){
      * logger.log(customer.getFisrstName());
      * }*/

    }
    public void delete(Customer customer){


        System.out.println("M��teri silindi : " + customer.getFirstName());
        Utils.RunLogger(loggers , customer.getLastName());
        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + "\\nveri taban�na logland�");



    }



}
