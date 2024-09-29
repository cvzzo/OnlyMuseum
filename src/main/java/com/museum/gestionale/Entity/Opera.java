package com.museum.gestionale.Entity;

public class Opera {
    private int id;
    private String name;
    private int year;
    private String author;
    private String description;
    private String material;
    private int room;
    private float height;
    private float width;
    private String link;


    public Opera(int id, String name, int year, String author, String description, String material, int room, float height, float width, String link) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.author = author;
        this.description = description;
        this.material = material;
        this.room = room;
        this.height = height;
        this.width = width;
        this.link = link;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", material='" + material + '\'' +
                ", room=" + room +
                ", height=" + height +
                ", width=" + width +
                ", link='" + link + '\'' +
                '}';
    }
}
