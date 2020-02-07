package springjava2.config;

import common.Printer;
import common.Report;
import common.ReportEndpoint;
import org.springframework.stereotype.Service;

/**
 * Предоставляет механизм отправки отчетов со стандартным или заданным заголовком
 */
@Service
public class ToPrinterReportEndpoint implements ReportEndpoint {

	public static String DEFAULT_HEADER = "header:1.0";

	private final Printer printer;

	public ToPrinterReportEndpoint(Printer printer) {
		this.printer = printer;
	}

	/**
	 * Отправить отчет со стандартным заголовком
	 *
	 * @param message 	текст отчета
	 */
	public void reportMessage(String message) {
		final Report report = createReport(message);
		printer.print(report);
	}

	/**
	 * Отправить отчет с заданным заголовком
	 *
	 * @param header 	заголовок отчета
	 * @param message 	текст отчета
	 */
	public void reportMessage(String header, String message) {
		final Report report = createReport(header, message);
		printer.print(report);
	}

	private Report createReport(String message) {
		return new Report(DEFAULT_HEADER, message);
	}

	private Report createReport(String header, String message) {
		return new Report(header, message);
	}


}
