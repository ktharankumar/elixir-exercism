public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(' ') +1 ).trim();
    }

    public static String logLevel(String logLine) {
               return logLine.subSequence(logLine.indexOf('[') + 1, logLine.indexOf(']')).toString().toLowerCase();

    }

    public static String reformat(String logLine) {
        String[] list = logLine.split(" ", 2);
        return list[1].trim() + " (" + logLine.subSequence(list[0].indexOf('[') +1 , list[0].indexOf(']')).toString().trim().toLowerCase() + ")";
    }
}
