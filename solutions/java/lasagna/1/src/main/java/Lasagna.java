public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40 ;
    }

    public int remainingMinutesInOven( int minutesInOven ) {
        return  40 -  minutesInOven ;
    }

    public int preparationTimeInMinutes( int couches ) {
        return  couches * 2 ;
    }

    public int totalTimeInMinutes( int nbrsCouches, int nbrsMinutes) {
        return (nbrsCouches * 2) +  nbrsMinutes;
    }
}

