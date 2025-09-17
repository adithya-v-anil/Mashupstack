public class day5 {
public static void main(String args[]){ 

   int a[]=new int[5];

a[0]=98;
a[1]=62;  
a[2]=85;  
a[3]=25;  
a[4]=79;  

for(int i=0;i<a.length;i++) {
if( a[i]>=90 ){
    System.out.println(a[i]+" : Excellent");
}
else if( a[i]<=89 && a[i]>=75 ){
    System.out.println(a[i]+" : Good");}

    else if( a[i]<=74 && a[i]>=50 ){
        System.out.println(a[i]+" : Average");
    }

     else if( a[i]<50 ){
        System.out.println(a[i]+" : Fail");
    }
} 
}
    
}