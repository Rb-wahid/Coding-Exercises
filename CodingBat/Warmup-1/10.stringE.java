public boolean stringE(String str) {
  int count = 0;
  
  for(int p = 0; p < str.length(); p++){
    if(str.charAt(p) == 'e') count ++;
  }
  
  return (count >= 1 && count <= 3);
}
