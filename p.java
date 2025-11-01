









/*class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
*/
/*

class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
        if(i==1||j==1||i==4||j==5){
            System.out.print("*");
        }else{
            System.out.print(" ");

        }
    }
    System.out.println(); 
}
    }
}*/

/*class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*
class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
   
 /*class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
 }
*/
/*class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
        }
    }
}*/

/*class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number ++;
            }
            System.out.println();
        }
    }
}
/*
class p{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum =i+j;
                if(sum %2==0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}*/
/*
class p{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}*/
/*class p{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print("");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

public class p{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int arr1[]=new int[length];
        int j=0;
        for(int i=length-1;i>=0;i++){
            arr1[j]=arr[i];
            j++;

        }
        System.out.println(arr1[j]);
    }
}





