package tools.style;

public class Border implements Style {

    private StringBuilder border;

    public Border() {
        this.border = new StringBuilder();
    }

    public void setBorder(String style, String width, String color) {
        this.border.append(String.format("border-style: %s; border-width: %s; border-color: %s",
                                            style, width, color));
    }

    @Override
    public String getStyle() {
        return this.border.toString();
    }
}
