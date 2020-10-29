package KR.Domain;

import java.util.ArrayList;
import java.util.LinkedList;

public class Path {
    private int trainNumber;
    private String pathName;
    private Station start;
    private Station finish;
    private ArrayList<Station> intermediate = new ArrayList<>();
    private LinkedList<Station> stations = new LinkedList<>();

    public Path(int trainNumber, String pathName, LinkedList<Station> stations) {
        this.trainNumber = trainNumber;
        this.pathName = pathName;
        this.stations = stations;
    }

    public LinkedList<Station> getStations() {
        return stations;
    }

    public void setStations(LinkedList stations) {
        this.stations = stations;
    }

    public Path(int trainNumber, String pathName, Station start, Station finish, ArrayList<Station> intermediate) {
        this.trainNumber = trainNumber;
        this.pathName = pathName;
        this.start = start;
        this.finish = finish;
        this.intermediate = intermediate;
    }

//    @Override
//    public String toString() {
//        return "Path{" +
//                "trainNumber=" + trainNumber +
//                ", pathName='" + pathName + '\'' +
//                ", start=" + start +
//                ", finish=" + finish +
//                ", intermediate=" + intermediate +
//                '}';
//    }


    @Override
    public String toString() {
        return "Path{" +
                "trainNumber=" + trainNumber +
                ", pathName='" + pathName + '\'' +
                ", stations=" + stations +
                '}';
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public Station getStart() {
        return start;
    }

    public void setStart(Station start) {
        this.start = start;
    }

    public Station getFinish() {
        return finish;
    }

    public void setFinish(Station finish) {
        this.finish = finish;
    }

    public ArrayList<Station> getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(ArrayList<Station> intermediate) {
        this.intermediate = intermediate;
    }
}
