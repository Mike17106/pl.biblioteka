package pl.biblioteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.biblioteka.model.Rent;

/**
 * Created by domin on 08.06.2017.
 */
@SuppressWarnings("ALL")
public interface RentRepository extends JpaRepository<Rent, Long> {
}
