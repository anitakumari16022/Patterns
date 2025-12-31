public class pattern6 {
    public static void main(String args[]){
int row=9;
int col=1;

for(int cr=0; cr<row; cr++){
  if(cr==row/2){
    for(int cc=0;cc<0;cc++)
    System.out.print("* ");
 }

for(int cc=0;cc<col;cc++){
  System.out.print("* ");

}
System.out.println();
if(cr<row/2){
col++;
}
else
  col--;




}

    }

}

