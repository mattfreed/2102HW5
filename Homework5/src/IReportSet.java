import java.util.GregorianCalendar;
import java.util.LinkedList;

interface IReportSet {
	//determines average high temp for given month with parameters month and year
	public double avgHighForMonth(int month, int year);
	//determines average low temp for given month with parameters month and year
	public double avgLowForMonth(int month, int year);
	//adds a new daily report to the existing Report list
	public void addDailyReport(GregorianCalendar date, LinkedList<Readings> temp);
	//used for the examples testing, adds a daily report to a linkedlist
	public void add(DailyWeatherReport add);
	//returns the linkedlist set for testing purposes
	public LinkedList<DailyWeatherReport> getList();
	
}
