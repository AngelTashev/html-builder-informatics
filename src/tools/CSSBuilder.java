package tools;

import tools.style.Style;

public class CSSBuilder {

    private StringBuilder styleBuilder;

    public CSSBuilder() {
        this.styleBuilder = new StringBuilder();
    }

    public void addStyle(String key, String value, Style[] styles) {
        this.styleBuilder.append(String.format("%s {%s", key, value));
        if (styles != null) {
            for (Style style : styles) {
                this.styleBuilder.append(style.getStyle());
            }
        }
        this.styleBuilder.append("}");
    }

    public String getStyle() {
        return this.styleBuilder.toString();
    }

}
