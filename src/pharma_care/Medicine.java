package pharma_care;

public class Medicine {

    private String medName;
    private String manuFacturer;
    private String genericName;
    private String dosageForm;
    private String strength;
    private double price;
    private int stock;
    private String indication;
    private int totalSold = 0;
    private int quantity = 0;

    public Medicine(String medName, String manuFacturer, String genericName, String dosageForm, String strength, double price, int stock, String indication) {
        this.medName = medName;;
        this.manuFacturer = manuFacturer;
        this.genericName = genericName;
        this.dosageForm = dosageForm;
        this.strength = strength;
        this.price = price;
        this.stock = stock;
        this.indication = indication;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseStock(int amount) {
        stock -= amount;
        totalSold += amount;
    }

    public void increaseStock(int amount) {
        stock += amount;
        totalSold -= amount;
    }

    public void display() {

        System.out.println("\nMedicine name: " + medName);
        System.out.println("Generic name: " + genericName);
        System.out.println("Manufacturing company: " + manuFacturer);
        System.out.println("Dosage form: " + dosageForm);
        System.out.println("Strength : " + strength);
        System.out.println("price per pack: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Indication: " + indication);
        System.out.println("Total Sold: " + totalSold);

    }

}
