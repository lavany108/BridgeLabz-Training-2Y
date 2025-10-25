package FunctionalInterfaces;

interface ReportExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("JSON export not implemented yet (default).");
    }
}
class CSVExporter implements ReportExporter {
    public void exportToCSV() {
        System.out.println("Exporting report to CSV...");
    }
    public void exportToPDF() {
        System.out.println("Exporting report to PDF...");
    }
}
class JSONExporter implements ReportExporter {
    public void exportToCSV() {}
    public void exportToPDF() {}
    public void exportToJSON() {
        System.out.println("Exporting report to JSON format...");
    }
}
public class DataExportFeature {
    public static void main(String[] args) {
        ReportExporter csv = new CSVExporter();
        ReportExporter json = new JSONExporter();
        csv.exportToCSV();
        csv.exportToJSON();
        json.exportToJSON();
    }
}
