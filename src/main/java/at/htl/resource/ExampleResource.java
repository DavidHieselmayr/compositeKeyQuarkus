package at.htl.resource;

import at.htl.model.Department;
import at.htl.model.Project;
import at.htl.model.ProjektIdEmbeddable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
        Department dept = em.find(Department.class, 1);
        Project p = new Project(new ProjektIdEmbeddable(1, dept), "JPA");
        em.persist(p);
    }

    @GET
    @Path("proj_of_dept/{deptid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findProjectsById(@PathParam("deptid") Integer deptid) {
        TypedQuery<Project> query = em.createQuery("select project from Project project where project.id.projectNo.deptId = :deptid", Project.class);
        query.setParameter("deptid", deptid);
        return Response.ok(query.getResultList()).build();

    }
}
