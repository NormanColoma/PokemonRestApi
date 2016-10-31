package pokemon;

/**
 * Created by Norman on 31/10/2016.
 */


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Pokemon {

    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Size(min=30)
    private String description;

    @ManyToMany(cascade=CascadeType.PERSIST)
    @NotNull
    @Size(min=1, max=2)
    private List<Type> types;

    private String evolution;

    public Pokemon() {
    }

    public Pokemon(String name, String description, List<Type> types, String evolution) {
        this.name = name;
        this.description = description;
        this.types = types;
        this.evolution = evolution;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getEvolution(){
        return evolution;
    }

    public List<Type> getTypes(){
        return types;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setEvolution(String evolution){
        this.evolution = evolution;
    }

    public void setTypes(List<Type> types){
        this.types = types;
    }
}
