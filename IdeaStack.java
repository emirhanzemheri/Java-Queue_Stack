
// Ozellestirilmis Yigit Sinifi
// BU SINIFI DEGISTIRMEYINIZ

public class IdeaStack {

  // Yığıtın alabileceği eleman sayısının üst sınırı.
  public final int MAX_SIZE = 100;
  private int top;
  private int[] elements;

  // Yığıt yaratıcı işlev.
  public IdeaStack() {
	    top = -1;
	    elements = new int[MAX_SIZE]; // diziyi yarat
  }

  // full() işlevi, yığıt dolu ise true, değilse false döner.
  public boolean full() {
    return (top == MAX_SIZE-1);
  }

  // empty() işlevi, yığıt boş ise true, değilse false döner.
  public boolean empty() {
    return (top == -1);
  }

  // push(x) işlevi, yığıt dolu ise hata verir, değilse verilen x değerini yığıta ekler.
  public void push(int x) {
    if (full()) throw new RuntimeException("Hata: Yigit dolu"); // yığıt doluysa hata ver
    ++top; // eleman sayısını artır
    elements[top] = x; // yığıtın üzerine x'i ekle
    System.out.println(x + " yigita eklendi.");
  }

  // pop() işlevi, yığıt boş ise hata verir, değilse yığıtın en üst elemanını alıp döndürür.
  public int pop() {
    if (empty()) throw new RuntimeException("Hata: Yigit bos"); // yığıt boşsa hata ver
    int temp = elements[top]; // üstteki elemanı al
    elements[top]=0;
    top--; // eleman sayısını azalt
    System.out.println(temp + " yigittan silindi.");
    return temp; // daha önce üstte olan elemanı döndür
  }
  
  public void showContent()
  {
  	if (empty())
  	{
  		System.out.println("Yigit icerigi bos");
  		return;
  	}
    System.out.println("\n******Yigit icerigi*****************");
    for(int curr = top; curr >= 0; curr--)
    	System.out.print(elements[curr] + " ");
  	System.out.println();
    
    System.out.println("************************************");
  }
  
  

}
