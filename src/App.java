import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inpChar = scan.next().charAt(0);

        System.out.print("Input Triangle Hight: ");
        int height = scan.nextInt();

        scan.close();

        for(int i = 0; i < height; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(inpChar);
            }
            System.out.println();
        }
    }
}
