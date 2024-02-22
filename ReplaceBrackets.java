class ReplaceBrackets{
    public static void main(String [] argvs){
        String s = "(a+b)=c";
        String result = s.replaceAll("[(){}]","");
        System.out.println("Expression without brackets : "+result);   
    }
}