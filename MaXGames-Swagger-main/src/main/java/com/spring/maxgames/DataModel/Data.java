package com.spring.maxgames.DataModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String gamename;
	private int releaseyear;
	private String gamedeveloper;
	private String gametype;
	private float gameratings;
	private float gameprice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String getGamedeveloper() {
		return gamedeveloper;
	}
	public void setGamedeveloper(String gamedeveloper) {
		this.gamedeveloper = gamedeveloper;
	}
	public String getGametype() {
		return gametype;
	}
	public void setGametype(String gametype) {
		this.gametype = gametype;
	}
	public float getGameratings() {
		return gameratings;
	}
	public void setGameratings(float gameratings) {
		this.gameratings = gameratings;
	}
	public float getGameprice() {
		return gameprice;
	}
	public void setGameprice(float gameprice) {
		this.gameprice = gameprice;
	}


}
