package pokemon;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Norman on 31/10/2016.
 */

@Entity
public class Type {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Type(){

    }
    public Type(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    private String name;


    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @ManyToMany(mappedBy="types", cascade=CascadeType.ALL)
    private List<Pokemon> pokemons;

}
