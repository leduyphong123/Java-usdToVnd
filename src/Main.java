import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double usd;
        Scanner input=new Scanner(System.in);
        System.out.println("input usd : ");
        usd = input.nextDouble();
        System.out.print(usd + " usd to " + (usd*23000) +" vnd ");
    }

}