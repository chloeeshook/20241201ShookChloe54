public class Main {
  public static void main(String[] args) {
    System.out.println("Miles\t\tkilometers");
    System.out.println("-------------------");
    for (int miles = 1; miles <= 10; miles++) {
      double kilometers = miles * 1.609;
      System.out.printf("%-10d\t%.3f\n", miles, kilometers);
    }
  }
}
  
  

  