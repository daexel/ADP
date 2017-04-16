/**
 * 
 */
package adp04;

/**
 * @author daexel
 *
 */
public class PascalIterativ {
	private int anzahl_zeilen=10;
    private int[][] dreieck=new int[anzahl_zeilen+2][anzahl_zeilen];
   
    public void dreieck_berechnen()
    {
        int i,j;
       
        dreieck[1][0]=1;
       
        for(j=1;j<10;j++)
        {
            for(i=1;i<j+2;i++)
            {
                dreieck[i][j]=dreieck[i-1][j-1]+dreieck[i][j-1];
            }
        }
    }
   
    public void dreieck_ausgeben()
    {
        int i,j;
       
        for(j=0;j<anzahl_zeilen;j++)
        {
            for(i=1;i<j+2;i++)
            {
                System.out.print(dreieck[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
   
    public int n_ueber_k(int n,int k)
    {
        return dreieck[n+1][k];
    }
   
    public static void main(String[] args)
    {
    	PascalIterativ iterPascal = new PascalIterativ();
        iterPascal.dreieck_berechnen();
        iterPascal.dreieck_ausgeben();
        System.out.println("2 über 4="+iterPascal.n_ueber_k(2,4));
    }
}
