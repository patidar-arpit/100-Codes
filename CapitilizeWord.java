class CapitilizeWord{
    public static void main(String [] argvs){
        String str = "arpit bhai patidar";
        String [] arr = str.split(" ");
        String res = "";
        for(String s :arr){
            res = res+Character.toUpperCase(s.charAt(0))+s.substring(1,s.length()-1)+
                   Character.toUpperCase(s.charAt(s.length()-1))+" ";
        }

        System.out.println(res);
    }
}