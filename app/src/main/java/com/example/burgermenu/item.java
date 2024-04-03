package com.example.burgermenu;

public class item {

    String nameItem;
    String descriptionItem;
     String image;

    public String getNameItem() {
        return nameItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public String getImage() {
        return image;
    }

    public item(String nameItem, String descriptionItem, String image) {
        this.nameItem = nameItem;
        this.descriptionItem = descriptionItem;
        this.image = image;
    }
}
