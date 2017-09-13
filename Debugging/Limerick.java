public class Limerick extends Poem{
    private int numofLines = 5;

        Limerick(String nameInput) {
            super(nameInput);
            getNumofLines(this.numofLines);
        }

        public String displayInfo() {
            return "Poem name: " + this.name + "\n Number of lines:" + this.numofLines;
        }
    }
