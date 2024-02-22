class Example{
    static class Inner{
        public void func1(){
            System.out.println("Inside the Innner class func1");
        }
    }
}
class StaticInnerClass{
    public static void main(String [] argvs){

        // Treat the static inner class as the static methods inside the class. and go ahead
        Example.Inner o1 = new Example.Inner();
        o1.func1();

    }
}