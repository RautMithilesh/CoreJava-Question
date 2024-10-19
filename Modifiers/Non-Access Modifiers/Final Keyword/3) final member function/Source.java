class parent {

    final void fun() {
        
    }
}

class child extends parent {
    void fun() {
        
    }
    public static void main (String args[]){
        
    }
}

/* This program will give error because 
   final keyword does not allows overriding

   error: fun() in child cannot override fun() in parent
        OR
   error: Cannot override the final method from parent
*/