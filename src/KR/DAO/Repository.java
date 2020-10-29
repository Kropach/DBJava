package KR.DAO;

public interface Repository<T> {
    void show(int number);
    void showAll();
    void addPath();
    void addStation(int pathNumber);
    void changePath(int pathNumber);
    void changeStation(int pathNumber, int stationNumber);
    void removeStation(int pathNumber, int stationNumber);
    void removePath(int pathNumber);
}
