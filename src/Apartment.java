import java.util.Arrays;

public class Apartment implements LocationAble {
    private Family1[] family1;

    public Apartment(Family1[] family1) {
        this.family1 = family1;

    }

    public Apartment() {
    }

    public Family1[] getFamily1() {
        return family1;
    }

    public void setFamily1(Family1[] family1) {
        this.family1 = family1;
    }

    @Override
    public Family1[] str(Family1[] fam) {
        int count = 1;
        for (Family1 family1 : fam) {
            System.out.println(count+"- человек");
            count++;
            System.out.println(family1);
        }
        int sum = count-1;
        System.out.println("Всего "+sum+" человека в семье");
        return fam;
    }
    @Override
    public String toString() {
        return "Apartment\n" +
                "family: " + Arrays.toString(family1);
    }
}
