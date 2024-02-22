class RemoveSpaces{
     public static void main(String [] argvs){
        String str = "Arpit Pati dar";
        String [] arr = str.split(" ");
        String res = String.join("",arr);
        System.out.println(res);
     }
}