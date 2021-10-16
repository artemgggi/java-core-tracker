package ru.job4j.oop.overriding;

public class ReportUsage {
	public static void main(String[] args) {
		TextReport report = new TextReport();
		String text = report.generate("Report's name", "Report's body");
		System.out.println(text);

		HtmlReport htmlreport = new HtmlReport();
		String htmltext = htmlreport.generate("Report's name", "Report's body");
		System.out.println(htmltext);

		JSONReport jsonReport = new JSONReport();
		String jsontext = jsonReport.generate("Report's name", "Report's body");
		System.out.println(jsontext);
	}
}
