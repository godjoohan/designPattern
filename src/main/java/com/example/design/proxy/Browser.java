package com.example.design.proxy;

public class Browser {

    private String url;

    public Browser(String url){
        this.url = url;
    }

    public Html show(){
        System.out.println("browser loading html from : "+url);
        return new Html(url);
    }
}
