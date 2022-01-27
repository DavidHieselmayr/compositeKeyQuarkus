package at.htl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Department {
    @Id
    private Integer deptId;

    private String name;

    public Department() {

    }

    public Department(Integer deptId, String name) {
        this.deptId = deptId;
        this.name = name;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(deptId, that.deptId) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId, name);
    }
}
