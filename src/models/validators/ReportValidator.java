package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;


public class ReportValidator {
    public static List<String> validate(Report r){
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")){
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")){
            errors.add(content_error);
        }

        //出退勤時刻を日報の項目として追加
        String going_error = _validateGoing(r.getGoing());
        if(!going_error.equals("")){
            errors.add(going_error);
        }

        //出退勤時刻を日報の項目として追加
        String leaving_error = _validateLeaving(r.getLeaving());
        if(!leaving_error.equals("")){
            errors.add(leaving_error);
        }

        return errors;

    }

    private static String _validateTitle(String title){
        if(title == null || title.equals("")){
            return "タイトルを入力してください。";        }

        return "";
    }

    private static String _validateContent(String content){
        if(content == null || content.equals("")){
            return "内容を入力してください。";
        }

        return "";
    }

  //出退勤時刻を日報の項目として追加
    private static String _validateGoing(String going){
        if(going == null || going.equals("")){
            return "出勤時刻を入力してください。";
        }

        return "";
    }

  //出退勤時刻を日報の項目として追加
    private static String _validateLeaving(String leaving){
        if(leaving == null || leaving.equals("")){
            return "退勤時刻を入力してください。";
        }

        return "";
    }



}