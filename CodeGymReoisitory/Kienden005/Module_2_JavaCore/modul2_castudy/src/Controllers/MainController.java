package Controllers;

import Commons.*;
import Models.*;
import Sort.ComparatorCustomer;

import java.util.*;

public class MainController {
    public static Scanner sc = new Scanner(System.in);

    public static void displaymainmenu() {

        System.out.println("1.Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information Customer\n" +
                "5.Add New Booking Resort \n" +
                "6.Exit\n"
        );
        switch (sc.nextInt()) {
            case 1:
                addNewServices();
            case 2:
                showServices();
            case 3:
                addNewCustommer();
            case 4:
                showInforCustommer();
            case  5:
                addBookingCustommer();
            case 6:
                System.exit(0);
            default:
                System.out.println("Error. Back to menu");
                backtoMainmenu();

        }
    }
 private static void addBookingCustommer(){
     ArrayList<Customer> listCustommer = FuncWriteAnhReadCustommer.getCustommerFromCSV();
     Collections.sort(listCustommer, new ComparatorCustomer());
     int i=1 ;
     for (Customer customer : listCustommer) {
         System.out.println("---------");
         System.out.printf("No " +i + '\t');
         System.out.println(customer.ShowCustommer());
         System.out.println("------------");
         i++ ;
     }
     System.out.println("Chosse Custoomer Booking: ");
     Customer customer = listCustommer.get(sc.nextInt()-1);
     System.out.println("1.  Booking Villa\n" +
             "2. Booking House\n" +
             "3. Booking Room\n");
     System.out.println("Chosse Services Booking: ");
     int chosse = sc.nextInt();
     switch (chosse){
         case 1:
             i = 1 ;
             ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
             for (Villa villa : listVilla){
                 System.out.println("------------");
                 System.out.println("No: " + i);
                 System.out.println(villa.showInfor());
                 System.out.println("------------");
                 i++ ;
             }
             System.out.println("Chosse Villa Booking: ");
             Villa villa = listVilla.get(sc.nextInt()-1);
             customer.setUserServices(villa) ;
             break;
         case 2:
             i = 1 ;
             ArrayList<House> listHouse = FuncWriteAndReadFileHouse.getHouseFromCSV();
             for (House house : listHouse){
                 System.out.println("------------");
                 System.out.println("No: " + i);
                 System.out.println(house.showInfor());
                 System.out.println("------------");
                 i++ ;
             }
             System.out.println("Chosse Villa Booking: ");
             House house = listHouse.get(sc.nextInt()-1);
             customer.setUserServices(house) ;
             break;
         case 3 :
             i = 1 ;
             ArrayList<Rooms> listRoom =FuncWriteAndReadFileRooms.getRoomFromCSV();
             for (Rooms rooms : listRoom){
                 System.out.println("------------");
                 System.out.println("No: " + i);
                 System.out.println(rooms.showInfor());
                 System.out.println("------------");
                 i++ ;
             }
             System.out.println("Chosse Villa Booking: ");
             Rooms rooms = listRoom.get(sc.nextInt()-1);
             customer.setUserServices(rooms) ;
             break;
     }
    ArrayList<Customer> listBooking =FruncWriteBokingCustommer.getCustommerFromCSV();
     listBooking.add(customer);
     FruncWriteBokingCustommer.writeBookingCustommerToFileCSV(listBooking);
     System.out.println("Add Booking" + customer.getFullName() + "good");
     sc.nextLine();
     backtoMainmenu();




 }
    private static void addNewCustommer() {
        String connet = "";
        String err = "";
        Customer customer = new Customer();
        customer.setIdCustomer(UUID.randomUUID().toString().replace("-", ""));
        System.out.printf("Enter Full name");
        customer.setFullName(sc.nextLine());
        while (!FuncValidation.cheickNameService(customer.getFullName())) {
            System.out.println("Full Name invalid. Please try again !!!");
            System.out.println("enter Full Name: ");
            customer.setFullName(sc.nextLine());
        }
        // brithday
        System.out.printf("Enter Brithday: ");
        customer.setBirthday(sc.nextLine());
        while (!FuncValidation.chieckBrithday(customer.getBirthday())) {
            System.out.println("Brithday invalid. Please try again !!!");
            System.out.println("enter Brithday: ");
            customer.setBirthday(sc.nextLine());
        }
        // sex
        System.out.println("Enter Sex: ");
        customer.setSex(sc.nextLine());
        while (!FuncValidation.cheickSex(customer.getSex())) {
            System.out.println("Sex. Please try again !!!");
            System.out.println("enshter Sex: ");
            customer.setSex(sc.nextLine());
        }
// phone Number
        System.out.println("Enter Phone Number: ");
        customer.setPhoneNumber(sc.nextLine());
        while (!FuncValidation.cheickPhoneNumber(customer.getPhoneNumber())) {
            System.out.println("Phone Number try again !!!");
            System.out.println("enter Phone Number: ");
            customer.setPhoneNumber(sc.nextLine());

        }
//IDcard
        System.out.println("Enter IDCard: ");
        customer.setIdCard(sc.nextLine());
        while (!FuncValidation.cheickIDcard(customer.getIdCard())) {
            System.out.println("ID Card try again !!!");
            System.out.println("enter ID Card: ");
            customer.setIdCard(sc.nextLine());
        }
        customer.setIdCard(customer.getIdCard().substring(0, 4) + " " + customer.getIdCard().substring(4, 8));
        //Email
        System.out.println("Enter Email: ");
        customer.setEmail(sc.nextLine());
        while (!FuncValidation.cheickMail(customer.getEmail())) {
            System.out.println("Email try again !!!");
            System.out.println("enter Email: ");
            customer.setEmail(sc.nextLine());
        }
        //style Guest
        System.out.println("Style Guest: ");
        customer.setStyleGuest(sc.nextLine());
        // Adress
        System.out.println("Add Adress: ");
        customer.setAddress(sc.nextLine());
        // Used Sẻvices


        ArrayList<Customer> listCustommer = FuncWriteAnhReadCustommer.getCustommerFromCSV();
        // sau khi thực hiên xong  thì thêm vào ds villa đó
        listCustommer.add(customer);
        // sau đó lưu list villa vài file
        FuncWriteAnhReadCustommer.writeCustommerToFileCSV(listCustommer);

        System.out.println("ADD Custommer " + customer.getFullName());
        sc.nextLine();

        backtoMainmenu();

    }

    ;

    private static void showInforCustommer() {
        ArrayList<Customer> listCustommer = FuncWriteAnhReadCustommer.getCustommerFromCSV();
       Collections.sort(listCustommer, new ComparatorCustomer());
       int i=1 ;
        for (Customer customer : listCustommer) {
            System.out.println("---------");
            System.out.printf("No " +i + '\t');
            System.out.println(customer.ShowCustommer());
            System.out.println("------------");
            i++ ;
        }

    }

    ;

    private static void backtoMainmenu() {
        System.out.println("EnterContinune");
        sc.nextLine();
        System.out.println("---------");
        displaymainmenu();
    }

    private static void addNewServices() {
        System.out.println("---------");
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit\n");
        switch (sc.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRooms();
                break;
            case 4:
                displaymainmenu();
                System.out.println("---------");
                break;
            case 5:
            default:
                System.out.println("EnterContinune");
                displaymainmenu();
        }
    }

    private static Services addNewServices(Services service) {
        String content = "";
        String errMes = "";
        service.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        System.out.printf("Enter Name Servvices: ");
        service.setNameServices(sc.nextLine());
        while (!FuncValidation.cheickNameService(service.getNameServices())) {
            System.out.println("Name services invalid. Please try again !!!");
            System.out.println("enter Name Services: ");
            service.setNameServices(sc.nextLine());
        }

        content = " Enter Area Used: ";
        errMes = "Area Used invalid(Area >30,Area Must Be A Double).PleaseTry Again!!  ";
        service.setAreaUsed(FuncValidation.cheickValiNumberDouble(content, errMes));
//       while (service.getAreaUsed() <= 30) {
//           System.out.println(errMes);
//           service.setAreaUsed(FuncValidation.cheickValiNumberDouble(content,errMes));
//       }
        // Enter Rent Cost
        content = " Enter Rent Cost: ";
        errMes = "Rent Cost invalid(Area >30,Area Must Be A Double).PleaseTry Again!!  ";
        service.setRentenCost(FuncValidation.cheickValiNumberDouble(content, errMes));
        while (service.getRentenCost() <= 0) {
            System.out.println(errMes);
            service.setRentenCost(FuncValidation.cheickValiNumberDouble(content, errMes));
        }
        // Max number
        content = " Enter max of number: ";
        errMes = "Max Of Number invalid(Area >30,Area Must Be A Double).PleaseTry Again!!  ";
        service.setMaxPeople(FuncValidation.cheickValiNumberInterger(content, errMes));
        while (service.getMaxPeople() <= 0 || service.getMaxPeople() >= 20) {
            System.out.println(errMes);
            service.setMaxPeople(FuncValidation.cheickValiNumberInterger(content, errMes));
        }
        sc.nextLine();
        // Type Of rent
        System.out.printf("Enter Type of rent: ");
        service.setTypeOfrent(sc.nextLine());
        while (!FuncValidation.cheickNameService(service.getTypeOfrent())) {
            System.out.println("Type Of Rent invalid. Please try again !!!");
            System.out.println("enter Type Of Rent: ");
            service.setTypeOfrent(sc.nextLine());
        }
        return service;
    }

    public static void addNewVilla() {
        String content = "";
        String errMes = "";
        Services villa = new Villa();
        villa = addNewServices(villa);
        System.out.printf("Enter Room Stander: ");
        ((Villa) villa).setRoomStard(sc.nextLine());
        while (!FuncValidation.cheickNameService(((Villa) villa).getRoomStard())) {
            System.out.println("Room Standard invalid. Please try again !!!");
            System.out.println("enter Room Standard: ");
            ((Villa) villa).setRoomStard(sc.nextLine());
        }
        System.out.printf("Enter Decription: ");
        ((Villa) villa).setDescribeConvenien(sc.nextLine());
        while (!FuncValidation.cheickNameService(((Villa) villa).getDescribeConvenien())) {
            System.out.println("Description Convent invalid. Please try again !!!");
            System.out.println("enter Description Convent: ");
            ((Villa) villa).setDescribeConvenien(sc.nextLine());
        }
        // Area Swwin
        content = "Enter ArePloot";
        errMes = "Please Try again!";
        ((Villa) villa).setAreaSwim(FuncValidation.cheickValiNumberDouble(content, errMes));
        while (((Villa) villa).getAreaSwim() < 0) {
            System.out.println(errMes);
            ((Villa) villa).setAreaSwim(FuncValidation.cheickValiNumberDouble(content, errMes));
        }
        // Num Floot
        content = "Enter Num Floot";
        errMes = "Please Try again!";
        ((Villa) villa).setNumFloot(FuncValidation.cheickValiNumberInterger(content, errMes));
        while (((Villa) villa).getNumFloot() < 0) {
            System.out.println(errMes);
            ((Villa) villa).setNumFloot(FuncValidation.cheickValiNumberInterger(content, errMes));
        }
        // trước khi lưu vào file chúng  ta phải lấy ra danh sách các villa tring file villa ra list villa
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        // sau khi thực hiên song  thì thêm vào ds villa đó
        listVilla.add((Villa) villa);
        // sau đó lưu list villa vài file
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("ADD Villa " + villa.getNameServices());
        sc.nextLine();
        backtoMainmenu();

    }

    private static void addNewHouse() {
        String content = "";
        String errMes = "";
        Services house = new House();
        house = addNewServices(house);
        System.out.printf("Enter Room Stander: ");
        ((House) house).setRoomStard(sc.nextLine());
        while (!FuncValidation.cheickNameService(((House) house).getRoomStard())) {
            System.out.println("Room Standard invalid. Please try again !!!");
            System.out.println("enter Room Standard: ");
            ((House) house).setRoomStard(sc.nextLine());
        }
// Decriptiom
        System.out.printf("Enter Decription: ");
        ((House) house).setDescribeConvenien(sc.nextLine());
        while (!FuncValidation.cheickNameService(((House) house).getDescribeConvenien())) {
            System.out.println("Description Convent invalid. Please try again !!!");
            System.out.println("enter Description Convent: ");
            ((House) house).setDescribeConvenien(sc.nextLine());
        }

        // Num Floot
        content = "Enter Num Floot";
        errMes = "Please Try again!";
        ((House) house).setNumFloot(FuncValidation.cheickValiNumberInterger(content, errMes));
        while (((House) house).getNumFloot() < 0) {
            System.out.println(errMes);
            ((House) house).setNumFloot(FuncValidation.cheickValiNumberInterger(content, errMes));
        }


        ArrayList<House> listHouse = FuncWriteAndReadFileHouse.getHouseFromCSV();
        listHouse.add((House) house);
        FuncWriteAndReadFileHouse.writHouseToFileCSV(listHouse);
        System.out.println("ADD House: " + house.getNameServices());
        sc.nextLine();
        backtoMainmenu();


    }

    private static void addNewRooms() {
        Services room = new Rooms();
        room = addNewServices(room);
        System.out.printf("Enter Freecom:  ");
        ((Rooms) room).setFreeCome(sc.nextLine());
        while (!FuncValidation.cheickFreecome(((Rooms) room).getFreeCome())) {
            System.out.println("Free Come invalid. Please try again !!!");
            System.out.println("enter Free Come: ");
            ((Rooms) room).setFreeCome(sc.nextLine());
        }


        ArrayList<Rooms> listRooms = FuncWriteAndReadFileRooms.getRoomFromCSV();
        listRooms.add((Rooms) room);
        FuncWriteAndReadFileRooms.writeRoomToFileCSV(listRooms);
        System.out.println("ADD Rooms " + room.getNameServices());
        sc.nextLine();
        backtoMainmenu();

    }

    private static void showServices() {
        System.out.println("---------");
        System.out.println("1.Show All Villa\n" +
                "2.Show All House\n" +
                "3.Show All Room\n" +
                "4.Back to menu\n" +
                "5.Exit\n");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                displaymainmenu();
                break;
            case 2:
                showAllHouse();
                displaymainmenu();
                break;
            case 3:
                showAllRoom();
                displaymainmenu();
                break;
            case 4:
                displaymainmenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("\nBack to menu");
                backtoMainmenu();
        }
    }
  public  static  void showVillaDulicate(){
      ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();

  }
    public static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("---------");
            System.out.println(villa.showInfor());
            ;
            System.out.println("---------");
        }
    }

    public static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteAndReadFileHouse.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("---------");
            System.out.println(house.showInfor());
            ;
            System.out.println("---------");
        }
    }

    public static void showAllRoom() {
        ArrayList<Rooms> listRooms = FuncWriteAndReadFileRooms.getRoomFromCSV();
        for (Rooms rooms : listRooms) {
            System.out.println("---------");
            System.out.println(rooms.showInfor());
            ;
            System.out.println("---------");
        }
    }
}
