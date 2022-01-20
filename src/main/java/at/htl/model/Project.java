package at.htl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ProjectId.class)
public class Project {

    @Id
    int departmentId;
    @Id
    int projectNo;

    String bezeichnung;

    public Project() {

    }


    public Project(int departmentId, int projectNo, String bezeichnung) {
        this.departmentId = departmentId;
        this.projectNo = projectNo;
        this.bezeichnung = bezeichnung;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
