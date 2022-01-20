package at.htl.model;

import java.io.Serializable;
import java.util.Objects;


public class ProjectId implements Serializable {
    private int departmentId;
    private int projectNo;

    public ProjectId() {

    }

    public ProjectId(int departmentId, int projectNo) {
        this.departmentId = departmentId;
        this.projectNo = projectNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectId projectId = (ProjectId) o;
        return departmentId == projectId.departmentId && projectNo == projectId.projectNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, projectNo);
    }
}
