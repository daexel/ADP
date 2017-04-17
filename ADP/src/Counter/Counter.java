package Counter;

public class Counter {
	private long opCount = 0;

	public long getOpCount() {
		return opCount;
	}

	public  void count() {
		opCount++;
	}

	public void reset() {
		opCount = 0;
	}
}
