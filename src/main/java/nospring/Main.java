package nospring;

import common.DefaultPrinter;
import common.Printer;
import common.ReportEndpoint;
import common.ToPrinterReportEndpoint;

import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		final String randomPrinterCode = UUID.randomUUID().toString();
		final Printer printer = new DefaultPrinter(randomPrinterCode);
		final ReportEndpoint endpoint = new ToPrinterReportEndpoint(printer);
		endpoint.reportMessage("6apku ne nadel");
	}

}
