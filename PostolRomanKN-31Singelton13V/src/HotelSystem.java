import java.util.ArrayList;
import java.util.List;

class HotelSystem {
    private static HotelSystem instance; // екземпляр системи

    private List<Room> rooms = new ArrayList<>(); // Список номерів у готелі
    private List<Booking> bookings = new ArrayList<>(); // Список бронювань

    // Приватний конструктор для заборони створення об'єктів поза класом
    private HotelSystem() {}

    // Метод для отримання єдиного екземпляра класу
    public static HotelSystem getInstance() {
        if (instance == null) { // Якщо екземпляр ще не створено
            instance = new HotelSystem();
        }
        return instance; // Повернення єдиного екземпляра
    }

    // Метод для додавання номера до системи
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Метод для додавання бронювання
    public boolean addBooking(Booking booking) {
        // Пошук номера за його номером та перевірка, чи він вільний
        for (Room room : rooms) { // Перебір усіх номерів
            if (room.getRoomNumber() == booking.getRoomNumber() && !room.isOccupied()) {
                room.setOccupied(true); // Встановлення статусу "зайнятий"
                bookings.add(booking); // Додавання бронювання
                return true; // Успішне бронювання
            }
        }
        return false; // Якщо номер зайнятий або не існує
    }

    // Метод для отримання списку всіх номерів
    public List<Room> getRooms() {
        return rooms;
    }

    // Метод для отримання списку всіх бронювань
    public List<Booking> getBookings() {
        return bookings;
    }
}
