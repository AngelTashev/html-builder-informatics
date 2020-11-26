package tools;

public class Gradient {

    private StringBuilder gradient;

    public Gradient() {
        this.gradient = new StringBuilder();
    }

    public void setGradient(String direction, String starting, String ending) {
        this.gradient.append(String.format("background: -webkit-linear-gradient(%sdeg, %s, %s); " +
            "-webkit-background-clip: text; " +
            "-webkit-text-fill-color: transparent; ", direction, starting, ending));
    }

    public String getGradient() {
        return this.gradient.toString();
    }

}
