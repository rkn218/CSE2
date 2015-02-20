// Rami Nasrallah
// 20/2/2015
// Space Exploration Java Program
// Program to show the timeline of space eplorations

public class SpaceExploration{
    public static void main(String[] args){
        
        int year = (int)(Math.random()*11)+2000;
        switch (year){
            case 2000:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                break;
            case 2001:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                System.out.println("2001 the First spacecraft lands on asteroid");
                break;
            case 2002:    
            case 2003:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                System.out.println("2001 the First spacecraft lands on asteroid");
                System.out.println("2003 the Largest infrared telescope released");
                break;
            case 2004:    
            case 2005:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                System.out.println("2001 the First spacecraft lands on asteroid");
                System.out.println("2003 the Largest infrared telescope released");
                System.out.println("2005 Spacecraft collides with comet");
                break;
            case 2006:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                System.out.println("2001 the First spacecraft lands on asteroid");
                System.out.println("2003 the Largest infrared telescope released");
                System.out.println("2005 Spacecraft collides with comet");
                System.out.println("2006 Spacecraft returns with collections from a comet");
                break;
            case 2007:    
            case 2008:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                System.out.println("2001 the First spacecraft lands on asteroid");
                System.out.println("2003 the Largest infrared telescope released");
                System.out.println("2005 Spacecraft collides with comet");
                System.out.println("2006 Spacecraft returns with collections from a comet");
                System.out.println("2008 Kepler launched to study deep space");
                break;
            case 2009:    
            case 2010:
                System.out.println("2000 the First spacecraft orbits an asteroid");
                System.out.println("2001 the First spacecraft lands on asteroid");
                System.out.println("2003 the Largest infrared telescope released");
                System.out.println("2005 Spacecraft collides with comet");
                System.out.println("2006 Spacecraft returns with collections from a comet");
                System.out.println("2008 Kepler launched to study deep space");
                System.out.println("2010 SpaceX sucessfully sends spacecraft to orbit and back");
                break; 
        }
    }
}
