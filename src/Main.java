import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    List<Price> empData= new ArrayList();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number of Records to be Inserted : ");
        int count=sc.nextInt();
        sc.nextLine();
        Main emp=new Main();
        emp.getRoomDetails(count);
        System.out.println("\n");
        emp.displayRoomDetails();
    }

    public void getRoomDetails(int count){
        for (int i=0;i<count;i++) {
            Price emp = new Price();
            System.out.println((i + 1) + ". Enter the Room Detail : ");
            System.out.print("Enter The Room Id                     : ");
            emp.roomId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter The Room Name                   : ");
            emp.roomName = sc.nextLine();
            System.out.print("Enter The Room Type                   : ");
            emp.roomType = sc.nextLine();
            System.out.print("Enter The Room Capacity               : ");
            emp.roomCapacity = sc.nextInt();
            sc.nextLine();
            System.out.println("\nEnter the Room Amenities          : ");
            System.out.print("Enter The Amenity ID                  : ");
            emp.amenityId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter The Amenity Name                : ");
            emp.amenityName = sc.nextLine();
            System.out.print("Enter The Amenity Description         : ");
            emp.amenityDescription = sc.nextLine();
            System.out.println("\nEnter the Price Details           : ");
            System.out.print("Enter The Price Id                    : ");
            emp.priceId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter The Currency                    : ");
            emp.currency = sc.nextLine();
            System.out.print("Enter The Total Amount                : ");
            emp.totalAmount = sc.nextDouble();
            sc.nextLine();
            empData.add(emp);
        }
    }
    public void displayRoomDetails(){
        System.out.println("\n");
        for (int j=0;j<empData.size();j++){
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println((j+1)+". Room Details : ");
            System.out.println("Room ID                : "+empData.get(j).roomId);
            System.out.println("Room Name              : "+empData.get(j).roomName);
            System.out.println("Room Type              : "+empData.get(j).roomType);
            System.out.println("Room Capacity          : "+empData.get(j).roomCapacity);
            System.out.println("\n");
            System.out.println((j+1)+". Amenity Details : ");
            System.out.println("Amenity Id             : "+empData.get(j).amenityId);
            System.out.println("Amenity Name           : "+empData.get(j).amenityName);
            System.out.println("Amenity Description    : "+empData.get(j).amenityDescription);
            System.out.println("\n");
            System.out.println((j+1)+". Price Details : ");
            System.out.println("Price Id               : "+empData.get(j).priceId);
            System.out.println("Currency               : "+empData.get(j).currency);
            System.out.println("Total Amount           : "+empData.get(j).totalAmount);
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }
}