package pokemon;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by Norman on 31/10/2016.
 */

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "types", path = "types")
public interface TypeRepository extends PagingAndSortingRepository<Type, Long> {

    List<Type> findByName(@Param("name") String name);

}
