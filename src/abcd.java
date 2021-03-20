
import java.util.Scanner;	
public class abcd{

public static void main(String[] args)
  {
    int s,z;
    int u=0;
int x,a=0;
int d,m,y;
int f=0,w=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter date");
d=sc.nextInt();
System.out.println("enter month");
m=sc.nextInt();
System.out.println("enter year");
y=sc.nextInt();
if(y<2000)
{
    w=1;
    if(y>1700)
    {
        w=w+1;
}
if(y>1800)
{
    w=w+1;
}
if(y>1900)
{
    w=w+1;
}
}
if(y>=2000)
{
    u=2000;
}
if(y<=2000){
    u=1600;
}

for(x=u+1;x<y;x++)
{
    if(x%4==0){
        a=a+2;
    }
    else{
        a=a+1;
    }
}

a=a+w;
switch(m){
    case 1:
    {
    
    a=a+d;
        break;
    }
    case 2:
    {
        s=31;
        if(y-1%4==0)
        {
            f=1;
            
        }
        
    
        z=s+d;
        a=a+z+f;
        break;
    }
        case 3:
        {
            s=59;
            
            z=s+d;
            a=a+z;
        break;
            
        }
            case 4:
            {
                s=90;
                
                z=s+d;
                a=a+z;
                break;
            }
            case 5:{
             s=120;
             
             z=s+d;
             a=a+z;
             break;
                
            }
            case 6:{
                s=151;
                 
             z=s+d;
             a=a+z;
                break;
                
            }
            case 7:
        { s=181;
         
             z=s+d;
             a=a+z;
             break;
            
        }
            case 8:{
                 s=212;
                  
             z=s+d;
             a=a+z;
             break;
                
            }
            case 9:
        { 
            s=243;
             
             z=s+d;
             a=a+z;
             break;
            
        }
            case 10:
        {
             s=273;
              
             z=s+d;
             a=a+z;
             break;
            
        }
            case 11:{ 
            s=304;
             
             z=s+d;
             a=a+z;
             break;
                
            }
            case 12:{
        s=334;
         
             z=s+d;
             a=a+z;
             break;
                
            }
}
            if(y%4==0)
            {
         
                a=a+1;
            
            
            
            }
            
            

        
       
a=a%7;
switch(a){
    case 0:{
        System.out.println("sunday");
    break;    
    }
    case 1:
    {
        System.out.println("monday");
        break;
    }
    case 2:{
        System.out.println("tuesday");
        break;}
        case 3:
        {
            System.out.println("wednesday");
            break;
        }
        case 4:{
            System.out.println("thursday");
            break;
        }
        case 5:
        {
            System.out.println("friday");
            break;
        }
        case 6:
        {
            System.out.println("saturday");
            break;
        }
        }
}
}
        
    
    


