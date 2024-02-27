class ReplaceWord{
    public static void main(String[] args)
    {
        String str = "This is the Geeks For Geeks";
 
        String word = "the";

        remove(str, word);
    }

    public static void remove(String str,String word){
        String res ="";
        String [] arr = str.split(" ");
        for(String s :arr){
            if(!s.equals(word)){
                res =res+s+" ";
            }
        }
        if(res.equals("")){
            System.out.println("Given Word not found in the String..!");
        }
        else{
            System.out.println(res);
        }
    }
}