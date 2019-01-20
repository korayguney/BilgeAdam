package com.bilgeadam.enumabstract;

public enum System {

	OUT {
		@Override
		public void print(String s) {
			java.lang.System.out.print(s);
		}

		@Override
		public void println(String s) {
			java.lang.System.out.println(s);
		}

		@Override
		public void printf(String s, Object o) {
			String[] result = null;
			try {
				result = s.split("%o");
				java.lang.System.out.println(result[0] + o + result[1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				java.lang.System.out.println(result[0] + o );
			}
		}
	},

	ERR {
		@Override
		public void print(String s) {
			java.lang.System.err.print(s);
		}

		@Override
		public void println(String s) {
			java.lang.System.err.println(s);
		}

		@Override
		public void printf(String s, Object o) {
			String[] result = null;
			try {
				result = s.split("%o");
				java.lang.System.err.println(result[0] + o + result[1]);
			} catch (ArrayIndexOutOfBoundsException e) {
				java.lang.System.err.println(result[0] + o );
			}
		}
	};

	public abstract void print(String s);

	public abstract void println(String s);

	public abstract void printf(String s, Object o);

}
