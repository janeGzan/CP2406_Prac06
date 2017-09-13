public class Couplet extends Poem {
    private int numofLines = 2;

    Couplet(String nameInput) {
        super(nameInput);
        getNumofLines(this.numofLines);
    }

    public String displayInfo() {
        return "Poem name: " + this.name + "\n Number of lines:" + this.numofLines;
    }
}
