package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.ProductRequest;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductService productService;
	
	@GetMapping(value = "/product/list")
	public String index(Model model) {
		List<Product> productlist = productService.getProductList();
		model.addAttribute("productlist", productlist);
		return "product/index";
	}

	/**
	 * 商品新規登録画面を表示
	 * 
	 * @param model Model
	 * @return 商品情報一覧画面
	 */
	@GetMapping(value = "/product/add")
	public String displayAdd(Model model) {
		model.addAttribute("productRequest", new ProductRequest());
		return "product/add";
	}
	
	/**
	 * 商品の新規登録
	 * 
	 * @param productRequest リクエストデータ
	 * @param model       Model
	 * @return ユーザー情報一覧画面
	 */
	@RequestMapping(value = "/product/create", method = RequestMethod.POST)
	public String create(@Validated @ModelAttribute ProductRequest productRequest, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// 入力チェックエラーの場合
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "product/add";
		}
		// ユーザー情報の登録
		productService.create(productRequest);
		return "redirect:/product/list";
	}
	
	/**
	 * 商品詳細画面を表示
	 * 
	 * @param 
	 * @param model Model
	 * @return 商品情報一覧画面
	 */
	@GetMapping(value = "/product/{id}")
	  public String displayDetail(@PathVariable int id, Model model) {
		Product product = productService.getProduct(id);		
		model.addAttribute("product", product);
		return "product/detail";
	}

	/**
	 * 商品編集画面を表示
	 * 
	 * @param 
	 * @param model Model
	 * @return 商品編集一覧画面
	 */
	@GetMapping(value = "/product/edit/{id}")
	  public String editDetail(@PathVariable int id, Model model) {
		Product product = productService.getProduct(id);
		ProductRequest productRequest = productService.convetProductRequest(product);
		
		model.addAttribute("productRequest", productRequest);
		return "product/edit";
	}

	/**
	 * 商品の編集登録
	 * 
	 * @param productRequest リクエストデータ
	 * @param model       Model
	 * @return ユーザー情報一覧画面
	 */
	@RequestMapping(value = "/product/update", method = RequestMethod.POST)
	public String update(@Validated @ModelAttribute ProductRequest productRequest, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// 入力チェックエラーの場合
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("validationError", errorList);
			return "product/edit";
		}
		// ユーザー情報の登録
		productService.update(productRequest);
		
		return String.format("redirect:/product/%d", productRequest.getId());
	}

}
