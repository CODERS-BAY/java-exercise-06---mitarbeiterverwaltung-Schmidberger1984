package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {


  public static void main(String[] args) {
    Employee[] array = new Employee[2];
    int count = 0;
    do{
      if (count==array.length) array=newArray(array);
      array[count]=createEntries();
      count++;
    }while(exit());
   printList(array);
  }


  private static Employee[] newArray(Employee[] oldArray) {
    Employee[] newArray = new Employee[oldArray.length*2];
    newArray= Arrays.copyOf(oldArray,oldArray.length);
   return newArray;
  }

  private static void printList(Employee[] array){
    System.out.println("Folgende Mitarbeiter wurden angelegt");
    for (int i = 0; i  < array.length ; i ++) {
      System.out.println(array[i].getId()+" "+array[i].getFirstname()+" "+array[i].getLastname());
    }
    System.out.println("Auf Wiedersehen!");
  }

  private static int generateID(){
    Random random=new Random();
    return random.nextInt(1000);
  }
  private static boolean exit(){
    char stopp;
    Scanner scanner=new Scanner(System.in);
    System.out.println("x für beenden. Beliebige Taste für weiter");
    stopp=scanner.next().charAt(0);
    return stopp!='x';
  }

  private  static Employee createEntries(){
    System.out.println("Bitte legen Sie eine Abeitlung an:");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Abteilung ");
    String department=scanner.nextLine();
    System.out.print("Land ");
    String land=scanner.nextLine();
    System.out.print("Stadt ");
    String town=scanner.nextLine();
    System.out.println("Bitte legen Sie einen Mitarbeiter an:");
    System.out.print("Vorname ");
    String firstname=scanner.nextLine();
    System.out.print("Nachname ");
    String lastname=scanner.nextLine();
    System.out.print("Sie haben folgenden Mitarbeiter angelegt");
   // Department position =new Department(department,generateID(),land,town);
    Employee newEmployee = new Employee(firstname,lastname,generateID(),new Department(department,generateID(),land,town));
    newEmployee.print();
    return newEmployee;
  }
}
