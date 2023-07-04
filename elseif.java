/*class Else {

    public static void main(String[] args) {
        int age = 25;
        if (age > 30) {
            System.out.println("you are experienced");
        } else if (age > 20) {
            System.out.println("you are semi experienced");
        } else {
            System.out.println("you are not expeirenced");
        }
    }
}*/

// OR by using user defined
import java.util.Scanner;

class If {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 30) {
            System.out.println("you are experienced");
        } else if (age > 20) {
            System.out.println("you are semi experienced");
        } else {
            System.out.println("you are not expeirenced");
        }
    }
}
