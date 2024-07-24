class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(helperFunction(date1) - helperFunction(date2));
    }
    public int helperFunction(String date) {
        String dt[] = date.split("-");
        int year = Integer.parseInt(dt[0]);
        int month = Integer.parseInt(dt[1]);
        int day = Integer.parseInt(dt[2]);

        int yearFrom1971 = year - 1971;

        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        if(month > 2 && isLeapYear)
            day++;
        
        int daysPerMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 1; i < month; i++)
            day += daysPerMonth[i-1];
        
        return day + yearFrom1971 * 365 + countLeapYears(year);
    }
    public int countLeapYears(int year) {
        int count = 0;
        for(int i = 1971; i < year; i++) {
            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
                count++;
        }
        return count;
    }
}