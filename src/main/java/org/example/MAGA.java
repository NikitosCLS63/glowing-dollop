package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class MAGA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Nastroyki> nastroykiList = new ArrayList<>();

        String[] marka = {"CASIO", "ROLEX", "swatch", "GARMIN"};
        String[][] products = {{"Часы", "CASIO"}, {"Часы", "ROLEX"}, {"Часы", "swatch"}, {"Часы", "GARMIN"}};

        for (int i = 0; i < 4; i++) {
            System.out.println("Введите данные клиента........");
            System.out.print("ФИО; ");
            String FIO = scanner.nextLine();
            System.out.print("Номер телефона; ");
            String phonenumber = scanner.nextLine();
            System.out.print("Email; ");
            String email = scanner.nextLine();


            System.out.println("Доступные часы в магазине;");
            for (int j = 0; j < marka.length; j++) {
                System.out.println(j + ". " + products[j][0] + " - " + marka[j]);
            }

            System.out.print("Введите позицию часов в списке; ");
            int productPosition = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите количество; ");
            int quantity = Integer.parseInt(scanner.nextLine());

            nastroykiList.add(new Nastroyki(FIO, email, phonenumber, products[productPosition], quantity));
        }
        for (Nastroyki nastroyki : nastroykiList) {
            System.out.println("Клиент; " + nastroyki.getFIO());
            System.out.println("Номер телефона; " + nastroyki.getPhonenumber());
            System.out.println("Email; " + nastroyki.getEmail());
            System.out.println("Продукт; " + nastroyki.getProduct()[0] + " - " + nastroyki.getProduct()[1]);
            System.out.println("Количество; " + nastroyki.getQuantity());
            System.out.println();
        }
    }
    static class Nastroyki {
        private String FIO ;
        private String phonenumber;
        private String email;
        private String[] product;
        private int quantity;

        public Nastroyki(String FIO, String phonenumber, String email,  String[] product, int quantity) {
            this.FIO = FIO;
            this.phonenumber = phonenumber;
            this.email = email;
            this.product = product;
            this.quantity = quantity;
        }
        public String getFIO() {
            return FIO;
        }
        public String getPhonenumber() {
            return phonenumber;
        }
        public String getEmail() {
            return email;
        }

        public String[] getProduct() {
            return product;
        }
        public int getQuantity() {
            return quantity;
        }
    }
}



