public class Main {

    public static void main(String[] args) {

        Customer customer1= new Customer();
        //lastName özelliği customer classında bulunmamasına
        //rağmen Person classını kullanarak extend ettik ve
        //person classında bulunanan özellikleri diğer classların
        //kullanımı için kalıttık

        customer1.lastName= "";

        Employee employee1 = new Employee();
        employee1.firstName= "";          /** Burda person Employee classında bulunmayan ama o classa Person classından inherit edilen
                                             firstName özelliğini çağırdık**/


        //Burda ise yukarıdan farklı olarak bir class içindeki
        // değikeni değil de bir class içindeki metodu extend ettik

        CustomerManager customerManager1 = new CustomerManager();
        customerManager1.List();/** Burada ise customerManager classında olmayan ama o classa PersonManager classından inherit edilen
                                    List() metodunu çağırdık **/




    }
}
