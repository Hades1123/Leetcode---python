import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> leftHalf;
    private PriorityQueue<Integer> rightHalf;

    public MedianFinder() {
        leftHalf = new PriorityQueue<>((a, b) -> b - a); // maxHeap
        rightHalf = new PriorityQueue<>(); // minHeap (default)
    }

    public void addNum(int num) {
        if (leftHalf.isEmpty() || num < leftHalf.peek()) {
            leftHalf.add(num);
        } else {
            rightHalf.add(num);
        }

        if (leftHalf.size() - rightHalf.size() > 1) {
            rightHalf.add(leftHalf.poll());
        } else if (rightHalf.size() - leftHalf.size() > 1) {
            leftHalf.add(rightHalf.poll());
        }
    }

    public double findMedian() {
        if (leftHalf.size() == rightHalf.size()) {
            return (leftHalf.peek() + rightHalf.peek()) / 2.0;
        }
        return leftHalf.size() > rightHalf.size() ? leftHalf.peek() : rightHalf.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */