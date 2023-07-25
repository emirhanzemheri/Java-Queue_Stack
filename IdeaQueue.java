

// Ozellestirilmis Kuyruk Sinifi
// BU SINIFI DEGISTIRMEYINIZ

public class IdeaQueue {

    // Kuyruğun alabileceği eleman sayısının üst sınırı
    public final int MAX_SIZE = 100;
    // ön ve arka eleman göstergeleri ile eleman sayısı
    private int front, rear, size;
    // kuyruğun elemanlarını tutan dizi
    private int[] elements;

    // Kuyruk yaratıcı işlev.
    public IdeaQueue() {
      front = 0;
      rear = MAX_SIZE-1;
      size = 0;
      elements = new int[MAX_SIZE]; // diziyi yarat
    }

    // full() işlevi, kuyruk dolu ise true, değilse false döner.
    public boolean full() {
      return (size == MAX_SIZE);
    }

    // empty() işlevi, kuyruk boş ise true, değilse false döner.
    public boolean empty() {
      return (size == 0);
    }

    // insert(x) işlevi, kuyruk dolu ise hata verir, değilse verilen x değerini kuyruğun sonuna ekler.
    public void insert(int x) {
      if (full()) throw new RuntimeException("Hata: Kuyruk dolu"); // kuyruk doluysa hata ver
      rear = (rear+1) % MAX_SIZE; // son tarafı (dairesel olarak) ilerlet
      size++;                     // eleman sayısını artır
      elements[rear] = x;         // kuyruğun sonuna x'i ekle
      System.out.println(x + " kuyruga eklendi.");
    }

    // delete() işlevi, kuyruk boş ise hata verir, değilse kuyruğun öndeki elemanını alıp döndürür.
    public int delete() {
      if (empty()) throw new RuntimeException("Hata: Kuyruk bos"); // kuyruk boşsa hata ver
      int temp = elements[front];   // öndeki elemanı al
      elements[front]=0;
      front = (front+1) % MAX_SIZE; // baş tarafı (dairesel olarak) ilerlet
      size--;                       // eleman sayısını azalt
      System.out.println(temp + " kuyruktan silindi.");
      return temp;                  // daha önce başta olan elemanı döndür
    }

    public int getInFront(){
      if (empty()) throw new RuntimeException("Hata: Kuyruk bos");
      return elements[front];
    }

    public void showContent()
    {
    	if (empty())
    	{
    		System.out.println("Kuyruk icerigi bos");
    		return;
    	}
      System.out.println("\n******Kuyruk icerigi*****************");
      int curr = front;
      while(curr != rear)
      {
    	  System.out.print(elements[curr] + " ");
    	  curr = (curr + 1) % MAX_SIZE;
      }
      System.out.println(elements[curr]);
      System.out.println("************************************");
    }
}
