import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // Example of a for loop
        for (int i = 0; i < 5; i++) { // This loop will iterate 5 times
            System.out.println("Iteration " + i);
        }
        int i = 0;
        float f = 4.5f;
        double d = 5.66666666;
        boolean isName = true;
        boolean isFullName = false;
        int age = 10;
        String name = "Hasibul Hasan Siam";
        if (isName == true) {
            System.out.println("This statement is true");
        } else {
            System.out.println("This statement is false");
        }

        if (age == 11) {
            System.out.print("He is 10 years old");
        } else {
            System.out.println("He is not 10 years old");
        }
        int a = 56;
        System.out.println("The Value of a is " + a);

        System.out.println("Enter First Number");
        Scanner firstNumber = new Scanner(System.in);
        int first = firstNumber.nextInt();
        System.out.println("The first Number is" + first);
        Scanner lastNumber = new Scanner(System.in);
        System.out.println("Enter last Number");
        int last = lastNumber.nextInt();
        System.out.println("The last Number is" + last);
        int sum = first + last;
        System.out.println("The sum of firstNumber and second Number" + sum);
        System.out.println("Enter The double Number");
        Scanner dd = new Scanner(System.in);
        System.out.println("Enter The floating Number");
        float ddfirst = dd.nextFloat();
        System.out.println("The floating number is" + ddfirst);
        int date__1 = 90;
        int Date2 = 73;
        int DD_2 = 89;
        int ddd = 89;
        float dd_6736 = 64;
        System.out.println("Enter The trangle height");
        Scanner trangle_height = new Scanner(System.in);
        float trangle_heightt = trangle_height.nextFloat();
        System.out.println("Enter the traingle base");
        Scanner triangle_base = new Scanner(System.in);
        float triangle_basee = triangle_base.nextFloat();
        float traingle_area = 0.5f * trangle_heightt * triangle_basee;
        System.out.println("The Area of trainagle is" + traingle_area);
    }
}
