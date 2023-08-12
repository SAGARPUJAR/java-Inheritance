package HashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static ArrayList<Price> empData= new ArrayList();
    HashSet<Price> data=new HashSet<>();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Main main=new Main();
        System.out.print("Enter the no of records to be inserted : ");
        int count=sc.nextInt();
        main.insertRoomDetails(count);
        System.out.println("\n");
        main.displayRoomDetails();
        System.out.println("\n\n Search Data From List By Entering ID : ");
        String Id=sc.next();
        main.getRoomDetailsById(Id);
    }
    public void insertRoomDetails(int count){
        for (int i=0;i<count;i++) {
            Price room = new Price();
            System.out.println((i + 1) + ". Enter the Room Detail : ");
            System.out.print("Enter The Room Id                     : ");
            room.setRoomId(sc.next());
            System.out.print("Enter The Room Name                   : ");
            room.setRoomName(sc.next());
            System.out.print("Enter The Room Type                   : ");
            room.setRoomType(sc.next());
            System.out.print("Enter The Room Capacity               : ");
            room.setRoomCapacity(sc.nextInt());
            System.out.println("\nEnter the Price Details           : ");
            System.out.print("Enter The Price Id                    : ");
            room.setPriceId(sc.next());
            System.out.print("Enter The Currency                    : ");
            room.setCurrency(sc.next());
            System.out.print("Enter The Total Amount                : ");
            room.setTotalAmount(sc.nextDouble());
            data.add(room);
        }
    }
    public void displayRoomDetails(){
        System.out.println("\n");
         for(Price room: data) {
            System.out.println("Room Id    : "+room.getRoomId());
            System.out.println("Room Name  : "+room.getRoomName());
            System.out.println("Room Type  : "+room.getRoomType());
            System.out.println("Room Capacity  : "+room.getRoomCapacity());
            System.out.println("\n");
            System.out.println("Price Id  : "+room.getPriceId());
            System.out.println("Price Currency  : "+room.getCurrency());
            System.out.println("Price Total Amount  : "+room.getTotalAmount());
        }
    }
    public void getRoomDetailsById(String roomId){
       Price rooms= data.stream().iterator().next();
       if (rooms!=null)
       {
           System.out.println("Room Id    : "+rooms.getRoomId());
           System.out.println("Room Name  : "+rooms.getRoomName());
           System.out.println("Room Type  : "+rooms.getRoomType());
           System.out.println("Room Capacity  : "+rooms.getRoomCapacity());
           System.out.println("\n");
           System.out.println("Price Id  : "+rooms.getPriceId());
           System.out.println("Price Currency  : "+rooms.getCurrency());
           System.out.println("Price Total Amount  : "+rooms.getTotalAmount());
       }
    }
}