import java.util.List;
import java.util.PriorityQueue;

public class KthSmallest {
	public int kthsmallest(final List<Integer> a, int k) {
		int result = -1;
		// result = findKth(a, 0, a.size() -1, k);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i <= a.size() - 1; i++) {
			pq.offer(a.get(i));
		}
		while (k > 0) {
			result = pq.poll();
			k--;
		}

		System.out.println(result);
		return result;
	}

}
