package p2.person;

import p2.jacket.AdidasJacket;
import p2.jacket.PumaJacket;
import p2.jacket.ZaraJacket;
import p2.pants.AdidasPants;
import p2.pants.ZaraPants;
import p2.shoes.ZaraShoes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(new AdidasJacket(50),
                new ZaraPants(40),
                new ZaraShoes(60)));
        persons.add(new Person(new PumaJacket(55),
                new AdidasPants(42),
                new ZaraShoes(61)));
        persons.add(new Person(new ZaraJacket(44),
                new ZaraPants(40),
                new ZaraShoes(60)));
        int indexMax = 0;
        int maxPrice = Integer.MIN_VALUE;
        for (int i = 0; i < persons.size(); i++) {
            if (maxPrice < persons.get(i).getPrice()) {
                maxPrice = persons.get(i).getPrice();
                indexMax = i;
            }
        }
        System.out.println("Самый дорогой костюм стоит " + maxPrice);
        System.out.println();
        persons.get(indexMax).puton();
    }
}
