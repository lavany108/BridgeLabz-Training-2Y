package FunctionalInterfaces;

class PrototypeModel implements Cloneable {
    String modelName;
    int version;

    PrototypeModel(String modelName, int version) {
        this.modelName = modelName;
        this.version = version;
    }

    public void showModel() {
        System.out.println("Model: " + modelName + ", Version: " + version);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) {
        try {
            PrototypeModel original = new PrototypeModel("HealthMonitor", 1);
            PrototypeModel copy = (PrototypeModel) original.clone();

            original.showModel();
            copy.showModel();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
