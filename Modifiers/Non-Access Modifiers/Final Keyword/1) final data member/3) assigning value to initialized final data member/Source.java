class Source {
    final int a = 10;
    Source() {
        a = 20;
    }
    public static void main (String args[]){
        
    }
}

/*  This program will give error as we cannot assign value
    to the final data member, because it is already initialized.

    "error message: cannot assign a value to final variable a"
           OR
    "error message: The final field Source.a cannot be assigned"
	
*/