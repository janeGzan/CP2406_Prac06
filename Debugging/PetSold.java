public class PetSold extends ItemSold {
    private String isVaccinated;
    private String isNeutered;
    private String isHouseBroken;

    PetSold(int invoiceInput, String descriptionInput, double priceInput, String vaccinatedInput, String neuteredInput,
            String houseBrokenInput){
        super(invoiceInput, descriptionInput, priceInput);
        isVaccinated = vaccinatedInput;
        isNeutered = neuteredInput;
        isHouseBroken = houseBrokenInput;

    }
    @Override
    public String displayInfo(){
        return "Invoice Number: " + this.invoiceNumber + "\n Description:" + this.description + "\n Price: $" + this.price +
                "\n Vaccinated? " + isVaccinated + "\n Neutered? " + isNeutered + "\n House Broken? " + isHouseBroken ;

    }
}
