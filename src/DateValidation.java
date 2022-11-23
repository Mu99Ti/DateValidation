public class DateValidation{
    private String day;
    private String month;
    private String year;

    public boolean dayDateValidation(String day){
        this.day = day;
        int monthValue = Integer.parseInt(month);
        int dayValue = Integer.parseInt(day);
        int yearValue = Integer.parseInt(year);

        if(day.length() > 2){
            return false;
        }

        if(dayValue < 1){
            if(dayValue >=1){
                if ((monthValue == 4
                        || monthValue == 6
                        || monthValue == 9
                        || monthValue == 11)
                        && dayValue <= 30){
                    return true;
                }
                if ((monthValue == 1
                        || monthValue == 3
                        || monthValue == 5
                        || monthValue == 7
                        || monthValue == 8
                        || monthValue == 10
                        || monthValue == 12)
                        && dayValue <= 31){
                     return true;
                }
                if (monthValue == 2)
                {
                    if(dayValue <= 28){
                        return true;
                    } else if(dayValue == 29){
                        if ((yearValue%4 == 0
                                && yearValue%100!=0)
                                | yearValue%400 == 0){
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean monthDateValidation(String month){
        this.month = month;
        if(month.length() > 2){
            return false;
        }
        if(Integer.parseInt(month) > 12){
            return false;
        }
        if(Integer.parseInt(month) < 1){
            return false;
        }
        return true;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
