import tools.CSSBuilder;
import tools.Gradient;
import tools.HTMLBuilder;

import java.io.IOException;

public class Main {

    private static final String FILE_PATH = "C:\\Users\\Angel\\Documents\\Forum\\html-builder\\src\\index.html";

    private static final String H1_STYLE = "text-align: center; color: red; font-family: sans-serif; font-size: 100px;";

    public static void main(String[] args) throws IOException {

        // Encapsulation

        CSSBuilder style = new CSSBuilder();

        Gradient gradient = new Gradient();
        gradient.setGradient("180","red", "yellow");

        style.addStyle("h1", H1_STYLE, gradient);
        style.addStyle("body", "background-color: #777777;", null);

        HTMLBuilder builder = new HTMLBuilder(FILE_PATH);

        builder.start();

        builder.openTag("head");
        builder.addTag("title", "Informatics");
        builder.addStyle(style);
        builder.closeTag("head");

        builder.openTag("body");
        builder.addTag("h1", "Hello, G Good!");
        builder.closeTag("body");

        builder.finish();

    }
}
