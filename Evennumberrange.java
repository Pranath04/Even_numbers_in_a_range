package evennumber_range;
import java.util.Scanner;
class Evennumber{
	public void evenrange(int[] array, int[][] qarray) {
	int[] sol=new int[qarray.length];
    for(int i=0;i<qarray.length;i++){
        int l=qarray[i][0];
        int r=qarray[i][1];
        int counter=0;
        for(int j=l;j<=r;j++){
            if(array[j]%2==0){
                counter++;
            }
        }
        sol[i]=counter;
    }
    for(int x:sol)
    {
        System.out.print(x+" ");
    }
}
}

class Evennumberrange {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of the array");
    int n = scanner.nextInt();
    System.out.println("Enter the elements in the array");
    int[] array = new int[n];
    for (int i=0;i<n;i++)
    {
        array[i]=scanner.nextInt();
    }
    int q=scanner.nextInt();
    int[][] qarray=new int[q][2];
    for (int i=0;i<q;i++) {
        for (int j=0;j<2;j++) {
            qarray[i][j]= scanner.nextInt();
        }
    }
    scanner.close();
    Evennumber solution=new Evennumber();
    solution.evenrange(array, qarray);

}
		
}