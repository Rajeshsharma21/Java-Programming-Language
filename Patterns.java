public class Patterns {
  //print patterns----------------------------------------------
  public static void main(String[] args) {
    /*for (int line = 1; line <= 5; line++) {
      for (int star = 1; star <= line; star++) {
        System.out.print("*");
      }
      System.out.println();
    }*/

    /* for (int line = 1; line <= 5; line++) {
      for (int star = 5; star >= line; star--) {
        System.out.print("*");
      }
      System.out.println();
    }*/

    /*  int n = 5;
    for (int line = 1; line <= n; line++) {
      for (int number = 1; number <= line; number++) {
        System.out.print(number);
      }
      System.out.println();
    }*/

    /*  for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println(" ");
    }*/

    /* for (int i = 1; i <= 5; i++) {
      for (int j = 5; j >= i; j--) {
        System.out.print(i);
      }
      System.out.println(" ");
    }*/

      for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(i);
      }
      System.out.println();
    }

    /* for (int row = 5; row >= 1; row--) {
    for (int col = 1; col <= row; col++) {
      System.out.print(col);
    }
      System.out.println();
    }*/

  }

  /* int count = 0;
      do{
        System.out.println("count is :"+ count + " Apna college");
        count++;
      }while(count<10); */

  /*  */

  /* public static void hollow_rectangle(int totRows, int totCols ){
    //outer loop
    for(int i = 1; i <= totRows; i++){
  //inner loop
  for(int j = 1; j<= totCols; j++){
    //cell (i,j)
    if(i == 1 || i == totRows || j == 1 || j==totCols){
      //boundary cells
      System.out.print("*");
    }
    else{
      System.out.print(" ");
    }
  }
  System.out.println();
    }
  }
  
  public static void main(String[] args) {
    hollow_rectangle(4, 5);
  } */

  /* public static void inverted_half_pyramid(int n) {
    for(int i = 1; i <= n; i++){
  for(int j = 1; j <= n-i; j++){
    System.out.print(" ");
  }
  for(int j = 1; j <= i; j++){
    System.out.print("*");
  }
  System.out.println();
    }
  }
   public static void main(String[] args) {
    inverted_half_pyramid(6);
   } */
}
