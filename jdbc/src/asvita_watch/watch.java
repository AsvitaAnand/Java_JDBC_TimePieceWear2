package asvita_watch;

import java.util.*;

public class watch {

	  private String id;

	  private String name;

	  private int cost;

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getCost() {

		return cost;

	}

	public void setCost(int cost) {

		this.cost = cost;

	}

	@Override

	public String toString() {

		return "watch [id=" + id + ", name=" + name + ", cost=" + cost + "]";

	}

	public watch(String id, String name, int cost) {

		super();

		this.id = id;

		this.name = name;

		this.cost = cost;

	}

    public watch() {

    	

    }

}