package com.ping;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverDate extends PropertyEditorSupport  {
    public String partttern="yyyy-mm--dd";
    @Override
    public  void  setAsText(String text){
        System.out.println ("text"+text );
        try {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat ( partttern );
            Date date=simpleDateFormat.parse ( text );
            this.setValue ( date );
        } catch (ParseException e) {
            e.printStackTrace ( );
        }
    }

}
