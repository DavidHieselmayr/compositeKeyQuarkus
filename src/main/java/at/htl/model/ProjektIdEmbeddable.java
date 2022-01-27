package at.htl.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjektIdEmbeddable implements Serializable {
    private int departmentId;
    @ManyToOne
    private Department projectNo;


    public ProjektIdEmbeddable(){

    }
    public ProjektIdEmbeddable(int departmentId, Department projectNo) {
        this.departmentId = departmentId;
        this.projectNo = projectNo;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Department getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(Department projectNo) {
        this.projectNo = projectNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjektIdEmbeddable that = (ProjektIdEmbeddable) o;
        return departmentId == that.departmentId && Objects.equals(projectNo, that.projectNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, projectNo);
    }
}
