package by.aleks.ghcwidget.data;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alex on 12/8/14.
 */
public class Day {

    private int level;
    private int commitsNumber;
    private Calendar calendar = Calendar.getInstance();

    public Day(Date date, int commitsNumber, String color){
        this.calendar.setTime(date);
        this.commitsNumber = commitsNumber;
        this.level = setLevel(color);
    }

    public String toString(){
        return "Date:"+calendar.toString()+" Commits:"+commitsNumber+" Level:"+level;
    }

    private int setLevel(String color){
        if(color.equals("#eeeeee"))
            return 0;
        if(color.equals("#d6e685"))
            return 1;
        if(color.equals("#8cc665"))
            return 2;
        if(color.equals("#44a340"))
            return 3;
        if(color.equals("#1e6823"))
            return 4;
        throw new IllegalArgumentException("Can't find the color!");
    }

    public int getLevel(){
        return level;
    }

    public int getCommitsNumber() {
        return commitsNumber;
    }

    public void setCommitsNumber(int commitsNumber) {
        this.commitsNumber = commitsNumber;
    }

    public String getMonth(){
        return new SimpleDateFormat("MMM").format(calendar.getTime());
    }

}
