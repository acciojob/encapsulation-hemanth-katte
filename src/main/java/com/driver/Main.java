package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly r = new RWOnly();
      //r.name = Ram;
      //System.out.println(r.name);
      //java: name has private access in com.driver.RWOnly
      r.setName("Ram");
      String ret =  r.getName();
      System.out.println(ret);
  }
}