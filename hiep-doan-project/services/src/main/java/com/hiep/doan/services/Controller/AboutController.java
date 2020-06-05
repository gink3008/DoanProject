package com.hiep.doan.services.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.hiep.doan.services.Entities.About;
import com.hiep.doan.services.EntitiesRequest.AboutReq;
import com.hiep.doan.services.Services.AboutServices;
import com.hiep.doan.services.exception.SysException;
//import com.hiep.doan.services.jwtServices.jwtService;

@RestController
@RequestMapping("/dulich/about")
public class AboutController {

	@Autowired
	private AboutServices aboutServices;

	@Autowired
//	private jwtService jwtService;
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@GetMapping(path = "/{id}")
//	public ResponseEntity<Object> findById(HttpServletRequest req, @PathVariable("id") int id) {
//		 About about = aboutServices.findById(id);
//	        if (about != null) {
//	      
//	            return ResponseEntity.ok(about);
//	        }
//
//	        return new ResponseEntity<Object>("Not Found User", HttpStatus.NO_CONTENT);
//	}

	@GetMapping
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<List<AboutReq>> getlist(HttpServletRequest req) {
		List<About> abouts = aboutServices.getlist();
		List<AboutReq> listAboutReq = new ArrayList<>();
		for (About about : aboutServices.getlist()) {
			AboutReq aboutReq = new AboutReq();
			aboutReq.setCreatedBy(about.getCreatedBy());
			aboutReq.setCreatedDate(about.getCreatedDate());
			aboutReq.setDescriptions(about.getDescriptions());
			aboutReq.setDetails(about.getDetails());
			aboutReq.setMetaDescription(about.getMetaDescription());
			aboutReq.setMetaKeywords(about.getMetaKeywords());
			aboutReq.setMetaTittle(about.getMetaTittle());
			aboutReq.setModifiedDate(about.getModifiedDate());
			aboutReq.setTittle(about.getTittle());
			listAboutReq.add(aboutReq);
		}
		return ResponseEntity.ok(listAboutReq);
	}

	@PostMapping
	public ResponseEntity<Void> create(HttpServletRequest req, @RequestBody AboutReq form, UriComponentsBuilder uriComponentsBuilder)
			throws Exception, SysException {
		boolean check = aboutServices.create(form);
		UriComponents uriComponents = uriComponentsBuilder.path("api/users/check : {check}").buildAndExpand(check);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(uriComponents.toUri());
		if (check) {
			return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);

		}
		return new ResponseEntity<Void>(httpHeaders, HttpStatus.CONFLICT);
	}

//	@DeleteMapping("/{id}")
//	@ResponseStatus(HttpStatus.OK)
//	public @ResponseBody Response delete(HttpServletRequest req, @PathVariable int id)
//			throws SysException, InstantiationException, IllegalAccessException {
//		boolean check = aboutServices.
//		UriComponents uriComponents = uriComponentsBuilder.path("api/users/check : {check}").buildAndExpand(check);
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.setLocation(uriComponents.toUri());
//		if (check) {
//			return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
//
//		}
//		return new ResponseEntity<Void>(httpHeaders, HttpStatus.BAD_REQUEST);
//	}

//	@PostMapping(path = "/{id}")
//	public @ResponseBody Response update(HttpServletRequest req, @PathVariable int id)
//			throws SysException, InstantiationException, IllegalAccessException {
//
//		if (id > 0) {
//			About about = aboutServices.findById(id);
//
//			if (about != null) {
//
//				aboutServices.saveOrUpdate(about);
//				return Response.success(Constants.RESPONSE_CODE.DELETE_SUCCESS);
//			} else {
//				return Response.warning(Constants.RESPONSE_CODE.RECORD_DELETED);
//			}
//		} else {
//			return Response.error(Constants.RESPONSE_CODE.ERROR);
//		}
//	}
}
