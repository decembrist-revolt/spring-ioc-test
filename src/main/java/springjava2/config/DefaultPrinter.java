package springjava2.config;

import common.Printer;
import common.Report;
import org.springframework.stereotype.Component;

/**
 * Класс выполняющий сложную логику печати текста
 * использует код печати
 */
@Component
public class DefaultPrinter implements Printer {

	private final String printerCode;

	public DefaultPrinter(String printerCode) {
		this.printerCode = printerCode;
	}

	/**
	 * Выполняет печать сообщения
	 * @param report сообщение
	 */
	public void print(Report report) {
		System.out.println(printerCode + " : " + report.asString());
	}

}
