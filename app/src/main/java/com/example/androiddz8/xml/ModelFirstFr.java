package com.example.androiddz8.xml;

public class ModelFirstFr {
    private int imageFamily;
    private String nameFamily;

    public ModelFirstFr(int imageFamily, String nameFamily) {
        this.imageFamily = imageFamily;
        this.nameFamily = nameFamily;
    }

    public int getImageFamily() {
        return imageFamily;
    }

    public void setImageFamily(int imageFamily) {
        this.imageFamily = imageFamily;
    }

    public String getNameFamily() {
        return nameFamily;
    }

    public void setNameFamily(String nameFamily) {
        this.nameFamily = nameFamily;
    }
}
