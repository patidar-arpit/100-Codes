class Example{
    public void show(){
        System.out.println("Inside the show..!!");
    }
     public void func1(){
       System.out.println("Inside the func1");
    }  
}

class AnonymousInnerClass{

    public static void main(String [] argvs){
        Example e1  =  new Example(){
                    public void show(){
                        System.out.println("Inside the show..!!");
                    }  
                 
        };

        e1.show();
        //e1.func1();  // cannot call this because it if  is not present inside the class Example an d still pressent in the anonymous inner class
        e1.func1(); 
    }

}