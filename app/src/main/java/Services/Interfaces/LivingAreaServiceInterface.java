package Services.Interfaces;

import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Domain.LivingArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Admin on 2016/05/08.
 */
public interface LivingAreaServiceInterface {
    LivingArea createLivingArea(LivingArea value);
    LivingArea findAvailability(int size);
    boolean houseAnimal(LivingArea area, Animal animal);
    ArrayList<LivingArea> getLivingAreas();
    LivingArea relocateAnimal(Animal animal);
}