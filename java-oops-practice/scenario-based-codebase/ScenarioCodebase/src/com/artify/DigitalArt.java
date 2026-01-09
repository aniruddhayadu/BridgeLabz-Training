package com.artify;

public class DigitalArt extends Artwork {

    private String previewImage;

    public DigitalArt(String title, String artist, double price, String licenseType, String previewImage) {
        super(title, artist, price, licenseType);
        this.previewImage = previewImage;
    }

    @Override
    public void license() {
        System.out.println("Digital Art License Type: " + licenseType);
        System.out.println("Preview Image: " + previewImage);
    }
}
