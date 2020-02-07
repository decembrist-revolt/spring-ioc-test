package springjava2;

import common.ReportEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("springjava2.config");
		final ReportEndpoint reportEndpoint = ctx.getBean(ReportEndpoint.class);
		reportEndpoint.reportMessage("6apku ne nadel");
	}

}
