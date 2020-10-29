package KR.DAO;

import KR.Domain.Path;
import KR.Domain.Station;
import KR.Domain.Timetable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HCRep implements Repository<Timetable> {
    private static HCRep instance;
    private Timetable timetable = new Timetable();
    private Scanner scanner = new Scanner(System.in);

    private HCRep(){
        init();
    }

    private void init() {
//        timetable.getPathes().add(new Path(10, "R-E", new Station("T", "12:10", "12:13"),
//                new Station("Y", "13:00", "13:22"), new ArrayList<>()));
//        timetable.getPathes().get(0).getIntermediate().add(new Station("H", "12:34", "12:36"));
        timetable.getPathes().add(new Path(10, "R-E", new LinkedList<>()));
        timetable.getPathes().get(0).getStations().add(new Station("T", "12:10", "12:13"));
        timetable.getPathes().get(0).getStations().add(new Station("H", "12:34", "12:36"));
        timetable.getPathes().get(0).getStations().add(new Station("Y", "13:00", "13:22"));
    }


    public static HCRep getInstance(){
        if (instance == null){
            instance = new HCRep();
        }
        return instance;
    }
    @Override
    public void show(int number) {
        if (number < timetable.getPathes().size())
//            System.out.println(timetable.getPathes().get(number));
            System.out.println(timetable.getPathes().get(number).toString());
    }

    @Override
    public void showAll() {
        for (int i = 0; i < timetable.getPathes().size(); i++) {
            show(i);
        }
    }

    @Override
    public void addPath() {
        System.out.println("Input train number, path name, start and finish stations(name, arr and dep time)");
        timetable.getPathes().add(new Path(scanner.nextInt(),
                        scanner.next(), new LinkedList<Station>()));
        timetable.getPathes().get(timetable.getPathes().size()-1).getStations().add(new Station(scanner.next(),scanner.next(),scanner.next()));//start
        timetable.getPathes().get(timetable.getPathes().size()-1).getStations().add(new Station(scanner.next(),scanner.next(),scanner.next()));//finish
//        timetable.getPathes().add(new Path(scanner.nextInt(),
//                scanner.next(), new Station(scanner.next(),scanner.next(),scanner.next()),
//                new Station(scanner.next(),scanner.next(),scanner.next()),new ArrayList<>()));
        System.out.println("U have added a new path at timetable");
    }

    @Override
    public void addStation(int pathNumber) {
        if (pathNumber < timetable.getPathes().size()) {
            System.out.println("Input station name, arr and dep time");
//            timetable.getPathes().get(pathNumber).getIntermediate().add(new Station(scanner.next(), scanner.next(), scanner.next()));
            int size = timetable.getPathes().get(pathNumber).getStations().size();
            timetable.getPathes().get(pathNumber).getStations().add(size-1, new Station(scanner.next(), scanner.next(), scanner.next()));
            System.out.println("U have added a new station in path " + pathNumber);
        }
    }

    @Override
    public void changePath(int pathNumber) {
        if (pathNumber < timetable.getPathes().size()) {
            System.out.println("Input new train number");
            timetable.getPathes().get(pathNumber).setTrainNumber(scanner.nextInt());
            System.out.println("Input new path name");
            timetable.getPathes().get(pathNumber).setPathName(scanner.next());
            System.out.println("U have changed path " + pathNumber);
        }
    }

    @Override
    public void changeStation(int pathNumber, int stationNumber) {///////////
        if (pathNumber < timetable.getPathes().size() &&
                stationNumber < timetable.getPathes().get(pathNumber).getStations().size()-1 &&
                stationNumber != 0){
//                stationNumber < timetable.getPathes().get(pathNumber).getIntermediate().size()) {
            System.out.println("Input station name");
//            timetable.getPathes().get(pathNumber).getIntermediate().get(stationNumber).setName(scanner.next());
            timetable.getPathes().get(pathNumber).getStations().get(stationNumber).setName(scanner.next());
            System.out.println("Input arr time");
//            timetable.getPathes().get(pathNumber).getIntermediate().get(stationNumber).setArrivalTime(scanner.next());
            timetable.getPathes().get(pathNumber).getStations().get(stationNumber).setArrivalTime(scanner.next());
            System.out.println("Input dep time");
//            timetable.getPathes().get(pathNumber).getIntermediate().get(stationNumber).setDepartureTime(scanner.next());
            timetable.getPathes().get(pathNumber).getStations().get(stationNumber).setDepartureTime(scanner.next());
            System.out.println("U have changed station " + stationNumber + " in path " + pathNumber);
        }
    }

    @Override
    public void removeStation(int pathNumber, int stationNumber) {
        if (pathNumber < timetable.getPathes().size() &&
                stationNumber < timetable.getPathes().get(pathNumber).getStations().size()-1 &&
                stationNumber != 0) {
//                stationNumber < timetable.getPathes().get(pathNumber).getIntermediate().size()) {
//            timetable.getPathes().get(pathNumber).getIntermediate().remove(stationNumber);
            timetable.getPathes().get(pathNumber).getStations().remove(stationNumber);
            System.out.println("U have removed station " + stationNumber + " from path " + pathNumber);
        }else System.out.println("Wrong path or station number");
    }

    @Override
    public void removePath(int pathNumber) {
        if (pathNumber < timetable.getPathes().size()) {
            timetable.getPathes().remove(pathNumber);
            System.out.println("U have removed path " + pathNumber + " from timetable");
        }
        else System.out.println("Wrong path or station number");
    }
}
