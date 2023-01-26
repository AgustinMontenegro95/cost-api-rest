package ar.com.dinamicaonline.cost_api.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.com.dinamicaonline.cost_api.models.ExtractionPlaces;

public interface ExtractionPlacesRepository extends JpaRepository<ExtractionPlaces, Integer> {
    
    @Query(value = "SELECT * FROM api_ExtractionPlaces", nativeQuery = true)
    public List<ExtractionPlaces> findExtractionPlaces();

}
