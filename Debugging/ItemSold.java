public class ItemSold {
        int invoiceNumber;
        String description;
        double price;

        ItemSold(int invoiceInput, String descriptionInput, double priceInput){
            this.invoiceNumber = invoiceInput;
            this.description = descriptionInput;
            this.price = priceInput;
        }

        public String displayInfo(){
            return "Invoice Number: " + this.invoiceNumber + "\n Description:" + this.description + "\n Price: $" + this.price;
        }
    }

