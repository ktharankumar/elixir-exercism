public class JedliksToyCar {
    private int distance=0;
    private int battery=100;

    public JedliksToyCar() {}

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public void drive() {
        if (battery > 0) {
            distance+=20;
            battery--;
        }
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay(){
        if (battery == 0) {
            return "Battery empty";
        }
        else {
            return "Battery at " + battery + "%";    
        }        
    }

}
