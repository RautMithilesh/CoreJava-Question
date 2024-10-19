import javafx.scene.effect.Light.Spot;

// Conversion of Primitive to Wrapper object .

class source 
{
    public static void main(String[] args) 
    {
     int i = 10 ;
     Integer k = new Integer(i) ;   //  constructor 
     Integer j = Integer.valueOf(i) ;
     int l = i ;     // Auto Boxing  
     
     System.out.println(j);
    }
}


