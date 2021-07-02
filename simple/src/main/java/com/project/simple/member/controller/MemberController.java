package com.project.simple.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.simple.member.vo.MemberVO;

public interface MemberController{
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response)throws Exception;
	public ModelAndView addMember(@ModelAttribute("info")
	MemberVO memberVO, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView removeMember(@ModelAttribute("removemember")
	MemberVO removemember, HttpServletRequest request, HttpServletResponse response,RedirectAttributes rAttr) throws Exception;
	
}