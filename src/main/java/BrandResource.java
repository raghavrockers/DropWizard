import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/brands")
@Produces(MediaType.APPLICATION_JSON)
public class BrandResource {

    private final int defaultSize;
    private final BrandRepository brandRepository;

    public BrandResource(int defaultSize, BrandRepository brandRepository) {
        this.defaultSize = defaultSize;
        this.brandRepository = brandRepository;
    }

    @GET
    public List<Brand> getBrands(@QueryParam("size") Optional<Integer> size) {
        return brandRepository.findAll(size.orElse(defaultSize));
    }

    @GET
    @Path("/toyou")
    public String toyou(){
        return "Hellooo Worlddd";
    }

    @GET
    @Path("/{id}")
    public Object getById(@PathParam("id") String id) {
        try {
            System.out.println("i am inside " + id);
            return brandRepository
                    .findById(1L)
                    .orElseThrow(RuntimeException::new);
        }
        catch (Exception e){
            int size = 5;
            System.out.println(e.getMessage());
            return (brandRepository.findAll(size)).stream().findFirst();
        }
    }


}
