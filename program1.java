 class program1 {
public static void main(String[] args) {
    System.out.println("program started");
     int[] a1;//array declaration
     a1= new int[5];//array intialization
     System.out.println("first element :"+a1[0]);
     System.out.println("print all element");
     for(int i=0;i<=4;i++){
         System.out.println(a1[i]);

     }
     System.out.println("storing values in array");
     a1[0]=10;
     a1[1]=20;
     a1[2]=30;
     a1[3]=40;
     a1[4]=50;
     System.out.println("print all element");
     for (int i = 0; i <=4; i++) {
         System.out.println(a1[i]);
         
     }

    System.out.println("program ended");
}    
}
