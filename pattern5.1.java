public class pattern5 {
  public static void main(String args[]){
    int row=5;
    int col=9;
    int nspace=0;
    for(int cr=0;cr<row;cr++){
    for(int cspace=1;cspace<=nspace;cspace++){

      System.out.print(" ");
    }
    for(int cc=1;cc<=col;cc++){
      System.err.print("* ");
    }
     for(int cpace=1;cpace<=nspace;cpace++){

      System.out.print(" ");
    }
       System.out.println();

  col -= 2;
  nspace += 2 ;
  }
     

  }
}
