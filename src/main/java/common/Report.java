package common;

/**
 * Класс отчет
 *
 * Контейнер для частей отчета
 * позволяет склеивать части отчета в готовый отчет
 */
public class Report {

	/**
	 * Заголовок отчета
	 */
	private final String header;
	/**
	 * Содержание отчета
	 */
	private final String content;

	public Report(String header, String content) {
		this.header = header;
		this.content = content;
	}

	public String getHeader() {
		return header;
	}

	public String getContent() {
		return content;
	}

	/**
	 * @return отчет в виде строки
	 */
	public String asString() {
		return header + " : " + content;
	}

}
