package at.htl.resource;

import at.htl.model.Project;
import at.htl.model.ProjektIdEmbeddable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }


    @POST
    @Transactional
    public void save() {
        Project p = new Project(new ProjektIdEmbeddable(1,1), "JPA");
        em.persist(p);
    }
}
