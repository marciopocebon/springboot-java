package leao.mainar.exemploIngecaodependenciaV6.model;

import leao.mainar.exemploIngecaodependenciaV6.interfaces.AnimalInterface;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Mainar Leão
 * @since 13/06/2020 - 19:18
 */
@Component
@Qualifier("cat")
public class Cat implements AnimalInterface {

    @Override
    public void comunicar() {
        System.out.println("Miau Miau!");
    }
}
