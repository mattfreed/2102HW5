import java.util.GregorianCalendar;
import java.util.LinkedList;

class WeatherMonitor{
	
	private IReportSet reportsTotal;
	
	WeatherMonitor(IReportSet reportsTotal){
		this.reportsTotal = reportsTotal;
	}
	//returns the average high using the avgHighForMonth method in the ReportSetList class with parameters month and year
	public double avgHighForMonth(int month, int year) {
		double high = reportsTotal.avgHighForMonth(month, year);
		return high;
		
	}
	//returns the average low using the avgLowMonth method in the ReportSetList class with parameters month and year
	public double avgLowForMonth(int month, int year) {
		double low = reportsTotal.avgLowForMonth(month, year);
		return low;
	}
	//adds another DailyReport with parameters date and LinkedList<Integer> temp using the addDailyReport method in the ReportSetList class
	public void addDailyReport(GregorianCalendar date, LinkedList<Readings> temp) {
		reportsTotal.addDailyReport(date, temp);
	}
	
}
