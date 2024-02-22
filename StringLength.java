class StringLength{
     public static void main(String [] argvs){
        String str = "abcdef";
        int length = 0;
         for(char ch : str.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
}