class LambdaExpression{
    public static void main (String [] argvs){
        
        // Lambda fun do not have name ,acess modifier and return type
        //Java lambda functions can be only used with functional interfaces.
        FunctionalDemo funcRef = (a,b) -> System.out.println(a+b); // this body inside the lambda is the implementation of the abstract method of the FunctionalDemos
        funcRef.add(10,20); // this will call the body of the lambda.
    }
}

//we can create our own functional interface - > it is basically the inteface with one SAM method and can have n no of default and static methods
@FunctionalInterface
interface FunctionalDemo{
    void add (int a,int b);
}