public int divide(int dividend, int divisor) {
		
		long a = Math.abs((long) dividend);
		long b = Math.abs((long) divisor);
		long result = 0;

		while (a >= b) {
			if (a - b < b) {
				result++;
				a = a - b;
			} else {
				long p = 1, q = b;
				while (a > (q << 1)) {
					q = q << 1;
					p = p << 1;
				}
				result += p;
				a -= q;
			}

		}
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
			return (int) (-result);
		if(result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
		return (int) result;
	}
