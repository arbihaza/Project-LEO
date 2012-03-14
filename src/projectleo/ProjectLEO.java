
/**
 * Project LEO is a compiler designed for academic use.
 * @author alan
 */
public class ProjectLEO {

    /**
     * @param args the command line arguments
     * @comment Please do not insert any actual commands here!
     */
    public static void main(String[] args) {
        Core core = new Core();
        Core.intro();
        Core.tutorial();
        Core.setup();
        Lexer lex = new Lexer();
        lex.codecheck();
    }
}

