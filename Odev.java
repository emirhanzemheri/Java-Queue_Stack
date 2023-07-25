


public class Odev 
{
	
	public static void TersCevir(IdeaStack s)
	{
		
		IdeaQueue q = new IdeaQueue();
		while(!s.empty()){
			q.insert(s.pop());
		}
		while(!q.empty()){
			s.push(q.getInFront());
			q.delete();
			
		}
	}
	
	
	public static int YigitOrtaEleman(IdeaStack s)
	{

		IdeaStack gecicistack= new IdeaStack();
		int size=0;
   		 while (!s.empty()) {
     	 gecicistack.push(s.pop());
    	  size++;
    	}
		int orta=(int) size/2;
		int count=0;
		int ortaeleman=0;
		while (!gecicistack.empty()) {
			int element = gecicistack.pop();
			count++;
			if (((size%2==0)&&(count == orta))||((size%2==1)&&(count == orta+1))) {     
			  ortaeleman = element;
			}
			s.push(element);
		  }
		return ortaeleman;
	}
	
	
	public static int KuyrukOrtaEleman(IdeaQueue q)
	{
		// burada kuyrugun orta elemanını döneceksiniz
		// fonksiyon bittiğinde kuyrugun icerigi aynı kalmalıdır
		IdeaQueue gecicique= new IdeaQueue();
		int size=0;
		while (!q.empty()) {
			gecicique.insert(q.delete());
			size++;
		  }
		  int orta=(int) size/2;
		  int count=0;
		  int ortaeleman=0;
		  while (!gecicique.empty()) {
			  int element = gecicique.delete();
			  count++;
			  if (((size%2==0)&&(count == orta))||((size%2==1)&&(count == orta+1))) {     
				ortaeleman = element;
			  }
			  q.insert(element);
			}
		  return ortaeleman;
				
	}
		
	public static void KuyrukAyikla(IdeaQueue q, int x)
	{
		
		IdeaQueue gecicique1= new IdeaQueue();
		 
		while (!q.empty()) {
			int eleman=q.delete();
			gecicique1.insert(eleman);
		  }
		while (!gecicique1.empty()) {
			int eleman = gecicique1.delete();
			if (eleman > x) {
			  
			} else {
			  q.insert(eleman);
			}
		  }

	}
	
	public static void main(String[] args)
	{
		
		// burası örnek olsun diye verilmiştir
		// siz ödevi yaparken istediğiniz gibi doldurabilirsiniz
		// ödev test edilirken kendi "main" içeriğimiz ile test edilecek.
		// IdeaQueue q = new IdeaQueue();
		
		// q.insert(2);
		
		// q.insert(3);
		// q.insert(10);
		// q.insert(4);
		
		// q.insert(5);
		// KuyrukAyikla(q, 4);
		// q.showContent();
		// q.delete();
		
		// q.delete();
		
		// q.delete();
		
		// q.delete();
		// q.showContent();
		
		
		IdeaStack s = new IdeaStack();
		//s.showContent();
		s.push(2);
		
		s.push(3);
		s.push(10);
		s.push(17);
		
		s.push(4);
		
		s.push(5);
		s.showContent();
		TersCevir(s);
		s.showContent();
		System.out.println(YigitOrtaEleman(s));
		 
		// s.showContent();
		//s.pop();
		
		//s.pop();
		
		//s.pop();
		
		//s.pop();
		//s.showContent();
		
		
	}

}
