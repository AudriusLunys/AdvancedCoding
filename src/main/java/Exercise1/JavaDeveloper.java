package Exercise1;

public class JavaDeveloper extends Developer {

    private Double javaVersion;

    public JavaDeveloper(String name, String surname, String department, Double javaVersion) {
        super(name, surname, department);
        this.javaVersion = javaVersion;

    }

    public void developJavaApp () {
        System.out.println("developing");
    }

    public void goesToWork () {
        System.out.println("goes to work on his hipster bicycle");
    }


    public Double getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(Double javaVersion) {
        this.javaVersion = javaVersion;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "javaVersion=" + javaVersion +
                '}';
    }
}
