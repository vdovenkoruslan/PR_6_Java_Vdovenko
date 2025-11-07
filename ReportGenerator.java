interface Clickable {
    void onClick();
}

public class ReportGenerator {
    
    private String reportTitle = "Default Title";

    class ReportFormatter {
        public String getFormattedHeader() {
            return "==== " + reportTitle.toUpperCase() + " ====";
        }
    }

    static class DataValidator {
        public static boolean isDataValid(String data) {
            return data != null && !data.isEmpty();
        }
    }

    public void generate() {
        ReportFormatter formatter = new ReportFormatter();
        System.out.println(formatter.getFormattedHeader());

        Clickable startButton = new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Запуск генерації звіту...");
            }
        };
        
        startButton.onClick();
        
        System.out.println("Звіт згенеровано.");
    }

    public static void main(String[] args) {
        boolean isValid = ReportGenerator.DataValidator.isDataValid("some data");
        System.out.println("Data valid: " + isValid);

        ReportGenerator report = new ReportGenerator();
        report.reportTitle = "Sales Report 2025";
        report.generate();
    }
}