package tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLBuilder {

    private File file;
    private FileWriter writer;
    private CSSBuilder style;

    public HTMLBuilder(String path) throws IOException {
        this.setFile(path);
    }

    public void addStyle(CSSBuilder style) throws IOException {
        this.style = style;
        this.openTag("style");
        this.writer.write(this.style.getStyle());
        this.closeTag("style");
    }

    public void setFile(String path) throws IOException {
        this.file = new File(path);
        this.setWriter(this.file);
    }

    private void setWriter(File file) throws IOException {
        this.writer = new FileWriter(file);
    }

    public void start() throws IOException {
        this.writer.write("<!DOCTYPE html>");
        this.writer.write("<html>");
    }

    public void openTag(String tagName) throws IOException {
        this.writer.write(String.format("<%s>", tagName));
    }

    public void closeTag(String tagName) throws IOException {
        this.writer.write(String.format("</%s>", tagName));
    }

    public void addTag(String tagName, String content) throws IOException {
        this.openTag(tagName);
        this.writer.write(content);
        this.closeTag(tagName);
    }

    public void finish() throws IOException {
        this.writer.write("</html>");
        this.writer.close();
    }

}
