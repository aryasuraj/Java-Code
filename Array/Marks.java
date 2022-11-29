import java.util.Scanner;

class Marks{
    public static void main(String[] args) {
    //  int [] marks = new int[5];
    //  marks[0]=34;
    //  marks[1]=37;
    //  marks[2]=35;
    // int marks[] = {1,35,68};
    //  System.out.println(marks[0]);
    //  System.out.println(marks[1]);
    //  System.out.println(marks[2]);
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size");
    int size = sc.nextInt();
    int numbers []= new int[size];
    for(int i=0;i<=size;i++){
        numbers[i]=sc.nextInt();
    }
    for(int i=0;i<=size;i++){
         System.out.println(numbers[i]);
    }
sc.close();
    }
}