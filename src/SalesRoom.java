import Interfaces.DepartmentInterface;
import Interfaces.VisitorInterface;
import service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList;
    private String name;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;
}
