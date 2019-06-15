package com.zmm.sell.service;

import com.zmm.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Name OrderService
 * @Author 900045
 * @Created by 2019/6/14 0014
 */
public interface OrderService {

	/**
	 * 创建订单.
	 *
	 * @param orderDTO
	 * @return
	 */
	OrderDTO create(OrderDTO orderDTO);

	/**
	 * 查询单个订单.
	 *
	 * @param orderId
	 * @return
	 */
	OrderDTO findOne(String orderId);

	/**
	 * 查询订单列表.
	 *
	 * @param buyerOpenid
	 * @param pageable
	 * @return
	 */
	Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

	/**
	 * 取消订单.
	 *
	 * @param orderDTO
	 * @return
	 */
	OrderDTO cancel(OrderDTO orderDTO);

	/**
	 * 完结订单.
	 *
	 * @param orderDTO
	 * @return
	 */
	OrderDTO finish(OrderDTO orderDTO);

	/**
	 * 支付订单.
	 *
	 * @param orderDTO
	 * @return
	 */
	OrderDTO paid(OrderDTO orderDTO);

	/**
	 * 查询订单列表.
	 *
	 * @param pageable
	 * @return
	 */
	Page<OrderDTO> findList(Pageable pageable);
}
