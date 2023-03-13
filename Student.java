package Number_5;

public class Student {
    private String name;
    private Transcript transcript;

    public Student(String name, Transcript transcript) {
        this.name = name;
        this.transcript = transcript;
    }

    public String getName() {
        return this.name;
    }

    public Transcript getTranscript() {
        return this.transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
}