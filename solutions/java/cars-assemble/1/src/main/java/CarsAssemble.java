public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double actualRate = (speed * 221);
        
        double finalRate;
        if (speed >= 1 && speed <=4) {
            finalRate = actualRate;
        }
        else if (speed >= 5 && speed <=8){
            finalRate = 0.9 * actualRate;
        }
        else if (speed == 9){
            finalRate = 0.8 * actualRate;    
        }
        else {
            finalRate = 0.77 * actualRate;
        }
        return finalRate;
    }
    
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
