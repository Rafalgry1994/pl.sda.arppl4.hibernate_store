package pl.sda.arppl4.hibernate;

import pl.sda.arppl4.hibernate.dao.ProductDao;
import pl.sda.arppl4.hibernate.parser.ProductCommandLineParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDao productDao = new ProductDao();

        ProductCommandLineParser parser = new ProductCommandLineParser(scanner, productDao);
        parser.parse();
    }
}
