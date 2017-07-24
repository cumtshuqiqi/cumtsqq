package org.fkit.service;

import java.util.List;

import org.fkit.domain.Order;

public interface OrderService {
	List<Order> getAll();
	Order saveOrder(int good_id);
	Order removeOrder(int good_id);
	Order findOrder(int good_id_);
	Order putOrder(int good_id_);
	Order getOrder(int good_id);
	Order comment(int good_id, String logistics, String server, String quality);
}
