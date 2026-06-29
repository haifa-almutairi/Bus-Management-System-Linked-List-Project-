package buscs2;

public class Bus {

    private String code;
    private String destination;
    private String otherInfo;

    public Bus() {
        code = "";
        destination = "";
        otherInfo = "";
    }

    public Bus(String code, String destination, String otherInfo) {
        this.code = code;
        this.destination = destination;
        this.otherInfo = otherInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return code + ", " + destination + ", " + otherInfo;
    }
}