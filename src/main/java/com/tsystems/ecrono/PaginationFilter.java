package com.tsystems.ecrono;

public class PaginationFilter {

    private Integer p = 0;
    private Integer rpp = 5;

    public PaginationFilter() {
	super();
    }

    public PaginationFilter(Integer p, Integer rpp) {
	super();
	this.p = p;
	this.rpp = rpp;
    }

    public Integer getP() {
	return p;
    }

    public void setP(Integer p) {
	this.p = p;
    }

    public Integer getRpp() {
	return rpp;
    }

    public void setRpp(Integer rpp) {
	this.rpp = rpp;
    }

    @Override
    public String toString() {
	return "PaginationFilter [p=" + p + ", rpp=" + rpp + "]";
    }

}
