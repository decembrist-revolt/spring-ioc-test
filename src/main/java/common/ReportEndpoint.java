package common;

/**
 * Абстракция для внешней точки примема отчетов
 */
public interface ReportEndpoint {

	void reportMessage(String message);

	void reportMessage(String header, String message);

}
