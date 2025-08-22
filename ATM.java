


import java.util.*;
class ATM
{
    public static void main(String abc[])
    {
        int wid,depo,bal=600;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter 1 to width cash");
            System.out.println("enter 2 to depo cash");
            System.out.println("enter 3 to check cash");
            System.out.println("enter 4 to exite cash");
            System.out.println("enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("enter  widthwral amount");
                wid=sc.nextInt();
                if(bal>=wid)
                {
                bal=bal-wid;
                System.out.println("succesfully deposite....");
                }
                else
                {
                    System.out.println("No Balanace Avalible");
                }
                break;
                
                case 2:System.out.println("enter deposite amount");
                depo=sc.nextInt();
                bal=bal+depo;
                System.out.println("succesfully deposite....");
                break;
            
            case 3:System.out.println("balance="+bal);
                break;
                
                case 4:System.exit(0);
            }
            
        }
    }
}
