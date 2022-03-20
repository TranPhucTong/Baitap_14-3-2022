package com.example.shapelist;

public class Contact {
    private String name;
    private String gia;
    private  int hinh;

    public Contact(String name, String gia,int hinh){
        super();
        this.gia= gia;
        this.name = name;
        this.hinh = hinh;

    }

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name= name;
    }
    public String getGia(){
        return gia;
    }
    public  void setGia(String gia){
        this.gia= gia;
    }
    public int getHinh(){
        return hinh;
    }
    public  void setHinh(int hinh){
        this.hinh= hinh;
    }
}

