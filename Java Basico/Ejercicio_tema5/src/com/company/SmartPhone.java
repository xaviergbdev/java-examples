package com.company;

public class SmartPhone extends SmartDevice {

       String so;
       int ram;
       String versionSo;

       public SmartPhone() {}

       public SmartPhone(String modelo, String marca, String year, String color, String so, int ram, String versionSo) {
              super(modelo, marca, year, color);
              this.so = so;
              this.ram = ram;
              this.versionSo = versionSo;
       }

       @Override
       public String toString() {
              return "SmartPhone{" +
                      "modelo='" + modelo + '\'' +
                      ", marca='" + marca + '\'' +
                      ", year='" + year + '\'' +
                      ", color='" + color + '\'' +
                      ", so='" + so + '\'' +
                      ", ram=" + ram +
                      ", versionSo='" + versionSo + '\'' +
                      '}';
       }
}
