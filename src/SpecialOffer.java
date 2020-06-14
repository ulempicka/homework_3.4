public class SpecialOffer {
    Product product;
    String description;
    int days;
    double discount;

    SpecialOffer(String d, int day, double dis, Product p){
        description = d;
        days = day;
        discount = dis;
        product = p;
    }
}
