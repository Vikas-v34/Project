package com.cg.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Route;
import com.cg.service.RouteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/routeCtrl")
public class RouteController {
	@Autowired
	RouteService routeService;
	
	@GetMapping("/{src}/{dst}/{date}")
	@HystrixCommand(fallbackMethod = "Invalidlocationordate")
	List<Route> searchRoute(@PathVariable("src")String source,@PathVariable("dst")String destination,@PathVariable("date")String date) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		
		Date dt = sdf.parse(date);
		
		
		return routeService.searchRouteForSourceDestionAndDateOFJouney(source, destination, dt);
	}
//	http:localhost:9092//routeCtrl/getAll
	@GetMapping("/getAll")
	List<Route> getAllRoutes(){	
		
		return routeService.getAllRoutes();
	}
	Route invalidlocationordate(@PathVariable("src")String source,@PathVariable("dst")String destination,@PathVariable("date")String date) {
		return new Route();
	}
	
}
