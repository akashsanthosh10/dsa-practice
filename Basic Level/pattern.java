import java.util.Scanner;

public class pattern {



    public static void pattern1(int n) 
    {

                
// *
// * *
// * * *
// * * * *
// * * * * *
                      
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) 
    {

// * * * * *
// * * * *
// * * *
// * *
// *
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
  
  
    public static void pattern3(int n) 
    {

//         *
//       * *
//     * * *
//   * * * *
// * * * * *
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) 
    {

// * * * * *
//   * * * *
//     * * *
//       * *
//         *
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


        public static void pattern5(int n) 
    {

//     *
//   * * *
// * * * * *
//   * * *
//     *
        int sp=n/2;
        int st=1;
        for(int i=1;i<=n;i++)
        {
        
           //System.out.println(sp+"  "+st);

           for(int k=1;k<=sp;k++)
           {
                System.out.print("  ");
           }
           for(int j=1;j<=st;j++)
           {
                System.out.print("* ");
           }
           if(i<=n/2)
           {
                sp--;
                st+=2;
           }
           else
           {
                sp++;
                st-=2;
           }
           System.out.println();
        }
    }

    public static void pattern6(int n) 
    {

// * * * *     * * * *
// * * *         * * *
// * *             * *
// * * *         * * *
// * * * *     * * * *
        int st=n/2+1;
        int sp=1;
        for(int i=1;i<=n;i++)
        {
        
           //System.out.println(st+"  "+sp+"  "+st);
            for(int j=0;j<=st;j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=st;j++)
            {
                System.out.print("* ");
            }
           
           if(i<=n/2)
           {
                st--;
                sp+=2;
           }
           else
           {
                st++;
                sp-=2;
           }
           System.out.println();
        }
    }
    public static void pattern7(int n) 
    {

//   *
//     *
//       *
//         *
//           *
        int sp=0;
        int st=1;
        for(int i=1;i<=n;i++)
        {
        
           //System.out.println(sp+"  "+st);
           for(int j=0;j<=sp;j++)
           {
                System.out.print("  ");
           }
           System.out.print("* ");
           sp++;

           System.out.println();
        }
    }
    public static void pattern8(int n) 
    {

//         *
//       *
//     *
//   *
// *
        int sp=5;
        int st=1;
        for(int i=1;i<=n;i++)
        {
        
           //System.out.println(sp+"  "+st);
           for(int j=0;j<=sp;j++)
           {
                System.out.print("  ");
           }
           System.out.print("* ");
           sp--;

           System.out.println();
        }
    }

    public static void pattern9(int n) 
    {



        for(int i=1;i<=n;i++)
        {
        
           //System.out.println(sp+"  "+st);
           for(int j=1;j<=n;j++)
           {
                if(i==j || i+j==n+1)
                System.out.print("* ");
                else
                System.out.print("  ");
           }
           System.out.println();
        }
    }
    public static void pattern10(int n) 
    {

//     * 
//   *   *
// *       *
//   *   *
//     *
        int sp1=n/2;
        int sp2=-1;
        for(int i=1;i<=n;i++)
        {
        
           //System.out.println(sp1+"  "+sp2);
           for(int j=1;j<=sp1;j++)
           {
                System.out.print("  ");
           }
           System.out.print("* ");
           for(int j=1;j<=sp2;j++)
           {
                System.out.print("  ");
           }
           if(i>1 && i<n)
           System.out.print("* ");
            if(i<=n/2)
            {
                sp1--;
                sp2+=2;
            }
           else
           {
                sp1++;
                sp2-=2;
           }

           System.out.println();
        }
    }
    public static void pattern11(int n) 
    {
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

        int t=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) 
    {
// 0 
// 1 1
// 2 3 5
// 8 13 21 34
// 55 89 144 233 377

        int t=1;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                int w=a+b;
                a=b;
                b=w;
            }
            System.out.println();
        }
    }
    public static void pattern13(int n) 
    {
// 1 
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

      
        for(int i=0;i<n;i++)
        {
            int a=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
                a=a*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void pattern14(int n) 
    {


        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void pattern15(int n) 
    {
//     1     
//   2 3 2
// 3 4 5 4 3
//   2 3 2   
//     1
        int sp=n/2;
        int d=1;
        int val=1;
        for(int i=1;i<=n;i++)
        {
            //System.out.println(sp+"  "+d);
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            int temp=val;
            for(int j=1;j<=d;j++)
            {
                System.out.print(temp+" ");
                if(j<=d/2)
                temp++;
                else
                temp--;
                

            }
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            if(i<=n/2)
            {
                sp--;
                d+=2;
                val++;
            }
            else
            {
                sp++;
                d-=2;
                val--;
            }
            System.out.println();
        }
    }
    public static void pattern16(int n) 
    {

// 1           1 
// 1 2       2 1
// 1 2 3   3 2 1 
// 1 2 3 4 3 2 1
        int sp=2*n-3;
        int d=1;
        for(int i=1;i<=n;i++)
        {
            //System.out.println(sp+"  "+d);
            int o=1;
            for(int j=1;j<=d;j++)
            {
                System.out.print(o+" ");
                o++;
            }
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            if(i==n)
            {
                d--;
                o--;
            }
            for(int j=1;j<=d;j++)
            {
                o--;
                System.out.print(o+" ");
                
            }
            d++;
            sp-=2;
            System.out.println();
        }
    }
    public static void pattern17(int n) 
    {
//     * 
//     * *
// * * * * *
//     * *
//     *

        int sp=n/2;
        int st=1;
        for(int i=1;i<=n;i++)
        {
            //System.out.println(sp+"  "+st);
           for(int j=1;j<=sp;j++)
           {
                if(i==n/2+1)
                {
                    System.out.print("* ");
                }
                else
                System.out.print("  ");

           }
           for(int j=1;j<=st;j++)
            {
                System.out.print("* ");
            }
           if(i<=n/2)
           {
            st++;

           }
           else
           {
            st--;
           }
            System.out.println();
        }
    }
    public static void pattern18(int n) 
    {
// * * * * * * * 
//   *       *
//     *   *
//       *
//     * * *
//   * * * * *
// * * * * * * *

        int sp=0;
        int st=n;
        for(int i=1;i<=n;i++)
        {
            //System.out.println(sp+"  "+st);
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=st;j++)
            {
                if((i>1 && i<=n/2)&&(j!=1 && j<st))
                System.out.print("  ");
                else
                System.out.print("* ");
            }

           if(i<=n/2)
           {
                sp++;
                st-=2;
           }
           else
           {
                sp--;
                st+=2;
           }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        // System.out.println();
        // pattern.pattern1(n);
        // System.out.println();
        // pattern.pattern2(n);
        // System.out.println();
        // pattern.pattern3(n);
        // System.out.println();
        // pattern.pattern4(n);
        // System.out.println();
        // pattern.pattern5(n);
        // System.out.println();
        // pattern.pattern6(n);
        // System.out.println();
        // pattern.pattern7(n);
        // System.out.println();
        // pattern.pattern8(n);
        // System.out.println();
        // pattern.pattern9(n);
        // System.out.println();
        // pattern.pattern10(n);
        // System.out.println();
        // pattern.pattern11(n);
        // System.out.println();
        // pattern.pattern12(n);
        // System.out.println();
        // pattern.pattern13(n);
        // System.out.println();
        // pattern.pattern14(n);
        // System.out.println();
        // pattern.pattern15(n);
        // System.out.println();
        // pattern.pattern16(n);
        // System.out.println();
        // pattern.pattern17(n);
        // System.out.println();
        pattern.pattern18(n);
        System.out.println();

        //System.out.println();
    }
}
