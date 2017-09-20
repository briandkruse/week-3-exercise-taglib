package edu.matc.weekthreecustomtag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DisplayWelcomeMessage extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        Calendar calender = Calendar.getInstance();
        SimpleDateFormat timeOfDay = new SimpleDateFormat("HH");
        SimpleDateFormat currentDate = new SimpleDateFormat("MM dd");
        int time = Integer.parseInt( timeOfDay.format(calender.getTime()));
        String date = currentDate.format(calender.getTime());

        if (time > 1 && time <= 5) {
            out.println("Shouldn't you be in bed? Welcome!");
        } else if (time > 5 && time <= 10) {
            out.println("Good Morning and welcome!");
        } else if (time > 10 && time <= 13) {
            out.println("Welcome to my site. Glad you can spend your lunch here!");
        } else if(time > 13 && time <= 16) {
            out.println("Welcome and good afternoon!");
        } else if(time > 16 && time <= 19) {
            out.println("Welcome home, and welcome to my site!");
        } else if(time > 19 && time <= 22) {
            out.println("Slow down for the night and enjoy a few articles!");
        } else if((time > 22 && time <= 24) || time == 1 || time == 2) {
            out.println("Late night is the right time. Welcome!");
        }

        if (date == "09 20") {
            out.println("Class today!");
        }
        if (date == "10 05") {
            out.println("Today Foo Fighers are at the Kohl Center!");
        }

    }
}