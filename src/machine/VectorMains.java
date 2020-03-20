package machine;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;//Exception handling
class vector//Base class
{
    void hello()//Dynamic Method Dispatch
    {
    System.out.println("WELCOME!!!");
    System.out.println("VECTOR CALCULATOR:");
    System.out.println("Enter 3 for 3D");
    System.out.println("Enter 2 for 2D");
}
}
 class ThreeDimension extends vector//Child class
{ 
    private int n = 3;
    int m()//Data Hiding
    {
        return n;
    }
    void hello()
    {
        System.out.println("Hey there you are implementing 3D");
       }
     ThreeDimension()//Constructor overloading
    {
        int vect_A[]={1,1,1};
        int vect_B[]={1,1,1};
       }
    ThreeDimension(int a)
    {
         int vect_A[]={a,a,0};
         int vect_B[]={a,a,0};
       }
    ThreeDimension(int a,int b,int c)
       {
           int vect_A[]={a,b,c};
           int vect_B[]={c,b,a};
       }
    int dotProduct(int vect_A[], int vect_B[])//Method overriding
    { 
        int product = 0; 
        for (int i = 0; i < n; i++) 
            product = product + vect_A[i] * vect_B[i]; 
        return product; 
    } 
    void crossProduct(int vect_A[], int vect_B[],int cross_P[])//Method overriding
                                            
    { 
           //x-coordinate
        cross_P[0] = vect_A[1] * vect_B[2] 
                    - vect_A[2] * vect_B[1]; 
        //y-coordinate
        cross_P[1] = vect_A[0] * vect_B[2] 
                    - vect_A[2] * vect_B[0]; 
        //z-coordinate          
        cross_P[2] = vect_A[0] * vect_B[1] 
                    - vect_A[1] * vect_B[0]; 
    } 
}
class TwoDimension extends vector//Child class
{ 
    private int n = 2;
    int m()
    {
        return n;
    }
    void hello()
    {
        System.out.println("Hey there you are implementing 2D");
       }
    TwoDimension()
    {
        int vect_A[]={1,1,0};
        int vect_B[]={1,1,0};
       }
    TwoDimension(int a)
     {
         int vect_A[]={a,a,0};
         int vect_B[]={a,a,0};
       }
    TwoDimension(int a,int b)
       {
           int vect_A[]={a,b,0};
           int vect_B[]={b,a,0};
       }
    int dotProduct(int vect_A[], int vect_B[])
    { 
        int product = 0; 
        for (int i = 0; i < n; i++) 
        product = product + vect_A[i] * vect_B[i]; 
        return product; 
    } 
    void crossProduct(int vect_A[], int vect_B[],int cross_P[]) 
                                            
    { 
          //x-coordinate
          cross_P[0] = vect_A[1] * vect_B[2] 
                    - vect_A[2] * vect_B[1]; 
        //y-coordinate
        cross_P[1] = vect_A[0] * vect_B[2] 
                    - vect_A[2] * vect_B[0]; 
        //z-coordinate          
        cross_P[2] = vect_A[0] * vect_B[1] 
                    - vect_A[1] * vect_B[0]; 
    } 
}
public class VectorMains
{
    public static void main(String args[])
   {
    System.out.println('\u000C');
    Scanner in=new Scanner(System.in);
    vector a=new vector();
    ThreeDimension b=new ThreeDimension();
    TwoDimension c=new TwoDimension();
    vector r;
    r=a;//Dynamic method dispatch
    r.hello();
    int num=0;
    boolean boo=true;//Exception handling
            do{
                try{
            num=in.nextInt();
            boo=false;
        }catch(InputMismatchException e)
        {
            System.out.println("Please enter a number ot a string");
            in.nextLine();
        }
    }
    while(boo);
    if(num==2)
    {
        r=c;
        r.hello();
    }
    if(num==3)
    {
       r=b;
       r.hello();
    }
                int vect_A[]=new int[3];
                int vect_B[] =new int[3];
                int cross_P[] = {0,0,0};
    switch(num)
    {
        
    case 3: int number=0;
            boolean bo=true;//Exception handling
            do{
                try{
            System.out.println("Enter 1 for dot product and 2 for cross product");
            number=in.nextInt();
            bo=false;
        }catch(InputMismatchException e)
        {
            System.out.println("Please enter a number ot a string");
            in.nextLine();
        }
    }
    while(bo);
    switch(number)
    {
        case 1: 
                for(int i=0;i<b.m();i++)
                {
                    
                    boolean continueinput=true;//Exception handling
                    do
                    {
                    try
                    {
                        System.out.println("Enter the"+i+"th element in the first vector");
                        vect_A[i]=in.nextInt();
                        continueinput=false;
                }
                        
                    catch(InputMismatchException e)
                    {
                        System.out.println("Please enter a number not a String");
                       in.nextLine();
                    }   
                } while(continueinput);
            }
                
                for(int i=0;i<b.m();i++)
                {
                    boolean continueinput=true;//Exception handling
                    do{
                        try
                        {
                            System.out.println("Enter the"+i+"th element in the second vector");
                            vect_B[i] =in.nextInt();
                            continueinput=false;
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Please enter a number not a String");
                    in.nextLine();
                }
            }while(continueinput);
        }
                System.out.println( "Dot product:"); 
                 System.out.println (b.dotProduct(vect_A, vect_B)) ; 
                 break;
    case 2: 
            for(int i=0;i<b.m();i++)
            {               
                boolean continueinput=true;//Exception handling
                do{
                    try
                    {
                        System.out.println("Enter the"+i+"th element in the first vector");
                        vect_A[i]=in.nextInt();
                        continueinput=false;
            }
                catch(InputMismatchException e)
            {
                System.out.println("Enter a number not a String");
                in.nextLine();
            }
        }while(continueinput);
    }
           for(int i=0;i<b.m();i++)
           {
               boolean continueinput=true;//Excption handling
               do{
                   try
                   {
                       System.out.println("Enter the"+i+"th element in the second vector");
                       vect_B[i] =in.nextInt();
                       continueinput=false;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Enter a number not a String");
               in.nextLine();
            }
        }while(continueinput);
    }
            System.out.println( "Cross product:"); 
        b.crossProduct(vect_A, vect_B, cross_P);        
        for (int i = 0; i<3; i++) 
    
            System.out.println( cross_P[i] +" "); 
            break; 
    default: System.out.println("Invalid input");       
    }    break;
    case 2:number=0;
            bo=true;//Exception handling
            do{
                try{
            System.out.println("Enter 1 for dot product and 2 for cross product");
            number=in.nextInt();
            bo=false;
        }catch(InputMismatchException e)
        {
            System.out.println("Please enter a number ot a string");
            in.nextLine();
        }
    }
    while(bo);   
    switch(number)
    {
        case 1: vect_A[2]=0;
                vect_B[2]=0;
                for(int i=0;i<c.m();i++)
                {
                    boolean continueinput=true;//Exception handling
                    do{
                        try
                        {
                    System.out.println("Enter the"+i+"th element in the first vector");
                    vect_A[i]=in.nextInt();
                    continueinput=false;
                }catch(InputMismatchException e)
                {
                    System.out.println("Enter a number not a string");
                    in.nextLine();
                }
            }while(continueinput);
        }
               for(int i=0;i<c.m();i++)
           {
               boolean continueinput=true;//Excption handling
               do{
                   try
                   {
                       System.out.println("Enter the"+i+"th element in the second vector");
                       vect_B[i] =in.nextInt();
                       continueinput=false;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Enter a number not a String");
               in.nextLine();
            }
        }while(continueinput);
    }
                System.out.println( "Dot product:"); 
                 System.out.println (c.dotProduct(vect_A, vect_B)) ; 
                 break;
        case 2: 
            for(int i=0;i<c.m();i++)
                {
                    boolean continueinput=true;//Exception handling
                    do{
                        try
                        {
                    System.out.println("Enter the"+i+"th element in the first vector");
                    vect_A[i]=in.nextInt();
                    continueinput=false;
                }catch(InputMismatchException e)
                {
                    System.out.println("Enter a number not a string");
                    in.nextLine();
                }
            }while(continueinput);
        }
            for(int i=0;i<c.m();i++)
           {
               boolean continueinput=true;//Excption handling
               do{
                   try
                   {
                       System.out.println("Enter the"+i+"th element in the second vector");
                       vect_B[i] =in.nextInt();
                       continueinput=false;
           }
           catch(InputMismatchException e)
           {
               System.out.println("Enter a number not a String");
               in.nextLine();
            }
        }while(continueinput);
    }

           vect_A[2]=0;
            vect_B[2]=0;
            System.out.println( "Cross product:"); 
        c.crossProduct(vect_A, vect_B, cross_P);        
        for (int i = 0; i<3; i++) 
    
            System.out.println( cross_P[i] +" "); 
            break; 
    default: System.out.println("Invalid input");       
    }break;
    default: System.out.println("Invalid input");
}
}
}

    
        
 
 
