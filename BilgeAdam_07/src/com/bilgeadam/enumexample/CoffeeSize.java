package com.bilgeadam.enumexample;

public enum CoffeeSize {

	SMALL(9, "Tall size") {
		@Override
		public String getIngredient() {
			return "30 gr. coffee, 10 gr.milk";
		}
	}, 
	MEDIUM(12, "Grande Size") {
		@Override
		public String getIngredient() {
			return "50 gr. coffee, 17 gr.milk";
		}
	}, 
	LARGE(15, "Vendi Size") {
		@Override
		public String getIngredient() {
			return "70 gr. coffee, 25 gr.milk";
		}
	};

	private int price;
	private String size;

	private CoffeeSize(int price, String size) {
		this.price = price;
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public String getSize() {
		return size;
	}

	public abstract String getIngredient();
	
}
