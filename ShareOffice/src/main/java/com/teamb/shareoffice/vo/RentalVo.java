package com.teamb.shareoffice.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RentalVo {
	
	private int rental_no;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date rental_date;
	private int rental_price;


}
