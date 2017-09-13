public class Poem {
    String name;
    private int numofLines;

    Poem(String nameInput, int numofLinesInput) {
        this.name = nameInput;
        this.numofLines = numofLinesInput;
    }
    Poem(String nameInput){
        this.name = nameInput;
    }

    void getNumofLines(int numLinesInput){
        this.numofLines = numLinesInput;
    }
    public String displayInfo() {
        return "Poem name: " + this.name + "\n Number of lines:" + this.numofLines;
    }

}
