package kr.jhpark.sikdorak.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, String> {

}
