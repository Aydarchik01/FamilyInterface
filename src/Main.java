public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment();
        Hotel hotel = new Hotel();
        Hostel hostel = new Hostel();

        apartment.setFamily1(new Family1[]{
                new Family1("Aydar", "Japarov", "syn", 19),
                new Family1("Mars", "Ganybaev", "father", 45),
                new Family1("Gulya", "Kalbaeva", "Mother", 43)});
        apartment.str(apartment.getFamily1());
        System.out.println("==========================================");

        hotel.setFamily1(new Family1[]{
                new Family1("Kuba", "Gapurov", "syn", 16),
                new Family1("Musi", "Gapurov", "syn", 12),
                new Family1("Muslim", "Muslimov", "syn", 1)});
        hotel.str(hotel.getFamily1());
        System.out.println("==========================================");

        hostel.setFamily1(new Family1[]{
                new Family1("Syn", "Synov", "syn", 14),
                new Family1("Doch", "Dochova", "doch", 16),
                new Family1("Mather", "Matherova", "mather", 40),
                new Family1("Father", "Fatherov", "father", 45)});
        hostel.str(hostel.getFamily1());
        System.out.println("==========================================");
    }
}