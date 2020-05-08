package com.hiep.doan.services.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.data.common.CommonUtil;
import com.data.common.Constants;
import com.data.common.Response;
import com.data.controller.BaseController;
import com.data.exception.SysException;
import com.hiep.doan.services.Entities.About;
import com.hiep.doan.services.EntitiesRequest.AboutReq;
import com.hiep.doan.services.Services.AboutServices;
import com.hiep.doan.services.jwtServices.jwtService;

@RestController
@RequestMapping("/dulich/about")
public class AboutController extends BaseController{


	@Autowired
	private AboutServices aboutServices;
	
	@Autowired
	private jwtService jwtService;
	
	@GetMapping(path = "/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody Response findById(HttpServletRequest req, @PathVariable int id) {
		About about = aboutServices.findById(id);
        if (about == null) {
            return Response.warning(Constants.RESPONSE_CODE.RECORD_DELETED);
        }
        return Response.success().withData(about);
    }

    @GET
    @CrossOrigin(origins = "http://localhost:3000")
    public @ResponseBody List<About> getlist(HttpServletRequest req) {
    	List<About> abouts = aboutServices.getlist();
    	if(abouts.isEmpty() || abouts == null)
    	{
            return null ;
    	}
    	else {
    		return abouts;
    	}
    }

    @POST
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Response create(HttpServletRequest req, @RequestBody AboutReq form) 
            throws Exception, SysException {
        int AboutID = CommonUtil.NVL(form.getAboutId());
        About about;
        if(AboutID > 0) {
        	about = aboutServices.findById(AboutID);
            if(about == null) {
                return Response.warning(Constants.RESPONSE_CODE.RECORD_DELETED);
            }
//            if (!permissionChecker.hasPermission("action.update", adResouceKey, req)) {
//                return Response.invalidPermission();
//            }
        } else {
        	about = new About();
//            if (!permissionChecker.hasPermission("action.insert", adResouceKey, req)) {
//                return Response.invalidPermission();
//            }
        	about.setAboutId(form.getAboutId());
        	about.setCreatedDate(new Date());
            // lấy token
//        	about.setCreatedBy(jwtService.getUsernameFromToken(req.getAuthType()));
        	about.setTittle(form.getTittle());
            about.setDetails(form.getDetails());
            about.setDescriptions(form.getDescriptions());
            aboutServices.saveOrUpdate(about);
        }
        return Response.success(Constants.RESPONSE_CODE.SUCCESS).withData(form);
    }
    
    @Path("/{id}")
    @DELETE
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Response delete(HttpServletRequest req,@PathVariable int id) throws SysException, InstantiationException, IllegalAccessException {
        if(id > 0L) {
            About about = aboutServices.findById(id);
            if (about != null) {

            	aboutServices.delete(about);
                return Response.success(Constants.RESPONSE_CODE.DELETE_SUCCESS);
            } else {
                return Response.warning(Constants.RESPONSE_CODE.RECORD_DELETED);
            }
        } else {
            return Response.error(Constants.RESPONSE_CODE.ERROR);
        }
    }


@PostMapping(path = "/{id}")
@ResponseStatus(HttpStatus.OK)
public @ResponseBody Response update(HttpServletRequest req,@PathVariable int id) throws SysException, InstantiationException, IllegalAccessException {
    
	if(id > 0) {
        About about = aboutServices.findById(id);

        if (about != null) {

        	aboutServices.saveOrUpdate(about);
            return Response.success(Constants.RESPONSE_CODE.DELETE_SUCCESS);
        } else {
            return Response.warning(Constants.RESPONSE_CODE.RECORD_DELETED);
        }
    } else {
        return Response.error(Constants.RESPONSE_CODE.ERROR);
    }
}
}
