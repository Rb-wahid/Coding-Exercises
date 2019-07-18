public boolean mixStart(String str) {
  
  if(str.length() < 3) return false;
  String strCheck = str.substring(1, 3);
  
  if(strCheck.equals("ix")) return true;
  
  return false;
}
