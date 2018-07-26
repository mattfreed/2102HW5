import java.util.GregorianCalendar;
import java.util.LinkedList;

class ReportSetList implements IReportSet{
	private LinkedList<DailyWeatherReport> reports;
	
	public ReportSetList() {
		this.reports = new LinkedList<DailyWeatherReport>();
	}
	//used for testing purposes. used to compare the add dailyreport test method
	public void add(DailyWeatherReport add) {
		reports.add(add);
	}
	//used for testing purposes. used to compare the add dailyreport test method
	public LinkedList<DailyWeatherReport> getList() {
		return reports;
	}
	//determines average high temp for given month with parameters month and year
	public double avgHighForMonth(int month, int year) {
		double sum = 0;
		int count = 0;
		for(DailyWeatherReport check : reports) {
			if (check.getDate().get(GregorianCalendar.MONTH) == month && check.getDate().get(GregorianCalendar.YEAR) == year) {
				sum = sum + check.getHighTemp();
				count = count + 1;
			}
			
		}
		return (sum/count);
		
	}
	//determines average low temp for given month with parameters month and year
	public double avgLowForMonth(int month, int year) {
		double sum = 0;
		int count = 0;
		for(DailyWeatherReport check : reports) {
			if (check.getDate().get(GregorianCalendar.MONTH) == month && check.getDate().get(GregorianCalendar.YEAR) == year) {
				if (count < 1) {
					count = count + 1;
					sum = check.getLowTemp();
				}	
				else {
				sum = (sum + check.getLowTemp())/2;

				}
			}
		}
		return (sum);
	}
	//adds a new daily report to the existing Report list
	public void addDailyReport(GregorianCalendar date, LinkedList<Readings> temp) {
		int high = temp.get(0).getTemp();
		int low = temp.get(0).getTemp();
		for(Readings readings: temp) {
			if (high <= readings.getTemp()) {
				high = readings.getTemp();
			}
			if (low >= readings.getTemp()) {
				low = readings.getTemp();
			}
		}
		 reports.add(new DailyWeatherReport(date, low, high));
	}
}
