package springjava.config;

import common.DefaultPrinter;
import common.Printer;
import common.ReportEndpoint;
import common.ToPrinterReportEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public String printerCode() {
		return "java-config";
	}

	@Bean
	public Printer defaultPrinter(String printerCode) {
		return new DefaultPrinter(printerCode);
	}

	@Bean
	public ReportEndpoint endpoint(Printer printer) {
		return new ToPrinterReportEndpoint(printer);
	}

}
