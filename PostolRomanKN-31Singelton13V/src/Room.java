class Room {
    public int roomNumber; // Номер кімнати
    private String roomType; // Тип кімнати ("Standard", "Deluxe" тощо)
    private boolean isOccupied; // Чи зайнятий номер

    // Конструктор для створення кімнати
    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false; // За замовчуванням номер вільний
    }

    // Отримання номера кімнати
    public int getRoomNumber() {
        return roomNumber;
    }

    // Перевірка, чи номер зайнятий
    public boolean isOccupied() {
        return isOccupied;
    }

    // Встановлення статусу зайнятості номера
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    // Представлення номера у вигляді рядка
    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + roomType + "), Occupied: " + isOccupied;
    }
}