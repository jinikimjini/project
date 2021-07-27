package com.project.simple.order.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;


import com.project.simple.member.vo.MemberVO;
import com.project.simple.order.vo.OrderVO;

@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public List<OrderVO> listMyOrderGoods(OrderVO orderVO) throws DataAccessException{
		List<OrderVO> orderGoodsList=new ArrayList<OrderVO>();
		orderGoodsList=(ArrayList)sqlSession.selectList("mapper.order.selectMyOrderList",orderVO);
		return orderGoodsList;
	}
	
	public void insertNewOrder(List<OrderVO> myOrderList) throws DataAccessException{
		int order_id=selectOrderID();
		for(int i=0; i<myOrderList.size();i++){
			OrderVO orderVO =(OrderVO)myOrderList.get(i);
			//orderVO.setOrder_id(order_id);
			sqlSession.insert("mapper.order.insertNewOrder",orderVO);
		}
		
	}	
	
	public OrderVO selectcartlist(String memCartId) throws DataAccessException{
		OrderVO vo = sqlSession.selectOne("mapper.order.selectcartlist", memCartId);
		return vo;
	}

	
	public OrderVO findMyOrder(String order_id) throws DataAccessException{
		OrderVO orderVO=(OrderVO)sqlSession.selectOne("mapper.order.selectMyOrder",order_id);		
		return orderVO;
	}
	
	public void removeGoodsFromCart(OrderVO orderVO)throws DataAccessException{
		sqlSession.delete("mapper.order.deleteGoodsFromCart",orderVO);
	}
	
	public void removeGoodsFromCart(List<OrderVO> myOrderList)throws DataAccessException{
		for(int i=0; i<myOrderList.size();i++){
			OrderVO orderVO =(OrderVO)myOrderList.get(i);
			sqlSession.delete("mapper.order.deleteGoodsFromCart",orderVO);		
		}
	}	
	private int selectOrderID() throws DataAccessException{
		return sqlSession.selectOne("mapper.order.selectOrderID");
		
	}
	
	//회원 주문하기
	@Override
	public void insertNewOrder1(List<OrderVO> orderlist) throws DataAccessException {


		sqlSession.insert("mapper.order.insertNewOrder", orderlist);
		
	}

}

