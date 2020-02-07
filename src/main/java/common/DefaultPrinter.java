package common;

/**
 * Класс выполняющий сложную логику печати текста
 * использует код печати
 */
public class DefaultPrinter implements Printer {

	private final String printerCode;

	/**
	 * @param printerCode код принтера, привязывается к каждому сообщению
	 */
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
