class Picture {
    private String name; // Назва картини
    private short year;  // Рік створення картини
    private String author; // Автор картини

    // Конструктор для створення об'єкта картини
    public Picture(String name, short year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    // Метод для отримання назви картини
    public String getName() {
        return name;
    }

    // Метод для отримання року створення картини
    public short getYear() {
        return year;
    }

    // Метод для отримання імені автора картини
    public String getAuthor() {
        return author;
    }

    // Метод для представлення картини у вигляді рядка
    @Override
    public String toString() {
        return "Picture{name='" + name + "', year=" + year + ", author='" + author + "'}";
    }
}