package com.example.ex11063_customspinner;

public class Country {
    int flag;
    String countryname ;
    String capital ;
    int size;


    public Country(int flag, String countryname, String capital, int size)
    {
        this.countryname =countryname ;
        this.capital = capital ;
        this.size = size;
        this.flag = flag ;
    }



    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Country()
    {
        countryname= "";
        capital  = "" ;
        size = 0 ;
        flag = 0 ;
    }
    @Override
    public String toString()
    {
        return "country{" + "flag=" + flag + ", countryname='" + countryname + '\'' + ", capital='" + capital + '\'' + ", size=" + size + '}';
    }
}
