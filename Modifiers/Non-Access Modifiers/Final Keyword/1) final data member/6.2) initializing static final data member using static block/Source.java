class Source
 {
    static final int a;

    // static block
    static 
    {
        a = 30;
    }
    
    public static void main (String args[]){
        Source obj = new Source();
    }
}

/* This program will NOT give error because static data member "a"
    is used in static block
    
*/