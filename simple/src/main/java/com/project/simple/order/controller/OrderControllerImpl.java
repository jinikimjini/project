package com.project.simple.order.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.project.simple.cart.vo.CartVO;
//import com.bookshop01.common.base.BaseController;
//import com.bookshop01.goods.vo.GoodsVO;
import com.project.simple.member.vo.MemberVO;
import com.project.simple.order.service.OrderService;
import com.project.simple.order.vo.OrderVO;

@Controller("orderController")
public class OrderControllerImpl implements OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderVO orderVO;
	
	// ��ٱ��Ͽ��� �ֹ������� �̵�(ȸ��/��ȸ��)
	@RequestMapping(value = "/order.do", method = RequestMethod.POST)
	private ModelAndView order(@ModelAttribute("orderVO") OrderVO orderVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();

		List<CartVO> cartlist = (ArrayList) session.getAttribute("cartlist");
		Boolean isLogOn = (Boolean) session.getAttribute("isLogOn");
		
		
		if (isLogOn == null) {
			List<CartVO> list = (ArrayList) session.getAttribute("orderlist");
			if (list == null) {
				list = new ArrayList<CartVO>();
				session.setAttribute("orderlist", list);
			}
			
			String[] ajaxMsg01 = request.getParameterValues("valueArr");
			int[] ajaxMsg = null;
			if(ajaxMsg01 != null){
				ajaxMsg = new int[ajaxMsg01.length];		
				for( int i=0; i<ajaxMsg01.length; i++ ) {
				ajaxMsg[i] = Integer.parseInt( ajaxMsg01[i] );
				}		
			}
			int size = ajaxMsg01.length;
			for (int i = 0; i < size; i++) {
			int no = ajaxMsg[i];
			CartVO vo = cartlist.get(no);
			list.add(vo);
			}
			
			session.setAttribute("orderlist", list); 
			mav.setViewName("order_02");
		}

		if (isLogOn == true) {
			List<OrderVO> orderlist = new ArrayList();
			String [] ajaxMsg = request.getParameterValues("valueArr");
			int size = ajaxMsg.length;
		
			for (int i = 0; i < size; i++) {
			orderlist.add(orderService.selectcartlist(ajaxMsg[i]));	
			}
			
			session.setAttribute("orderlist", orderlist); 
			mav.setViewName("order_01");
		}
		return mav;
	}

	
	// �ֹ������� �̵�(ȸ��)
	@RequestMapping(value = "/order_01.do", method = RequestMethod.GET)
	private ModelAndView order_01(@ModelAttribute("orderVO") OrderVO orderVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		return mav;
		
		}

	
		
	// �ֹ������� �̵�(��ȸ��)
	@RequestMapping(value = "/order_02.do", method = RequestMethod.GET)
	private String order_02(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();

		return "order_02";
	}
	
	// ������ �ֹ�����Ʈ ��ȸ
	@RequestMapping(value = "/admin_listorder.do", method = RequestMethod.GET)
	private ModelAndView admin_listorder(@ModelAttribute("orderVO") OrderVO orderVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		return mav;
		
		}

	
	
	
	@RequestMapping(value = "/orderEachGoods.do", method = RequestMethod.POST)
	public ModelAndView orderEachGoods(@ModelAttribute("orderVO") OrderVO _orderVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();

		Boolean isLogOn = (Boolean) session.getAttribute("isLogOn");
		String action = (String) session.getAttribute("action");
		// �α��� ���� üũ
		// ������ �α��� ������ ���� �ֹ����� ����
		// �α׾ƿ� ������ ��� �α��� ȭ������ �̵�
		if (isLogOn == null || isLogOn == false) {
			session.setAttribute("orderInfo", _orderVO);
			session.setAttribute("action", "/order/orderEachGoods.do");
			return new ModelAndView("redirect:/member/loginForm.do");
		} else {
			if (action != null && action.equals("/order/orderEachGoods.do")) {
				orderVO = (OrderVO) session.getAttribute("orderInfo");
				session.removeAttribute("action");
			} else {
				orderVO = _orderVO;
			}
		}

		String viewName = (String) request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView(viewName);

		List myOrderList = new ArrayList<OrderVO>();
		myOrderList.add(orderVO);

		MemberVO memberInfo = (MemberVO) session.getAttribute("memberInfo");

		session.setAttribute("myOrderList", myOrderList);
		session.setAttribute("orderer", memberInfo);
		return mav;
	}
	
	


	/*
	 * @RequestMapping(value="/orderAllCartGoods.do" ,method = RequestMethod.POST)
	 * public ModelAndView orderAllCartGoods( @RequestParam("cart_goods_qty")
	 * String[] cart_goods_qty, HttpServletRequest request, HttpServletResponse
	 * response) throws Exception{ String
	 * viewName=(String)request.getAttribute("viewName"); ModelAndView mav = new
	 * ModelAndView(viewName); HttpSession session=request.getSession(); Map
	 * cartMap=(Map)session.getAttribute("cartMap"); List myOrderList=new
	 * ArrayList<OrderVO>();
	 * 
	 * List<GoodsVO> myGoodsList=(List<GoodsVO>)cartMap.get("myGoodsList"); MemberVO
	 * memberVO=(MemberVO)session.getAttribute("memberInfo");
	 * 
	 * for(int i=0; i<cart_goods_qty.length;i++){ String[]
	 * cart_goods=cart_goods_qty[i].split(":"); for(int j = 0; j<
	 * myGoodsList.size();j++) { GoodsVO goodsVO = myGoodsList.get(j); int goods_id
	 * = goodsVO.getGoods_id(); if(goods_id==Integer.parseInt(cart_goods[0])) {
	 * OrderVO _orderVO=new OrderVO(); String goods_title=goodsVO.getGoods_title();
	 * int goods_sales_price=goodsVO.getGoods_sales_price(); String
	 * goods_fileName=goodsVO.getGoods_fileName(); _orderVO.setGoods_id(goods_id);
	 * _orderVO.setGoods_title(goods_title);
	 * _orderVO.setGoods_sales_price(goods_sales_price);
	 * _orderVO.setGoods_fileName(goods_fileName);
	 * _orderVO.setOrder_goods_qty(Integer.parseInt(cart_goods[1]));
	 * myOrderList.add(_orderVO); break; } } } session.setAttribute("myOrderList",
	 * myOrderList); session.setAttribute("orderer", memberVO); return mav; }
	 * 
	 * @RequestMapping(value="/payToOrderGoods.do" ,method = RequestMethod.POST)
	 * public ModelAndView payToOrderGoods(@RequestParam Map<String, String>
	 * receiverMap, HttpServletRequest request, HttpServletResponse response) throws
	 * Exception{ String viewName=(String)request.getAttribute("viewName");
	 * ModelAndView mav = new ModelAndView(viewName);
	 * 
	 * HttpSession session=request.getSession(); MemberVO
	 * memberVO=(MemberVO)session.getAttribute("orderer"); String
	 * member_id=memberVO.getMember_id(); String
	 * orderer_name=memberVO.getMember_name(); String orderer_hp =
	 * memberVO.getHp1()+"-"+memberVO.getHp2()+"-"+memberVO.getHp3(); List<OrderVO>
	 * myOrderList=(List<OrderVO>)session.getAttribute("myOrderList");
	 * 
	 * for(int i=0; i<myOrderList.size();i++){ OrderVO
	 * orderVO=(OrderVO)myOrderList.get(i); orderVO.setMember_id(member_id);
	 * orderVO.setOrderer_name(orderer_name);
	 * orderVO.setReceiver_name(receiverMap.get("receiver_name"));
	 * 
	 * orderVO.setReceiver_hp1(receiverMap.get("receiver_hp1"));
	 * orderVO.setReceiver_hp2(receiverMap.get("receiver_hp2"));
	 * orderVO.setReceiver_hp3(receiverMap.get("receiver_hp3"));
	 * orderVO.setReceiver_tel1(receiverMap.get("receiver_tel1"));
	 * orderVO.setReceiver_tel2(receiverMap.get("receiver_tel2"));
	 * orderVO.setReceiver_tel3(receiverMap.get("receiver_tel3"));
	 * 
	 * orderVO.setDelivery_address(receiverMap.get("delivery_address"));
	 * orderVO.setDelivery_message(receiverMap.get("delivery_message"));
	 * orderVO.setDelivery_method(receiverMap.get("delivery_method"));
	 * orderVO.setGift_wrapping(receiverMap.get("gift_wrapping"));
	 * orderVO.setPay_method(receiverMap.get("pay_method"));
	 * orderVO.setCard_com_name(receiverMap.get("card_com_name"));
	 * orderVO.setCard_pay_month(receiverMap.get("card_pay_month"));
	 * orderVO.setPay_orderer_hp_num(receiverMap.get("pay_orderer_hp_num"));
	 * orderVO.setOrderer_hp(orderer_hp); myOrderList.set(i, orderVO); //�� orderVO��
	 * �ֹ��� ������ ������ �� �ٽ� myOrderList�� �����Ѵ�. }//end for
	 * 
	 * orderService.addNewOrder(myOrderList);
	 * mav.addObject("myOrderInfo",receiverMap);//OrderVO�� �ֹ���� �������� �ֹ��� ������ ǥ���Ѵ�.
	 * mav.addObject("myOrderList", myOrderList); return mav; }
	 */

}