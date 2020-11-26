package tools;

public class CSSBuilder {

    private StringBuilder styleBuilder;

    public CSSBuilder() {
        this.styleBuilder = new StringBuilder();
    }

    public void addStyle(String key, String value, Gradient gradient) {
        this.styleBuilder.append(String.format("%s {%s", key, value));
        if (gradient != null) {
            this.styleBuilder.append(gradient.getGradient());
        }
        this.styleBuilder.append("}");
    }

    public String getStyle() {
        return this.styleBuilder.toString();
    }

}
