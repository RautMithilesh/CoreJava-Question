class Source {
    public static void main (String args[]){
        final int a;
        System.out.println(a);
    }
}

/* This program will give error because 
   we cannot use local variable without initializing it, whether it
   is final or not

   error message: variable "a" might not have been initialized
        OR
    error message: The local variable "a" may not have been initialized    
*/