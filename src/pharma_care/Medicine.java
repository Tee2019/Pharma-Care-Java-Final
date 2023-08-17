package pharma_care;

public class Medicine {

    private String medName;
    private String brandName;
    private String manuFacturer;
    private String genericName;
    private String dosageForm;
    private String strength;
    private int packSize;
    private double pricePerPack;
    private double pricePerUnit;
    private int stock;
    private String indication;
    private int totalSold = 0;

    public Medicine(String medName, String brandName, String manuFacturer, String genericName, String dosageForm, String strength, int packSize, double pricePerPack, int stock, String indication) {
        this.medName = medName;
        this.brandName = brandName;
        this.manuFacturer = manuFacturer;
        this.genericName = genericName;
        this.dosageForm = dosageForm;
        this.strength = strength;
        this.packSize = packSize;
        this.pricePerPack = pricePerPack;
        pricePerUnit = pricePerPack / packSize;
        this.stock = stock;
        this.indication = indication;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public double getPricePerPack() {
        return pricePerPack;
    }

    public void setPricePerPack(double pricePerPack) {
        this.pricePerPack = pricePerPack;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
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
        System.out.println("Brand name: " + brandName);
        System.out.println("Generic name: " + genericName);
        System.out.println("Manufacturing company: " + manuFacturer);
        System.out.println("Dosage form: " + dosageForm);
        System.out.println("Strength : " + strength);
        System.out.println("pack size: " + packSize);
        System.out.println("price per pack: " + pricePerPack);
        System.out.println("price per unit: " + pricePerUnit);
        System.out.println("Stock: " + stock);
        System.out.println("Indication: " + indication);
        System.out.println("Total Sold: " + totalSold);

    }

}
