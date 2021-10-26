
public class FIRST_TASK {


    public static void showList(String[] a){
        System.out.println("------------------");
        System.out.println("lista:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("------------------");
    }

    public static String[] order(String [] a){
        int i = 0;
        while(i<a.length){
   int t = Integer.parseInt(a[i]);
   int x=i+1;
   while(x<a.length){
      int  k = Integer.parseInt(a[x]); 
      if((t-k>0)){
       
       a[i]=Integer.toString(k);
       
       a[x]=Integer.toString(t);
  i--; 
    break;
      }
      x++;
   }
   i++;

}
    return a;    
           
    }
    public static void main(String[] args) {

            

       args =order(args);
       showList(args);
  


       
      

}
        
}





 