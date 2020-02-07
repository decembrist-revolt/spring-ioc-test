package springxml;

import common.ReportEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.net.URISyntaxException;

public class Main {

	/**
	 * @see ClassPathResource
	 */
	public static void main(String[] args) throws URISyntaxException {
//		final URL resource = Main.class.getClassLoader().getResource("beans.xml");
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:beans.xml");
		final ReportEndpoint reportEndpoint = ctx.getBean(ReportEndpoint.class);
		reportEndpoint.reportMessage("6apku ne nadel");
	}

}
