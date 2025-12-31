public class pattern2{
  public static void main(String[] args) {
    int row=4;
    int col=1;
    for(int cr=0;cr<row;cr++){
      for(int cc=1;cc<=col;cc++){

        System.out.print(cc+" ");
      }
      System.out.println();
      col++;
    }
  }
}
