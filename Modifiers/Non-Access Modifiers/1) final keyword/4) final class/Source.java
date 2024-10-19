final class parent {

}

class child extends parent {
    public static void main (String args[]){
        
    }
}

/* This program will not run because
   if we use final keyword for parent class,
   then we cannot inherit(extend) a child class from it

   error: cannot inherit from final parent
        OR
    error: The type child cannot subclass the final class parent    
 */