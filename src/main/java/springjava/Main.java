package springjava;

import common.ReportEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("springjava.config");
		final ReportEndpoint reportEndpoint = ctx.getBean(ReportEndpoint.class);
		reportEndpoint.reportMessage("6apku ne nadel");
	}

}
