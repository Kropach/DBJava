package KR.Services;

import KR.DAO.Repository;
import KR.Domain.Timetable;

public class MainService {
    private Repository<Timetable> repository;

    public MainService(Repository<Timetable> repository) {
        this.repository = repository;
    }



}
