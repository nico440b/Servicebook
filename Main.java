package book;

public class Main {



public static void main(String args[]){

Date date1 = new Date(2,11,18);
Date date2 = new Date(28,7,17);
Date date3 = new Date(11,9,19);
Date date4 = new Date(4,2,11);
Date date5 = new Date(24,12,18);



Service service1 = new Service(10,date1);
Service service2 = new Service(12,date2);
Service service3 = new Service(2,date3);
Service service4 = new Service(4,date4);

ServiceBook book1 = new ServiceBook();


book1.addService(service1);
book1.addService(service2);
book1.addService(service3);
book1.addService(service4);

book1.getNumberOfServices();
book1.getAllServiceMileages();
book1.getDateOfLastService();


System.out.println(book1.getAllServices());
System.out.println(book1.getMileageAsList());
System.out.println(book1.getService(2));
System.out.println("Date of last service: " + book1.getDateOfLastService());
System.out.println("Number of services: " + book1.getNumberOfServices());
System.out.println("Any services on this date: "  + date5 +" = "  + book1.hasServiceOnDate(date5));

}

}
