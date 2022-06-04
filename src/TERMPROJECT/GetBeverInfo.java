package TERMPROJECT;

public class GetBeverInfo {
    String fileName;
    String beverName;
    int cost;

    public GetBeverInfo() {

    }

    public GetBeverInfo(String fileName, String beverName, int cost) {
        System.out.println("fileName, beverName, cost: " + fileName + " " + beverName + " " + cost);
        this.fileName = fileName;
        this.beverName = beverName;
        this.cost = cost;
    }

    public void setName(String fileName) {
        this.fileName = fileName;
    }

    public String getName() {
        System.out.println("GetBeverInfo: fileName ->" + fileName);
        return fileName;
    }

    public void setBeverName(String beverName) {
        this.beverName = beverName;
    }

    public String getBeverName() {
        return beverName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
