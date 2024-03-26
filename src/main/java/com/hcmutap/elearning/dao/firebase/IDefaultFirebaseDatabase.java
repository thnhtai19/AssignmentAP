package com.hcmutap.elearning.dao.firebase;

import java.util.List;
/**
 * Interface for default Firebase database operations
 * @param <T> Model class
 * @param <ID> Model ID class
 */
public interface IDefaultFirebaseDatabase<T, ID> {
	/**
	 * Save a model to database
	 * @param t Model to save
	 * @return ID of model saved
	 */
	ID save(T t);
	/**
	 * Update a model in database
	 * @param t Model to update
	 * @return Updated model
	 */
	T update(T t);
	/**
	 * Delete a model by ID field in model
	 * @param id ID of model
	 */
	void delete(ID id);
	/**
	 * Find all model in database
	 * @return List of model
	 */
	List<T> findAll();
	/**
	 * Find model by key and value
	 * @param key attribute name of model
	 * @param value Value of attribute
	 * @return List of model
	 */
	List<T> findBy(String key, String value); // need Filter class for more complex query

}
