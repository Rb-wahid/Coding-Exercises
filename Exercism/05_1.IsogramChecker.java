// Iteration 2 of 2 
class IsogramChecker {

    boolean isIsogram(String phrase) {
	  String str = "";
	  for(int p = 0; p < phrase.length(); p++){       
	  	if(phrase.charAt(p) == ' ' || phrase.charAt(p) == '-'){
			    str = phrase.substring(0,p)+phrase.substring(p+1);
           phrase = str;
		}
	}
  	for(int p = 0; p < (phrase.length()/2) ; p++){
  		for(int q = 1; q < phrase.length(); q++){
  			if(phrase.charAt(p) == phrase.charAt(q)) return false;
                 }
            }
      return true;
    }

}
