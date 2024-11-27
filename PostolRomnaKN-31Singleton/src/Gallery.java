import java.util.ArrayList;
import java.util.List;

class Gallery {
    // Статичний словник для збереження екземплярів галерей
    private static final java.util.Map<String, Gallery> instances = new java.util.HashMap<>();

    private String name; // Назва галереї
    private String article; // Додаткова інформація про галерею
    private List<Picture> pictures; // Список картин у галереї

    // Приватний конструктор для обмеження створення екземплярів класу
    private Gallery(String name) {
        this.name = name;
        this.pictures = new ArrayList<>(); // Ініціалізація списку картин
    }

    // Метод для отримання єдиного екземпляра галереї за її назвою
    public static Gallery getInstance(String name) {
        // Додаємо нову галерею, якщо її ще не існує
        instances.putIfAbsent(name, new Gallery(name));
        // Повертаємо екземпляр галереї
        return instances.get(name);
    }

    // Метод для додавання картини до галереї
    public boolean addPicture(Picture picture) {
        return pictures.add(picture);
    }

    // Метод для видалення картини з галереї
    public boolean removePicture(Picture picture) {
        return pictures.remove(picture);
    }

    // Метод для отримання опису конкретної картини
    public String describePicture(Picture picture) {
        return picture.toString(); // Використовує метод toString() з класу Picture
    }

    // Метод для пошуку картини за її назвою
    public Picture getPicture(String name) {
        return pictures.stream()
                .filter(picture -> picture.getName().equals(name))
                .findFirst()
                .orElse(null); // Повертає null, якщо картина не знайдена
    }

    // Метод для отримання списку всіх картин у галереї
    public List<Picture> getPictures() {
        return new ArrayList<>(pictures); // Повертає копію списку картин
    }

    // Метод для отримання кількості картин у галереї
    public long getPictureCount() {
        return pictures.size();
    }

    // Метод для отримання назви галереї
    public String getName() {
        return name;
    }

    // Метод для встановлення додаткової інформації про галерею
    public void setArticle(String article) {
        this.article = article;
    }

    // Метод для отримання додаткової інформації про галерею
    public String getArticle() {
        return article;
    }
}