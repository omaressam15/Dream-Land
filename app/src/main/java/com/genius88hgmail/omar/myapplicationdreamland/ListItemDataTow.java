package com.genius88hgmail.omar.myapplicationdreamland;

public class ListItemDataTow {

  private int photo;
  private String name,number;

  public ListItemDataTow(int photo, String name, String number) {
    this.photo = photo;
    this.name = name;
    this.number = number;
  }

  public int getPhoto() {
    return photo;
  }

  public void setPhoto(int photo) {
    this.photo = photo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
