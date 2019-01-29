package com.ggy.springcloudeureka;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HumpName {
    public static void main(String[] args) {
     String  str = " field_id, form_id, form_field_id, field_type, param_positional, field_code, parent_field_id, compant_type, ext_value, label, default_value, tip_info, placeholder, sort_no, list_no, max_length, validate_reg, unit, data_format, sort_type, query_type, cache_type, client_type, tenant_id, created_by, created_time, updated_by, updated_time   ";
        SqlParamDisplay(str);
    }

    public static String SqlParamDisplay(String str){
        String[] split = str.split(",");
        StringBuffer sb = new StringBuffer();

        for (String strr: split) {
            sb.append("#{item.");
            sb.append(UnderlineToHump(strr));
            sb.append("},");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    /**
     * 转成驼峰格式的字符串
     *
     * */
    public static String UnderlineToHump(String para){
        StringBuilder result=new StringBuilder();
        String a[]=para.split("_");
        for(String s:a){
            if(result.length()==0){
                result.append(s.toLowerCase());
            }else{
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        String strdd = result.toString();
        return strdd.replace(" ","");
    }

    public static void TimeStanp() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = df.parse("2017-08-07");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();
        System.out.println(timestamp/1000);
    }


}
