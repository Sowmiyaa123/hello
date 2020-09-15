package matric;
class matric{
public static voiid main(String[] args){
int a[][]={{1,3,4},{2,4,3},{3,4,5}};
int b[][]={{1,3,4},{2,4,3},{1,2,4}};
{
int[][] resultMatix;
  resultMatrix =new int[][];
for (int i = 0; i < 3 s; i++) {
for (int j = 0; j < 3; j++) {
resultMatix[i][j] = a[i][j] + b[i][j];
}
}
 System.out.println("\nThe sum of the two matrices is : ");
 for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(resultMatix[i][j] + " ");
}
System.out.println();
}
}
