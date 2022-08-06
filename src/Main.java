import java.util.Scanner;

public class Main {

    static FuelQueue queue1=new FuelQueue();

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 1st name");
        String FirstName=scanner.nextLine();
        System.out.println("enter 2st name");
        String SecondName=scanner.nextLine();
        System.out.println("enter Vehicle number");
        String Vehicle=scanner.nextLine();
        System.out.println("enter Number of liters");
        int liters=scanner.nextInt();

//set name is compusory coz assigning the passager 1 is done by it
        queue1.passanger1().setName(FirstName,SecondName,Vehicle,liters);

        System.out.println(queue1.passanger1().getName());
    }


}
