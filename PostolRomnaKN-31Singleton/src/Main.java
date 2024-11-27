public class Main {
    public static void main(String[] args) {
        // Отримання екземпляра галереї ArtGallery
        Gallery gallery1 = Gallery.getInstance("ArtGallery");

        // Додаємо картину до галереї
        gallery1.addPicture(new Picture("Mona Lisa", (short) 1503, "Leonardo da Vinci"));

        // Отримуємо екземпляр галереї
        Gallery gallery2 = Gallery.getInstance("ArtGallery");

        // Додаємо ще одну картину
        gallery2.addPicture(new Picture("Starry Night", (short) 1889, "Vincent van Gogh"));

        // Виводимо назву галереї
        System.out.println("Gallery name: " + gallery1.getName());

        // Виводимо кількість картин у галереї
        System.out.println("Number of pictures: " + gallery1.getPictureCount());

        // Виводимо список картин у галереї
        gallery1.getPictures().forEach(System.out::println);
    }
}