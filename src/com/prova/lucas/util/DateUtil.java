package com.prova.lucas.util;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateUtil {

    public static DateTimeFormatter pegarFormatacaoData(){
        FormatStyle formatStyle = FormatStyle.SHORT;
        return DateTimeFormatter.ofLocalizedDateTime(formatStyle);
    }

}
