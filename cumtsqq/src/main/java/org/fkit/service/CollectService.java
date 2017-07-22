package org.fkit.service;

import java.util.List;

import org.fkit.domain.Collect;

public interface CollectService {
	List<Collect> getAll();
	Collect findCollect(int good_id);
	Collect saveCollect(int good_id);
	Collect removeCollect(int good_id);
	void clearCollect();
}