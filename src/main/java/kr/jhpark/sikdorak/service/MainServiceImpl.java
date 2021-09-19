package kr.jhpark.sikdorak.service;

import kr.jhpark.sikdorak.domain.Restaurant;
import kr.jhpark.sikdorak.domain.RestaurantRepository;
import kr.jhpark.sikdorak.util.ServiceMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class MainServiceImpl implements MainService {

    private final RestaurantRepository restaurantRepository;


    @Override
    public void getMainPage(ServiceMessage message) {
        List<Restaurant> restaurantList = restaurantRepository.findAll();

        message.addData("restaurantList", restaurantList);

    }
}
