package InputBufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        int value;float value1; double value2;
        System.out.print("Enter The Integer Value : ");
        try{
            value=Integer.parseInt(bufferedReader.readLine());
        }catch (Exception ex){
            System.out.println("Error : "+ex.fillInStackTrace());
            System.out.print("Please Enter Valid Integer Value : ");
            value=Integer.parseInt(bufferedReader.readLine());
        }
        System.out.print("Enter The Float Value   : ");
        try{
             value1=Float.parseFloat(bufferedReader.readLine());
        }catch (Exception ex){
            System.out.println("Error : "+ex.fillInStackTrace());
            System.out.print("Please Enter Valid Float Value : ");
            value1=Float.parseFloat(bufferedReader.readLine());
        }
        System.out.print("Enter The Double Value  : ");
        try{
             value2=Double.parseDouble(bufferedReader.readLine());
        }catch (Exception ex){
            System.out.println("Error : "+ex.fillInStackTrace());
            System.out.print("Please Enter Valid Float Value : ");
            value2=Double.parseDouble(bufferedReader.readLine());
        }
        System.out.println("\n");
        System.out.println("Integer : "+value);
        System.out.println("Float   : "+value1);
        System.out.println("Double  : "+value2);
   }
}
