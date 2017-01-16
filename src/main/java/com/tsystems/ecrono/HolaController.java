package com.tsystems.ecrono;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

@RestController
@RequestMapping("hola")
public class HolaController {

    @RequestMapping(value = "/hola/{id:\\d+}/hola")
    public List<String> getHola(PaginationFilter pageFilter, OrderFilter order, //
	    @PathVariable(value = "id") Integer raceId) {

	// System.out.println(request.getParameter("order"));
	return Lists.newArrayList("Hola!", "Qué", "tal", String.valueOf(pageFilter), String.valueOf(order), //
		"raceId= " + raceId);
    }

    @RequestMapping(value = "fran", method = RequestMethod.GET)
    public String getHolaFran() {

	// System.out.println(request.getParameter("order"));
	return "Hola Fran";
    }

}
