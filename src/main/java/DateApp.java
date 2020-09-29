import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateApp {

    public LocalDate showDate(){
        return LocalDate.now().plusDays(1);
    }

    public String dateInNumberFormat(){
        String pattern= "dd, MM, yyyy.";
        DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern(pattern);
        return dateFormat.format(LocalDate.now());
    }

    public String dateInWordFormat(){
        String pattern="dd MMMM yyyy.";
        DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern(pattern);
        return dateFormat.format(LocalDate.now());
    }

    public static void main(String[] args) {
        DateApp app= new DateApp();
        System.out.println("Date for tomorrow: "+app.showDate());
        System.out.println(app.dateInNumberFormat());
        System.out.println(app.dateInWordFormat());
    }

}
