class Example{
     class Inner{
        public void func1(){
            System.out.println("Inside the func1 of Innner class ");
        }
    }
}

class NonStaticInnerClass{
    public static void main(String [] argvs){
        
        //Treat the non static inner class as non static method inside the class;

        Example exp = new Example();
        Example.Inner inner = exp.new Inner();
        inner.func1();

    }
}