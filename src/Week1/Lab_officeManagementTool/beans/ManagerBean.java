package Week1.Lab_officeManagementTool.beans;

public class ManagerBean {
    private String id, name, department;
    private int noOfTeammates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNoOfTeammates() {
        return noOfTeammates;
    }

    public void setNoOfTeammates(int noOfTeammates) {
        this.noOfTeammates = noOfTeammates;
    }

    @Override
    public String toString() {
        return "ManagerBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", noOfTeammates=" + noOfTeammates +
                '}';
    }
}
