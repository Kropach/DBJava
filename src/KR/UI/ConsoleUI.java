package KR.UI;

import KR.DAO.Repository;
import KR.Domain.Timetable;
import KR.Services.MainService;

import java.util.Scanner;

public class ConsoleUI {
    Repository<Timetable> repository;
    private int command = -1;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUI(Repository<Timetable> repository) {
        this.repository = repository;
    }

    public void showMenu(){
        while (true){
            System.out.println("1 - Show all pathes");
            System.out.println("2 - Show defined path by index");
            System.out.println("3 - Add new path in timetable");
            System.out.println("4 - Add new station to path by path index");
            System.out.println("5 - Change station in path");
            System.out.println("6 - Change path by index");
            System.out.println("7 - Remove station from path by index");
            System.out.println("8 - Remove path from timetable");
            System.out.println("0 - Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    repository.showAll();
                    break;
                case 2:
                    System.out.println("Input path number");
                    repository.show(scanner.nextInt());
                    break;
                case 3:
                    repository.addPath();
                    break;
                case 4:
                    System.out.println("Input number path in which station will be added");
                    repository.addStation(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Input path and station number");
                    repository.changeStation(scanner.nextInt(), scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Input path number");
                    repository.changePath(scanner.nextInt());
                    break;
                case 7:
                    System.out.println("Input path and station number");
                    repository.removeStation(scanner.nextInt(), scanner.nextInt());
                    break;
                case 8:
                    System.out.println("Input path number");
                    repository.removePath(scanner.nextInt());
                    break;
                case 0:
                    return;
            }
        }
    }
}
