// Iteration 2 of 2 
class ReverseString {

    String reverse(String inputString) {
      String str = "";
    char[] ch = inputString.toCharArray();
      for(int p = (inputString.length() - 1); p >= 0; --p){
        str += ch[p];
      }
      return str;
    }

}
