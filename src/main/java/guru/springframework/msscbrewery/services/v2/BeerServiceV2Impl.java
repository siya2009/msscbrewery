package guru.springframework.msscbrewery.services.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

	@Override
	public BeerDtoV2 getBeerById(UUID beerId) {
		return BeerDtoV2.builder().id(UUID.randomUUID())
				.beerName("BlueMoon")
				.beerName("Citrus")
				.build();
	}

	@Override
	public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
		return BeerDtoV2
			   .builder()
			   .id(UUID.randomUUID())
			   .build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
		 log.debug("updating the beer *************");
		
	}

	
	public void deleteBeer(UUID beerId) {
	 log.debug("Deleting the beer ************");
		
	}

}
