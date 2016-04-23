package com.cgh.pro.controller.basicinfo.factory;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cgh.pro.controller.BaseController;
import com.cgh.pro.domain.Factory;
import com.cgh.pro.service.FactoryService;
@Controller
public class FactoryController extends BaseController {
	
	@Resource
	private FactoryService factoryService;
	//查询
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model){
		
		List<Factory> list = factoryService.find(null);
		model.addAttribute("factoryList", list);
		
		return "/basicinfo/factory/jFactoryList.jsp";
	}
	//去保存页面
	@RequestMapping("/basicinfo/factory/tocreate.action")
	public String toCreate(){
		
		return "/basicinfo/factory/jFactoryCreate.jsp";
	}
	
	//保存
	@RequestMapping("/basicinfo/factory/insert.action")
	public String save(Factory factory){
		
		factoryService.insert(factory);
		
		return "redirect:/basicinfo/factory/list.action";
	}
	
	@RequestMapping("/basicinfo/factory/toupdate.action")
	public String toEdit(String id,Model model){
		System.out.println(id);
		Factory factory = factoryService.get(id);
		model.addAttribute("factory", factory);
		return "/basicinfo/factory/jFactoryUpdate.jsp";
	}
	
	@RequestMapping("/basicinfo/factory/update.action")
	public String update(Factory factory){
		factoryService.update(factory);
		return "redirect:/basicinfo/factory/list.action";
	}
	
	public String deleteById(String id){
		factoryService.deleteById(id);
		return "redirect:/basicinfo/factory/list.action";
	}
	
	public String delete(@RequestParam("id") String []ids){
		factoryService.delete(ids);
		
		return "redirect:/basicinfo/factory/list.action";
	}
}
