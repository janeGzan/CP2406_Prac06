public class Haiku extends Poem {
        private int numofLines = 3;

        Haiku(String nameInput) {
            super(nameInput);
            getNumofLines(this.numofLines);
        }

        public String displayInfo() {
            return "Poem name: " + this.name + "\n Number of lines:" + this.numofLines;
        }
    }

