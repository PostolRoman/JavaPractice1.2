class Booking {
    private String guestName; // Ім'я гостя
    private int roomNumber;   // Номер кімнати
    private String checkInDate;  // Дата заїзду
    private String checkOutDate; // Дата виїзду

    // Конструктор для створення бронювання
    public Booking(String guestName, int roomNumber, String checkInDate, String checkOutDate) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Геттер для імені гостя
    public String getGuestName() {
        return guestName;
    }

    // Геттер для номера кімнати
    public int getRoomNumber() {
        return roomNumber;
    }

    // Геттер для дати заїзду
    public String getCheckInDate() {
        return checkInDate;
    }

    // Геттер для дати виїзду
    public String getCheckOutDate() {
        return checkOutDate;
    }

    // Представлення бронювання у вигляді рядка
    @Override
    public String toString() {
        return "Booking{guestName='" + guestName + "', roomNumber=" + roomNumber +
                ", checkInDate='" + checkInDate + "', checkOutDate='" + checkOutDate + "'}";
    }
}
