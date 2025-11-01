




/*public class cse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }
    }
}
*/


/*
public class cse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is NOT a Neon Number.");
        }

        sc.close();
}
}
*/
/*
public class cse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        int originalNum = num;
        int count = 0,temp = num;
        while(temp>0){
            count++;
            temp/=10;
        }
        int sum = 0;
        temp=num;
        while(temp>0){
            int digit = temp %10;
            sum +=Math.pow(digit,count);
            temp/=10;
        }
        if(sum == originalNum){
            System.out.println(originalNum + "is an armstrong number.");
        }else{
            System.out.println(originalNum +"is not an armstrong number.");
        }
    }
}

*/
/*
public class cse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
          for(int i=1;i<=n;i++){
            int digit =0;
            int m =i;
            int sum = 0;
            while(m!=0){
                m=m/10;
                digit++;

            }
            m=i;
            while(m!=0){
                int r =m%10;
                sum = sum+(int)Math.pow(r,digit);
                m=m/10;
            }
            if(sum==i){
                System.out.println(i);

            }
          }
    }
}
*/


/*public class cse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
 }
}
}
*/
/*
public class cse{
    public static void main(String[] args) {
        int range=1000;
        for(int i= 1;i<1000;i++){
            int n=i*i;
            int sum=0;
            while(n!=0){
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }

}
*/
/*class cse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a number:");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            int digit=0;
            int sqr=i*i;
            int m=i;
      p      while(m!=0){
                m=m/10;
                digit++;
            }
            int temp=(int)Math.pow(10,digit);
            int result=sqr%temp;
            if(i==result)
            System.out.println(i);

        }

    }
}
*/
/*
public class cse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int length = String.valueOf(num).length();

        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
            length--;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Disarium Number.");
        } else {
            System.out.println(originalNum + " is NOT a Disarium Number.");
        }

        sc.close();
}
}
15/10/2025*/

/*public class cse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        for(int i=length-1;i>=0;i--){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}*/

/*class cse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int sum=0;
        for(int i=0;i<length;i++){
        sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length=arr.length;
        int large=arr[0];
        for(int i=1;i<length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}*/
/*public class cse{
public static void main(String[] args) {
    int arr[]={10,20,30,40,50};
    int length=arr.length;
    int small=arr[0];
    for (int i = 0; i <length; i++) {
        if(arr[i]<small){
            small=arr[i];
        }
        
    }
    System.out.println(small);
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
    System.err.println("array");
        for(int j=0;j<arr.length;j++){
            System.err.print(arr[j]+" ");
        }
        System.out.println();
        System.err.println("Reverse of array");
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
    }
}/*
public class cse{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
    System.err.println("array");
        for(int j=0;j<arr.length;j++){
            System.err.print(arr[j]+" ");
        }
        System.out.println();
        System.err.println("Reverse of array");
        
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
    }
}*/
/*public class cse{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int left=0;
        int right=length-1;
        int temp;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
}
}
17/10/2025*/

/*public class cse{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int key=20;
        int flag=0;
        for(int i=0;i<length;i++){
            if(key==arr[i]){
                flag=1;
                break;
            }

        }
        if(flag==1){
            System.out.println("elemint found");
            }
            else{
                System.out.println("not element found");
            }
        
        }
    }*/
      
      /*public class cse{
        public static void main(String[] args) {
            int arr[]={10,20,30,40,50,60,30,50,30};
            int length=arr.length;
            int key=30;
            int count=0;
            for(int i=0;i<length;i++){
                if(arr[i]==key){
                  count++;
                }
            }
           System.out.println("my key value "+count+" time appears");
        }
      }*/
     /*public class cse{
        public static void main(String[] args) {
            int arr[]={10,2,50,90,6,30,60,90};
            int length=arr.length;
            int large=-1;
            int secondlarge=-1;
            for (int i = 0; i < length; i++) {
                if(arr[i]>large){
                    secondlarge=large;
                    large=arr[i];
                }
                else if((arr[i]>secondlarge)&&(arr[i]!=large)){
                  secondlarge=arr[i];
                }
            }
            System.out.println(secondlarge);
        }
     }*/
    /*public class cse{
        public static void main(String[] args) {
            int arr[]={10,2,50,90,6,30,60,90};
            int length=arr.length;
            int large=-1;
            int secondlarge=-1;
            for (int i = 0; i < length; i++) {
                if(arr[i]>large){
                    secondlarge=large;
                    large=arr[i];
                }
                else if((arr[i]>secondlarge)&&(arr[i]!=large)){
                  secondlarge=arr[i];
                }
            }
            System.out.println(secondlarge);
        }
     }*/


 public class cse{
        public static void main(String[] args) {
            int arr[]={10,2,50,90,6,30,60,90};
            int length=arr.length;
            int large=-1;
            int secondlarge=-1;
            int thirdlarge=-1;
            for (int i = 0; i < length; i++) {
                if(arr[i]>large){
                    thirdlarge=secondlarge;
                    secondlarge=large;
                    large=arr[i];
                }
                else if((arr[i]>secondlarge && arr[i]!=large)){
                    thirdlarge=secondlarge;
                  secondlarge=arr[i];
                }
                else if(arr[i]>thirdlarge && arr[i]!=secondlarge){
            
                }
            }
            System.out.println("third large is"+thirdlarge);
        }
     }






 
 



    



 
 



    

 
 



    

 
 



    
 
 



    
 
 



    

