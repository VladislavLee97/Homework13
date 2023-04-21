public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1865);
        System.out.println("Author: " + levTolstoy.getFirstName() + " " + levTolstoy.getLastName());
        System.out.println("Book: " + warAndPeace.getTitle() + ", " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1870);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());

        Author fedorDostoevsky = new Author("Fedor", "Dostoevsky");
        Book idiot = new Book("Idiot", fedorDostoevsky, 2005);
        System.out.println("Author:" + fedorDostoevsky.getFirstName() + " " + fedorDostoevsky.getLastName());
        System.out.println("Book:" + idiot.getTitle() + ", " + idiot.getPublishingYear());
        idiot.setPublishingYear(2006);
        System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());


    }
}