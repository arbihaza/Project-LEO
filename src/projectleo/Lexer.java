
/**
 * This is the lexer.
 * 
 * @author Alan Williams 
 * @version 2-3-11
 */
import java.util.*;
public class Lexer
{
    public Lexer()
    {
        
    }
    public static void codecheck()
    {
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        if(code.equals("L")){
            System.out.println("Please enter your module.");
            code = scan.nextLine();
            if(code.equals("ai")){
                System.out.println("Please enter your AI command.");
                code = scan.nextLine();
                if(code.equals("search")){
                    System.out.println("Please enter your search engine.");
                    code = scan.nextLine();
                    if(code.equals("google")){
                           Google_url gurl = new Google_url();
                           System.out.println("What do you want to search?");
                           code = scan.nextLine();
                           String link = gurl.googleurl(code);
                           try {
                               java.awt.Desktop.getDesktop().browse(java.net.URI.create(link));       
                            } catch(java.io.IOException e) {
                            }   
                        }
                     else if(code.equals("yahoo")){
                         Yahoo_url yurl = new Yahoo_url();
                         System.out.println("What do you want to search?");
                         code = scan.nextLine();
                         String link = yurl.yahoourl(code);
                         try {
                             java.awt.Desktop.getDesktop().browse(java.net.URI.create(link));       
                            } catch(java.io.IOException e) {
                            }
                        }
                    else if(code.equals("bing")){
                        Bing_url burl = new Bing_url();
                        System.out.println("What do you want to search?");
                        code = scan.nextLine();
                        String link = burl.bingurl(code);
                        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(link));       
        } catch(java.io.IOException e) {
            }
            }
             else {
                System.err.println("Please enter a proper sub-module name.");
            }
        }
            else{
            System.err.println("Please enter a proper module name");
            }
            
            
        } 
        else{
            System.err.println("Lexical Error. Start symbol nonexistant. you need to type in L");
        }
    }
}

}
