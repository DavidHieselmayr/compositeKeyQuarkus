package at.htl.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Project {

    @EmbeddedId
    private ProjektIdEmbeddable id;


    String bezeichnung;

    public Project() {

    }

    public Project(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Project(ProjektIdEmbeddable id, String bezeichnung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }

    public ProjektIdEmbeddable getId() {
        return id;
    }

    public void setId(ProjektIdEmbeddable id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
