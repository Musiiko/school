import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.print("Enter a score on a twelve-point scale  = ");
        int number = score.nextInt();
        switch (number){
            case 1:
            case 2:
            case 3:{
                System.out.println("Your score is two");
                break;
            }
            case 4:
            case 5:
            case 6:{
                System.out.println("Your score is three");
                break;
            }
            case 7:
            case 8:
            case 9:{
                System.out.println("Your score is four");
                break;
            }
            case 10:
            case 11:
            case 12:{
                System.out.println("Your score is five");
                break;
            }
            default:{
                System.out.println("Error . There is no such rating. Enter again.");
            }
        }
    }
}