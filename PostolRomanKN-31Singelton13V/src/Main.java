public class Main {
    public static void main(String[] args) {
        // Отримання екземпляра HotelSystem
        HotelSystem hotel = HotelSystem.getInstance();

        // Додаємо номери в систему
        hotel.addRoom(new Room(101, "Standard"));
        hotel.addRoom(new Room(102, "Deluxe"));

        // Додаємо бронювання для доступних номерів
        System.out.println("Booking success: " +
                hotel.addBooking(new Booking("Roman Postol", 101, "28.11.24", "30.11.24"))); // Очікується успіх
        System.out.println("Booking success: " +
                hotel.addBooking(new Booking("Vlad Borisenko", 102, "28.11.24", "02.12.24"))); // Очікується успіх
        System.out.println("Booking success: " +
                hotel.addBooking(new Booking("Andrey Kostenko", 101, "28.11.24", "30.11.24"))); // Очікується невдача, номер зайнятий

        // Виводимо список усіх бронювань
        System.out.println("\nCurrent bookings:");
        for (Booking booking : hotel.getBookings()) {
            System.out.println(booking);
        }

        // Виводимо список усіх номерів
        System.out.println("\nRoom statuses:");
        for (Room room : hotel.getRooms()) {
            System.out.println(room);
        }
    }
}