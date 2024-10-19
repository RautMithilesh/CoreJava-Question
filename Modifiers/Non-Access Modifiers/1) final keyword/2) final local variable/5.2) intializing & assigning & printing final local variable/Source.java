class Source {
    public static void main (String args[]){
        final int a = 10;
        a = 20;
        System.out.println(a);
    }
}

/* This program will give error because 
   we cannot assign the value "10" to 
   the variable "a", because "a" is already 
   initialized

   error: cannot assign a value to final variable "a"
        OR
    error: The final local variable "a" cannot be assigned. It must be blank and not using a compound assignment
    
*/