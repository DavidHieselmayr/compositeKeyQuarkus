package at.htl.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProjektIdEmbeddable implements Serializable {
    private int departmentId;
    private int projectNo;

    public ProjektIdEmbeddable(int departmentId, int projectNo) {
        this.departmentId = departmentId;
        this.projectNo = projectNo;
    }

    public ProjektIdEmbeddable(){

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjektIdEmbeddable that = (ProjektIdEmbeddable) o;
        return departmentId == that.departmentId && projectNo == that.projectNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, projectNo);
    }
}
