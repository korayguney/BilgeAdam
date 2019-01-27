package com.bilgeadam.oopchallenge3;

public enum GearType {

	AUTOMATIC {
		@Override
		public double consumeRatePerMile(EngineType engineType) {
			if(engineType == EngineType.DIESEL) {
				return 0.5;
			} else if (engineType == EngineType.ELECTRIC) {
				return 0.0;
			} else if(engineType == EngineType.GASOLINE) {
				return 0.9;
			} else if(engineType == EngineType.HYBRID) {
				return 0.3;
			}
			return 0.0;
		}
	},
	MANUAL {
		@Override
		public double consumeRatePerMile(EngineType engineType) {
			switch (engineType) {
			case DIESEL:
				return 0.4;
			case ELECTRIC:
				return 0.0;
			case GASOLINE:
				return 0.7;
			case HYBRID:
				return 0.2;
			default:
				return 0.0;
			}
		}
	};
	
	public abstract double consumeRatePerMile(EngineType engineType);
}
