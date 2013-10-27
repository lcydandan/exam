package com.exam.dao;

import java.util.List;
import java.util.Map;

import com.exam.pojo.Film;
/**
 * ?�影信�??��?访�??��?
 */
public interface FilmMapper {
	
	/**
	 * ???�??询�????�?	 * @return
	 */
	public List<Film> getAllFilm();
	
	/**
	 * ???�??�???��??�影
	 * @return
	 */
	public Film getFilmById(int id);
	
	/**
	 * ???�??询并???
	 * @param params
	 * @return
	 */
	public List<Film> getAllFilmOrder(Map<String, Object> params);
	
	/**
	 * ???�?��??��??	 * @param film
	 */
	public void insertFilm(Film film);
	
	/**
	 * ???�?��?�影??	 * @param film
	 */
	public void updateFilm(Film film);
	
	/**
	 * ???�???�影??	 * @param id
	 */
	public void deleteFilm(int id);
	
}
