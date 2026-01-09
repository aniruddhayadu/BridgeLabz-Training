package com.artify;

public class ArtifyApp {

    public static void main(String[] args) {

        User buyer = new User("Alice", 200.00);

        Artwork digital = new DigitalArt(
                "Cyber Dreams",
                "NeoArtist",
                50.00,
                "Commercial",
                "Preview_Image.jpg"
        );

        Artwork print = new PrintArt(
                "Sunset Canvas",
                "PainterX",
                80.00,
                "Personal Use"
        );

        digital.purchase(buyer);
        digital.license();

        print.purchase(buyer);
        print.license();

        System.out.println("Remaining Wallet Balance: $" + buyer.getWalletBalance());
    }
}
