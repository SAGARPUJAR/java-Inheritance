import java.util.ArrayList;
import java.util.Scanner;
public class Main {
   public static ArrayList<Price> empData= new ArrayList();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Main emp=new Main();
        System.out.print("Enter the no of records to be inserted : ");
        int count=sc.nextInt();
        emp.insertRoomDetails(count);
        System.out.println("\n");
        emp.displayRoomDetails();
        System.out.println("\n\n Search Data From List By Entering ID : ");
        String Id=sc.next();
        emp.getRoomDetailsById(Id);
    }

    public void insertRoomDetails(int count){
        for (int i=0;i<count;i++) {
            Price emp = new Price();
            System.out.println((i + 1) + ". Enter the Room Detail : ");
            System.out.print("Enter The Room Id                     : ");
            emp.setRoomId(sc.next());
//            emp.roomId = sc.nextInt();
            System.out.print("Enter The Room Name                   : ");
            emp.setRoomName(sc.next());
//            emp.roomName = sc.nextLine();
            System.out.print("Enter The Room Type                   : ");
            emp.setRoomType(sc.next());
//            emp.roomType = sc.nextLine();
            System.out.print("Enter The Room Capacity               : ");
            emp.setRoomCapacity(sc.nextInt());
//            emp.roomCapacity = sc.nextInt();
            /*System.out.println("\nEnter the Room Amenities          : ");
            System.out.print("Enter The Amenity ID                  : ");
            emp.amenityId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter The Amenity Name                : ");
            emp.amenityName = sc.nextLine();
            System.out.print("Enter The Amenity Description         : ");
            emp.amenityDescription = sc.nextLine();*/
            System.out.println("\nEnter the Price Details           : ");
            System.out.print("Enter The Price Id                    : ");
            emp.setPriceId(sc.next());
//            emp.priceId = sc.nextInt();
            System.out.print("Enter The Currency                    : ");
            emp.setCurrency(sc.next());
//            emp.currency = sc.nextLine();
            System.out.print("Enter The Total Amount                : ");
            emp.setTotalAmount(sc.nextDouble());
//            emp.totalAmount = sc.nextDouble();
            empData.add(emp);
        }
    }
    public void displayRoomDetails(){
        System.out.println("\n");
        /*for (int j=0;j<empData.size();j++){
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println((j+1)+". Room Details : ");
            System.out.println("Room ID                : "+empData.get(j).roomId);
            System.out.println("Room Name              : "+empData.get(j).roomName);
            System.out.println("Room Type              : "+empData.get(j).roomType);
            System.out.println("Room Capacity          : "+empData.get(j).roomCapacity);
            System.out.println("\n");
            *//*System.out.println((j+1)+". Amenity Details : ");
            System.out.println("Amenity Id             : "+empData.get(j).amenityId);
            System.out.println("Amenity Name           : "+empData.get(j).amenityName);
            System.out.println("Amenity Description    : "+empData.get(j).amenityDescription);
            System.out.println("\n");*//*
            System.out.println((j+1)+". Price Details : ");
            System.out.println("Price Id               : "+empData.get(j).priceId);
            System.out.println("Currency               : "+empData.get(j).currency);
            System.out.println("Total Amount           : "+empData.get(j).totalAmount);
            System.out.println("-------------------------------------------------------------------------------------");
        }*/

        for (Price price: empData){
            System.out.println("Room Id    : "+price.getRoomId());
            System.out.println("Room Name  : "+price.getRoomName());
            System.out.println("Room Type  : "+price.getRoomType());
            System.out.println("Room Capacity  : "+price.getRoomCapacity());
            System.out.println("\n");
            System.out.println("Price Id  : "+price.getPriceId());
            System.out.println("Price Currency  : "+price.getCurrency());
            System.out.println("Price Total Amount  : "+price.getTotalAmount());

        }
    }

    public void getRoomDetailsById(String roomId){
        for (Price prices:empData){
            if (prices.getRoomId().equals(roomId)){
/*                _price.roomId=prices.getRoomId();
                _price.roomName=prices.getRoomName();
                _price.roomType=prices.getRoomType();
                _price.roomCapacity=prices.getRoomCapacity();
                _price.pri*/
                    System.out.println("Room Id    : "+prices.getRoomId());
                    System.out.println("Room Name  : "+prices.getRoomName());
                    System.out.println("Room Type  : "+prices.getRoomType());
                    System.out.println("Room Capacity  : "+prices.getRoomCapacity());
                    System.out.println("\n");
                    System.out.println("Price Id  : "+prices.getPriceId());
                    System.out.println("Price Currency  : "+prices.getCurrency());
                    System.out.println("Price Total Amount  : "+prices.getTotalAmount());
                    break;
            }
        }
    }

}