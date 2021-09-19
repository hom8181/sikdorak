package kr.jhpark.sikdorak.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, String> {

    List<Restaurant> findAll();

}
