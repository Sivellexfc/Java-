import java.util.*; 
import java.io.*;


class App {

  public static String SwapCase(String str) {
    // code goes here  
    StringBuilder strbuild = new StringBuilder();
    String temp = str;
    String lowerCase = temp.toLowerCase();
    str = temp.toUpperCase();
    for(int i = 0; i < str.length() ; i++){
      if(temp.charAt(i) != str.charAt(i)){
        strbuild.append(str.charAt(i));
      }
      else{
        strbuild.append(lowerCase.charAt(i));
      }

    }

    str = strbuild.toString();

    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SwapCase(s.nextLine())); 
  }

}