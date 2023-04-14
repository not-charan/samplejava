import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class time {
    public static void main(String[] args) {
        System.out.println("Before formating");
        LocalDateTime B =LocalDateTime.now();
        DateTimeFormatter c =DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(B);
        System.out.println("after formatting");
        String f=B.format(c);
        System.out.println(f);
    }
}
