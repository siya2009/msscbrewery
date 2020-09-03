package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("BlueMoon")
				.beerStyle("Citrus")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto
			   .builder()
			   .id(UUID.randomUUID())
			   .build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		
		
	}

	
	public void deleteBeer(UUID beerId) {
	 log.debug("Deleting the beer");
		
	}

}
