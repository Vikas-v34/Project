package com.cg.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Route;
import com.cg.service.RouteService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/routeCtrl")
public class RouteController {
	@Autowired
	RouteService routeService;
	
	@GetMapping("/{src}/{dst}/{date}")
	@HystrixCommand(fallbackMethod = "Invalidlocationordate")
	ResponseEntity searchRoute(@PathVariable("src")String source,@PathVariable("dst")String destination,@PathVariable("date")String date) throws ParseException  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");		
		Date dt = sdf.parse(date);
		
		
		return new ResponseEntity(routeService.searchRouteForSourceDestionAndDateOFJouney(source, destination, dt),HttpStatus.OK);
	}
//	http:localhost:9092//routeCtrl/getAll
	@GetMapping("/getAll")
	List<Route> getAllRoutes(){	
		
		return routeService.getAllRoutes();
	}
	ResponseEntity Invalidlocationordate(String source,String destination,String date) {
//		List<Route> list = null;
		return new ResponseEntity("Invalid Date format",HttpStatus.BAD_REQUEST);
	}
	
}
