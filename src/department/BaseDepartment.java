package department;

import Interfaces.DepartmentInterface;
import Interfaces.EmployeeInterface;
import Interfaces.GoodsInterface;

import java.util.ArrayList;

public class BaseDepartment implements DepartmentInterface {

  private String name;
  private ArrayList<EmployeeInterface> employeeList;
  private ArrayList<GoodsInterface> goodsList;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public ArrayList<EmployeeInterface> getEmployeeList() {
    return employeeList;
  }

  @Override
  public ArrayList<GoodsInterface> getGoodsList() {
    return null;
  }

  public void setName(String name) {
    this.name = name;
  }


}
