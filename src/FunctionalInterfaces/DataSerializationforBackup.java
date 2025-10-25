package FunctionalInterfaces;
import java.io.*;

class BackupData implements Serializable {
    private String fileName;
    private String content;

    public BackupData(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public void showData() {
        System.out.println("File: " + fileName + ", Content: " + content);
    }
}

public class DataSerializationforBackup {
    public static void main(String[] args) {
        BackupData data = new BackupData("backup1.txt", "Patient records");

        try {
            // Serialize object (save to file)
            FileOutputStream fos = new FileOutputStream("backup.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();

            // Deserialize (read from file)
            FileInputStream fis = new FileInputStream("backup.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            BackupData restored = (BackupData) ois.readObject();
            restored.showData();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
