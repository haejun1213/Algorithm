package queue;

public class IntQueue {

	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	// 필드변수에서 초기화하거나

	public IntQueue(int capacity) {
		queue = new int[capacity];
		front = rear = size = 0;
		// 생성자에서 초기화
		this.capacity = capacity;
	}

	public boolean enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue가 전부 채워져있습니다.");
			return false;
		}
		queue[rear++] = data;
		if (isSameCapacity(rear))
			rear = 0;
		size++;
		return true;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue가 비어있습니다.");
			return -1;
		}
		int result = queue[front++];
		if (isSameCapacity(front))
			front = 0;
		size--;
		System.out.printf("디큐한 데이터는 %d입니다\n", queue[rear]);
		return result;
		}
	

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public boolean isSameCapacity(int type) {
		return type == capacity;
	}

	public int getFront() {
		if (isEmpty())
			return -1;
		return queue[front];
	}

	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void clear() {
		size = front = rear = 0;
	}
	
	public void peek() {
		if (isEmpty()) {
			System.out.println("Queue가 비어있습니다.");
		} else
		System.out.printf("피크한 데이터는 %d입니다.\n", queue[rear - 1]);
	}

	public void dump() {
		if (isEmpty()) {
			System.out.println("Queue가 비어있습니다.");
		}
		// front < rear
		else if (front < rear) {
			for (int i = front; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		} else {
			// front >= rear
			/* case1 */ for (int i = 0; i < size; i++) {
				System.out.print(queue[(i + front) % capacity] + " ");
			}
			/*
			for (int i = front; i < capacity; i++) {
				System.out.print(queue[i] + " ");
			}
			for (int i = 0; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			 */
			 
			System.out.println();
			
		}
	}

}
