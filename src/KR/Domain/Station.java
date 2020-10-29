package KR.Domain;

public class Station {
    private String name;
    private String arrivalTime;
    private  String departureTime;

    public Station(String name, String arrivalTime, String departureTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
