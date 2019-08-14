package io.laxman.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.laxman.ratingsdataservice.models.rating;

@RestController
@RequestMapping("/ratingsData")
public class MovieRatingDataServiceResource {
	@GetMapping("/{movieId}")
	public rating getRating(@PathVariable("movieId")String movieId) {
		return new rating(movieId, 2);
	
		
	}

}
