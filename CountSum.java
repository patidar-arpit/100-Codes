class CountSum{
    public static void main(String [] argvs){
        String str = "12abcd4fgh";
        int sum =0;
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                //sum = sum + ch -'0';
                 sum = sum + Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println(sum);
    }
}