package goods;

import department.BaseDepartment;

public class BaseGoods {

  private double price;
  private boolean hasGuarantee;
  private String name;
  private BaseDepartment department;
  private String company;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isHasGuarantee() {
    return hasGuarantee;
  }

  public void setHasGuarantee(boolean hasGuarantee) {
    this.hasGuarantee = hasGuarantee;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BaseDepartment getDepartment() {
    return department;
  }

  public void setDepartment(BaseDepartment department) {
    this.department = department;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
