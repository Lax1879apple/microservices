package io.laxman.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.laxman.moviecatalogservice.models.CatalogItem;



@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@GetMapping("/{userId}")
	public List<CatalogItem>getCatalog(@PathVariable("userId")String  userId){
		
		// get all the rated movie ids
		// For each movie ID, call movie info service and get details
		// put them all together.
		return Collections.singletonList(
		 new CatalogItem("Titanic", "love movie", 5)
		 );
	}
}
