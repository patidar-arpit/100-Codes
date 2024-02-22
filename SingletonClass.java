class Example{
     int a;

    private static Example example;
    private Example(){
        a = 200;
    }

    public static Example getInstance(){
        if(example == null){
            example = new Example();
        }
        
        return example;
    }
}

class SingletonClass{

    public static void main(String [] argvs){

        Example ex = Example.getInstance();
        Example ex1 = Example.getInstance();
        System.out.println(ex.a);
        System.out.println(ex1.a);

    }
}