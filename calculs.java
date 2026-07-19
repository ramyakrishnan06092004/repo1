package repo1;

import java.util.*;

public class calculs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("ENTER THE FIRST NUM:");
    double a=scan.nextDouble();
    System.out.println("ENTER THE SECOND NAME:");

    double b=scan.nextDouble();;

 System.out.println("enter both the nums with symbol");
    int ch=scan.nextInt();
    double ans =0;
   switch(ch){
       case 1:
            ans=a+b;
            {
                System.out.println("add="+ans);
            }
            case 2:
                ans=a-b;
                {
                    System.out.println("sub ans="+ans);
                }
                case 3:
                    ans=a*b;
                    {
                        System.out.println("mul ans="+ans);
                    }
                    case 4:
                        ans=a/b;
                        {
                            System.out.println("div ans="+ans);
                        }
                        default:{
                            System.out.println("invalid");
                        
                            
                    }
        }
    }
}
    

