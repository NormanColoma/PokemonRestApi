package pokemon;

/**
 * Created by Norman on 27/10/2016.
 */
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(PokemonRepository pokemonRepository, TypeRepository typeRepository) {

        return(args -> {

            List<Type> types = new ArrayList<Type>();

            types.add(new Type("Lucha"));
            types.add(new Type("Agua"));

            pokemonRepository.save(new Pokemon("Squirttle","Es un pokemon incial que te dejan elegir desde el laboratorio del profesor. Es muy poderoso.",types,"Wartortle"));


            typeRepository.save(new Type("Fantasma"));
            typeRepository.save(new Type("Psiquico"));
            typeRepository.save(new Type("Eléctrico"));
            typeRepository.save(new Type("Fuego"));
            typeRepository.save(new Type("Bicho"));
            typeRepository.save(new Type("Hoja"));
            typeRepository.save(new Type("Aire"));
            typeRepository.save(new Type("Acero"));
            typeRepository.save(new Type("Roca"));
            typeRepository.save(new Type("Tierra"));
            typeRepository.save(new Type("Normal"));
            typeRepository.save(new Type("Hielo"));


        });
    }
}