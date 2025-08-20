public class VolumeofEarth{
    public static void main(String[]args){
        double radiuskm = 6387 ; 
        double radiusmiles = radiuskm*0.621371;
        
        double vol_km = (4.0/3.0)*Math.PI*Math.pow(radiuskm,3);
        System.out.println("the volume of earth in km is " + vol_km);

        double vol_miles = (4.0/3.0)*Math.PI*Math.pow(radiusmiles,3);
        System.out.println("the volume of earth in miles is " + vol_miles);
        

    }
}
