import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUrlCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Url adresi giriniz: ");
            Pattern pattern = Pattern.compile("^https?://(www.)?[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+$");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean gecerli = false;
            while (matcher.find()){
                System.out.println("Girilen "+matcher.group()+" adresi gecerli bir web adresidir.");
                gecerli=true;
            }
            if(!gecerli){
                System.err.println("Girilen web adresi gecerli degildir.");
            }
        }
    }
}
