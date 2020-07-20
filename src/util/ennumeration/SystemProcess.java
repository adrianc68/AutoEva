package util.ennumeration;

public enum SystemProcess {
    EXIT_VALUE(0);

    private int value;

    SystemProcess(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
