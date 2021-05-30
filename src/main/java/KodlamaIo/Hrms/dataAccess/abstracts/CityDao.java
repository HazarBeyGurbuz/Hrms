package KodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
