package interfaces;

public class CustomerManager {
    private  Logger[] loggers;

    public CustomerManager(Logger[] logger) {
        this.loggers = logger;
    }


    public void add(Customer customer){
        System.out.println("Müþteri eklendi : " + customer.getFirstName());
        Utils.RunLogger(loggers , customer.getFirstName());
        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + " \nveri tabanýna loglandý");
     
     /* for(Logger logger: loggers){
      * logger.log(customer.getFisrstName());
      * }*/

    }
    public void delete(Customer customer){


        System.out.println("Müþteri silindi : " + customer.getFirstName());
        Utils.RunLogger(loggers , customer.getLastName());
        DatabaseLogger logger = new DatabaseLogger();
        logger.log(customer.getFirstName() + "\\nveri tabanýna loglandý");



    }



}
