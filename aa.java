import java.util.Scanner;
import java.io.*;
public class aa{
    public static void main(String[] args){
        System.out.print('\u000C');
        File f = new File("quiz responses.csv");
        try{
            Scanner input = new Scanner(f);
            String funny = input.nextLine();
            String[] ans = funny.split(",");
            while(input.hasNext()){
                String str = input.nextLine();
                String[] check = str.split(",");
                int score = 0;
                for(int i = 1; i<9; i++) if(ans[i].equals(check[i])) score++;	
                System.out.println(check[0] + " " + score + "/8");
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }	
    }
}