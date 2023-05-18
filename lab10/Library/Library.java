package lab10.Library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        long max = rents[0].getEnd().getTime() - rents[0].getBegin().getTime();

        for (int i = 0; i <= rents.length; i++) {
            long temp = rents[i].getEnd().getTime() - rents[i].getBegin().getTime();
            if (temp >= max) {
                max = temp;
            }
        }

        for (int i = 0; i <= rents.length; i++) {
            long temp = rents[i].getEnd().getTime() - rents[i].getBegin().getTime();
            if (temp == max) {
                return rents[i];
            }
        }
        return null;
    }
}
