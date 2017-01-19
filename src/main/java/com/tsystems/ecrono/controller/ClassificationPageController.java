package com.tsystems.ecrono.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tsystems.ecrono.dto.Classified;
import com.tsystems.ecrono.usercase.GetClassificationUserCase;

@Controller
public class ClassificationPageController {

    private final GetClassificationUserCase getClassificationUserCase;

    public ClassificationPageController(GetClassificationUserCase getClassificationUserCase) {
	super();
	this.getClassificationUserCase = getClassificationUserCase;
    }

    @RequestMapping(value = "/classificationpage/{id:\\d+}", method = RequestMethod.GET)
    public String getClassificationPage(@PathVariable("id") Long raceId, Principal usuario, Model model) {

	List<Classified> classification = getClassificationUserCase.getClassified(raceId);
	model.addAttribute("nombre1", classification);
	model.addAttribute("nombre2", classification);
	model.addAttribute("mensaje", "hola");
	return "Classification";
    }

}