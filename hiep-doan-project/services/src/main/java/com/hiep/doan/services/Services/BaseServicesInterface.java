package com.hiep.doan.services.Services;

import java.util.List;

public interface BaseServicesInterface<A, B, C> {
	/*
	 * E là enity B là entity request C là DAO
	 */
	public A findById(C id);

	public List<A> getlist();

	public void saveOrUpdate(A entity);

	public void delete(A entity);

	/**
	 * Thuc hien validate truoc khi luu du lieu
	 * 
	 * @param entity
	 * @param entityRequest
	 * @throws ValidateException
	 */
	
	/**
	 * Lay danh sach sys cat type theo id cua thi truong va sys cat type code
	 * 
	 * @param nationId id cua thi truong
	 * @return danh sach {@link SysCatBO}
	 */
}
