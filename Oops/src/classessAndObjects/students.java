package classessAndObjects;
//
 class students {
//
String name;
int rollNumber;
//	private int rollNumber; //No one can access if private use 
//
//	
//	//setting with the help of functions to make sure nothing wrong can happen
//	// and nobody can manipulate our data

// Making own constructor

public students(String n, int rn) {
	name =n;
	rollNumber=rn;
}

//*******************************


public void setRollNumber (int rn) {
	if (rn<=0) { // if rollnumber negative return \ so no one can write - n
		return;
	}
   	rollNumber= rn;
	}
//	
   public int getRollNumber () {
	return rollNumber;
}
   // Making Print function here.. 
   
   public void print () {
	   System.out.println(name +": "+ rollNumber);
   }
}
