package strategy;

public class MyCollection {
    private int[] data;
    ISort sortee;

    public MyCollection() {
        this.data = null;
        this.sortee = null;
    }

    public MyCollection(int[] data) {
        this.data = data;
        this.sortee = null;
    }

    public MyCollection(int[] data, ISort sortee) {
        this.data = data;
        this.sortee = sortee;
    }

    public int[] sort() {
        return this.sortee.sort(this.data);
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public ISort getAlgorithm() {
        return sortee;
    }

    public void setAlgorithm(ISort sortee) {
        this.sortee = sortee;
    }
}
