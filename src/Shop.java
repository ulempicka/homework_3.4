public class Shop {
    public static void main(String[] args) {
        Category category1 = new Category("Slodycze", "coś słodkiego dla każdego");
        Category category2 = new Category("Nabiał", "coś zrobionego z mleka");

        Product product1 = new Product("Czekolada", 3.5, "deserowa", category1);
        Product product2 = new Product("Żelki", 2.4, "marshmallow", category1);
        Product product3 = new Product("Ser", 5, "żółty", category2);
        Product product4 = new Product("Spodnie", 99, "długie");

        SpecialOffer specialOffer1 = new SpecialOffer("Oferta tygodnia!", 7, 0.2, product3);

        System.out.println(product1.name + " " + product1.description + " w cenie: " + product1.price + " zł, kategoria: " + product1.category.name +
                ", opis: " + product1.category.description);
        System.out.println(product2.name + " " + product2.description + " w cenie: " + product2.price + " zł, kategoria: " + product2.category.name +
                ", opis: " + product2.category.description);
        System.out.println(product3.name + " " + product3.description + " w cenie: " + product3.price + " zł, kategoria: " + product3.category.name +
                ", opis: " + product3.category.description);
        System.out.println(product4.name + " " + product4.description + " w cenie: " + product4.price + " zł");
        System.out.println(specialOffer1.description + " Czas trwania: " + specialOffer1.days + " dni, -" + (specialOffer1.discount * 100) + "% na " +
                product3.name + " " + product3.description + " w cenie: " + (product3.price-(product3.price * specialOffer1.discount)) + " zł, kategoria: " +
                product3.category.name + ", opis: " + product3.category.description);
    }
}
