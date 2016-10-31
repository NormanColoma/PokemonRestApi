package pokemon;

/**
 * Created by Norman on 31/10/2016.
 */
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "pokemons", path = "pokemons")
public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Long> {

    List<Pokemon> findByName(@Param("name") String name);

}