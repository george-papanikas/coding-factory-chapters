package gr.aueb.cf.ch19.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5), new Product("Honey", 12.5, 15),
                new Product("Apples", 5.5, 8), new Product("Apples", 3.5, 25)));

        List<Product> newProducts = Arrays.asList(new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5), new Product("Honey", 12.5, 15),
                new Product("Apples", 5.5, 8), new Product("Apples", 3.5, 25));

        List<String> productDescriptions = products.stream()
                .filter(p -> p.getQuantity() >= 1)
                .map(Product::getDescription)
                .sorted()
                .collect(Collectors.toList());

        Set<String> cities = new HashSet<>(List.of("Athens", "Berlin", "Moscow"));

        Set<String> nonGreekCities = cities.stream()
                .filter(city -> !city.equals("Athens"))
                .sorted() //natural ordering of strings as String class implements Comparable
                .collect(Collectors.toCollection(TreeSet::new));

        List<Product> updatedProductPrices = products.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() + p.getPrice() * 0.1, p.getQuantity()))
                .collect(Collectors.toList());


        /*Collections.sort(products);
        products.forEach(System.out::println);

        Collections.reverse(products);
        products.forEach(System.out::println);*/

        Collections.sort(products, Comparator.naturalOrder());
        products.sort(Comparator.naturalOrder()); //ascending

        products.sort(Comparator.reverseOrder()); //descending

        //products.sort(Comparator.comparing(product -> product.getDescription()));
        products.sort(Comparator.comparing(Product::getDescription)); //instead of using lamda
        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity).reversed());
        //reversed() makes the whole list reverse not only quantity

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice, (a1, a2) -> Double.compare(a2, a1))
                .thenComparing(Product::getQuantity));

        List<Product> lengthFiltered = products.stream()
                .filter(product -> product.getDescription().length() <= 5)
                .collect(Collectors.toList());

        lengthFiltered.forEach(System.out::println);

        List<Product> appleList = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparingInt(Product::getQuantity))
                .collect(Collectors.toList());

        appleList.forEach(System.out::println);
    }
}
