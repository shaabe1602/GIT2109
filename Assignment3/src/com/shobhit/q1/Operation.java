package com.shobhit.q1;


public class Operation {

    private String s1;
    private String s2;
    public void set(String s1, String s2) {
        this.s1= s1;
        this.s2= s2;

    }

    public int compare(){
        int flg=0;
        if (s1.length()== s2.length()){
            for (int i=0; i<s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    flg = 0;
                    break;
                }
                else
                    flg=1;

            }
        }
        else
            return flg;

        return flg;
    }


    public String reverse(String s1) {
        this.s1 = s1;
        char[] tempArray= s1.toCharArray();
        int leftIndex=0, rightIndex=tempArray.length-1;
        for (leftIndex=0; leftIndex< rightIndex; leftIndex++, rightIndex--) {
            char temp= tempArray[leftIndex];
            tempArray[leftIndex]= tempArray[rightIndex];
            tempArray[rightIndex]= temp;

        }
        this.s2=  String.valueOf(tempArray);
        return s2;
    }

    public String reverseCase(String str){
        System.out.println(str);
        this.s1= str;
        char[] tempArray= s1.toCharArray();
        for(int i=0; i<tempArray.length; i++){
            if(tempArray[i]>= 'a' && tempArray[i]<='z'){
                tempArray[i]-= 'a'- 'A';
            }
            else if (tempArray[i]>='A' && tempArray[i]<='Z')
                tempArray[i]+= 'a'-'A';
        }
        this.s2= String.valueOf(tempArray);

        return s2;
    }

    public void longestWord(String str){
        //point to be noted
        str= str +" ";
            String word="";
            String longest= "";

            for (int i=0; i<str.length(); i++ ){
                if(str.charAt(i)==' ' ){
                    if(longest.length()<= word.length()) {
                        longest = word;
                        word = "";
                    }
                    word="";
                }else{
                    word= word + str.charAt(i);
                }
            }
        System.out.println("Longest word is: " + longest);
    }


}
