package Services.Interfaces;

import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2016/05/08.
 */
public interface AnimalServiceInterface {
    Animal storeAnimal(Animal animal);
    boolean updateAnimalDetails(Animal animal);
    ArrayList<Animal> findByName(String name);
}
