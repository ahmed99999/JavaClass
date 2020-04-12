package com.company;

public class TextBox {
    public String text="";

    public void setText( String text ){
        this.text = text;
    }

    public String getText(){
        return  this.text;
    }

    public void clear() {
        this.text = "";
    }
}
