//Matt Freed and Dillon Arnold
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class Examples {
	WeatherMonitor report1;
	WeatherMonitor report2;
	WeatherMonitor report3;
	LinkedList<Readings> temps1;
	GregorianCalendar date5;
	IReportSet reportTotal1;
	IReportSet reportTotal2;
	IReportSet reportTotal3;
	Time time1;
    Readings readings1;
    DailyWeatherReport d1;
    GregorianCalendar date1;
    int lowTemp1;
	int highTemp1;
	
	public Examples() {
		//test1 and 2
		lowTemp1 = 30;
		int lowTemp2 = 33;
		int lowTemp3 = 35;
		int lowTemp4 = 26;
		
		highTemp1 = 50;
		int highTemp2 = 55;
		int highTemp3 = 45;
		int highTemp4 = 50;
		
		date1 = new GregorianCalendar(2016, 11, 17);
		GregorianCalendar date2 = new GregorianCalendar(2017, 11, 18);
		GregorianCalendar date3 = new GregorianCalendar(2016, 11, 19);
		GregorianCalendar date4 = new GregorianCalendar(2016, 12, 17);
			
		d1 = new DailyWeatherReport(date1, lowTemp1, highTemp1);
		DailyWeatherReport d2 = new DailyWeatherReport(date2, lowTemp2, highTemp2);
		DailyWeatherReport d3 = new DailyWeatherReport(date3, lowTemp3, highTemp3);
		DailyWeatherReport d4 = new DailyWeatherReport(date4, lowTemp4, highTemp4);	 
		
		reportTotal1 = new ReportSetList();
		reportTotal1.add(d1);
		reportTotal1.add(d2);
		reportTotal1.add(d3);
		reportTotal1.add(d4);
		
		report1 = new WeatherMonitor(reportTotal1);
		
		//test3
		
		Time time2 = new Time(10,00);
		Time time3 = new Time(5,10);
		Time time4 = new Time(6,01);
		Time time5 = new Time(8,02);
		Time time6 = new Time(11,10);
		
		Readings readings2 = new Readings(time2, 20);
		Readings readings3 = new Readings(time3, 30);
		Readings readings4 = new Readings(time4, 40);
		Readings readings5 = new Readings(time5, 50);
		Readings readings6 = new Readings(time6, 60);
		
		temps1 = new LinkedList<>();
		temps1.add(readings2);
		temps1.add(readings3);
		temps1.add(readings4);
		temps1.add(readings5);
		temps1.add(readings6);
		
		
		reportTotal2 = new ReportSetList();
		reportTotal2.add(d1);
		reportTotal2.add(d2);
		reportTotal2.add(d3);
		reportTotal2.add(d4);
		
		
		date5 = new GregorianCalendar(2016, 11, 20);
		DailyWeatherReport d5 = new DailyWeatherReport(date5, 20, 60);
		
		reportTotal3 = new ReportSetList();
		reportTotal3.add(d1);
		reportTotal3.add(d2);
		reportTotal3.add(d3);
		reportTotal3.add(d4);
		
		reportTotal3.add(new DailyWeatherReport(date5, 20, 60));
		
		report2 = new WeatherMonitor(reportTotal2);
		report3 = new WeatherMonitor(reportTotal3);
		// Test4-7
		time1 = new Time (5,00);
	    readings1 = new Readings(time1, 10);   
	}
	@Test //test average low
    public void test1(){	
        assertEquals(32.5, report1.avgLowForMonth(11, 2016),.1);
    }
	@Test //test average high
    public void test2(){
        assertEquals(47.5, report1.avgHighForMonth(11, 2016),.1);
    }
	@Test //test add report
    public void test3(){
		report2.addDailyReport(date5, temps1);	
        assertEquals(reportTotal3.getList(),reportTotal2.getList());
    }
	@Test //test time hour
    public void test4(){
        assertEquals(5,time1.getHour(),.1);
	}
	@Test //test time minute
    public void test5(){
        assertEquals(00,time1.getMinute(),.1);
	}
	@Test //test reading temp
    public void test6(){
        assertEquals(10,readings1.getTemp(),.1);
	}
	@Test //test current time
    public void test7(){
        assertEquals(time1,readings1.getCurrentTime());
	}
	@Test //test get date
    public void test8(){
        assertEquals(date1,d1.getDate());
	}
	@Test //test get LowTemp
    public void test9(){
        assertEquals(lowTemp1,d1.getLowTemp());
	}
	@Test //test get highTemp
    public void test10(){
        assertEquals(highTemp1,d1.getHighTemp());
	}
}
	
	
