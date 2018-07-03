import java.util.*;
import java.lang.*;
public class Addition
{
 public static void main(String args[])
  {
    
    int row ,col;int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("How many row and column");
     row=sc.nextInt();
     col=sc.nextInt();
     int size=row*col;

int first[][]=new int[row][col];
    int second[][]=new int[row][col];
    int res[][]=new int[row][col];
     System.out.println("Enter First Matrix");
     for(int i=0;i<row;i++)
     {
      for(int j=0;j<col;j++)
       {
        first[i][j]=sc.nextInt();
        }  
      }

      System.out.println("Enter Second Matrix");
     for(int i=0;i<row;i++)
     {
      for(int j=0;j<col;j++)
       {
        second[i][j]=sc.nextInt();
        }  
      }




      System.out.println("First matrix");
     for(int i=0;i<row;i++)
     {
      for(int j=0;j<col;j++)
       {
        System.out.print(first[i][j]+" ");
        }  
        System.out.println("\n");
      }

     System.out.println("Second matrix");
     for(int i=0;i<row;i++)
     {
      for(int j=0;j<col;j++)
       {
        System.out.print(second[i][j]+"  ");
        }  
        System.out.println("\n");
      }



      System.out.println("Addition:");
       for(int i=0;i<row;i++)
     {
      for(int j=0;j<col;j++)
       {
           res[i][j]=first[i][j]+second[i][j];
        

        for(int k=2;k<=res[i][j]/2;k++)
         {
           if(res[i][j]%k==0)
           {
             count++;
           }

         }

        if(count==1)
         {
           System.out.print(res[i][j]+"");
        }  
        else if(count==0)
         { 
           System.out.print("not prime");
         }
        }

   
}
  }
 
}
