class Source {
    final int a;

    Source() {
        a = 20;
    }

    // non-static block
    {
        a = 30;
    }
    public static void main (String args[]){
        
    }
}

/* This program will give error
    Reason=
    The non-static block will run immediately after 
    object creation, so the "30" value is initialized to final data member "a" 
    Now after that the constructor will run, but as "a" is already initialized,
    so we cannot assign the value "20" to the final data member "a"
    
    "error message: variable 'a' might already have been assigned"
            OR
    "error message: The final field 'a' may already have been assigned"
    
*/