package com.vancl.mkt.model.product;

/**
 * 具体到尺码的,最终可销售的商品
 * @author fenglvming
 *
 */
public class ProductClothes {

	private int productClothesCode;
	
	private int productCode;
	
	private int productSerialCode;
	
	private int productCategoryCode;
	
	private int productBrandId;
	
	private String color;
	
	private String size;
	
	private boolean isValid;
	
	//商品对应的真正的出货方的编码
	private String sellerCode;
}
