public class pattern4 {
  public static void main(String args[]){
    int row=5;
    int col=5;
    for(int cr=0;cr<row;cr++){
      for(int cc=0;cc<col;cc++){
        System.out.print("* ");
      }
      System.out.println();
      col--;
    }
  }
}
