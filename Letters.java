/* Recursive Letters by viadukt
 * 10 - 21 May 2021
 * Use at your own risk!
*/

public class Letters {
	
	// letter counter 
	static int k = 0;
	
	// draw letters	
	public static void drawA (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y0, x, y1); // links unten nach mitte oben
		StdDraw.line(x, y1, x1, y0); // mitte oben nach rechts unten
		StdDraw.line(x0, y, x1, y); // links mitte nach rechts mitte
		
		drawA(n-1, sz/4, x0, y0); // links unten
		drawA(n-1, sz/4, x, y1); // mitte oben
		drawA(n-1, sz/4, x1, y0); // rechts unten
		drawA(n-1, sz/4, x, y); // mitte mitte
		
		k++;
		System.out.println(k);
	}
	
	public static void drawB (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x1, y, x0, y);
		StdDraw.line(x1, y, x1, y0);
		StdDraw.line(x1, y0, x0, y0);
						
		drawB(n-1, sz/4, x0, y1); 
		drawB(n-1, sz/4, x0, y); 
		drawB(n-1, sz/4, x0, y0);
		drawB(n-1, sz/4, x, y0);
		drawB(n-1, sz/4, x1, y0);
		drawB(n-1, sz/4, x1, y);
		drawB(n-1, sz/4, x, y);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawC (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x1, y1, x, y1);
		StdDraw.line(x, y1, x0, y);
		StdDraw.line(x0, y, x, y0);
		StdDraw.line(x, y0, x1, y0);
						
		drawC(n-1, sz/4, x1, y1); 
		drawC(n-1, sz/4, x, y1); 
		drawC(n-1, sz/4, x0, y); 
		drawC(n-1, sz/4, x, y0); 
		drawC(n-1, sz/4, x1, y0); 
				
		k++;
		System.out.println(k);
	}
	
	public static void drawD (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x0, y1, x, y1);
		StdDraw.line(x, y1, x1, y);
		StdDraw.line(x1, y, x, y0);
		StdDraw.line(x, y0, x0, y0);
						
		drawD(n-1, sz/4, x0, y1); 
		drawD(n-1, sz/4, x0, y);  
		drawD(n-1, sz/4, x0, y0);
		drawD(n-1, sz/4, x, y1); 
		drawD(n-1, sz/4, x1, y); 
		drawD(n-1, sz/4, x, y0); 
		drawD(n-1, sz/4, x0, y0); 
		
		k++;
		System.out.println(k);
	}
	
	public static void drawE (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x0, y0, x1, y0); 
		StdDraw.line(x0, y1, x1, y1); 
		StdDraw.line(x0, y, x1, y); 
				
		drawE(n-1, sz/4, x0, y1); 
		drawE(n-1, sz/4, x0, y);  
		drawE(n-1, sz/4, x0, y0); 
		drawE(n-1, sz/4, x, y0); 
		drawE(n-1, sz/4, x1, y0); 
		drawE(n-1, sz/4, x, y1); 
		drawE(n-1, sz/4, x1, y1); 
		drawE(n-1, sz/4, x, y);  
		
		k++;
		System.out.println(k);
	}
	
	public static void drawF (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x0, y1, x1, y1); 
		StdDraw.line(x0, y, x1, y); 
				
		drawF(n-1, sz/4, x0, y1); 
		drawF(n-1, sz/4, x0, y);  
		drawF(n-1, sz/4, x0, y0); 
		drawF(n-1, sz/4, x, y1); 
		drawF(n-1, sz/4, x1, y1); 
		drawF(n-1, sz/4, x, y);  
		
		k++;
		System.out.println(k);
	}
	
	public static void drawG (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x1, y1, x0, y1); 
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x0, y0, x1, y0); 
		StdDraw.line(x1, y0, x1, y); 
		StdDraw.line(x1, y, x, y); 

		drawG(n-1, sz/4, x1, y1); 
		drawG(n-1, sz/4, x, y1); 
		drawG(n-1, sz/4, x0, y1); 
		drawG(n-1, sz/4, x0, y); 
		drawG(n-1, sz/4, x0, y0); 
		drawG(n-1, sz/4, x, y0); 
		drawG(n-1, sz/4, x1, y0); 
		drawG(n-1, sz/6, x1, y); 
		drawG(n-1, sz/6, x, y);  
		
		k++;
		System.out.println(k);
		
	}
	
	public static void drawH (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y, x1, y); 
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x1, y1, x1, y0); 
		
		// links von oben nach unten
		drawH(n-1, sz/4, x0, y1);
		drawH(n-1, sz/4, x0, y);
		drawH(n-1, sz/4, x0, y0);
		
		// rechts von oben nach unten
		drawH(n-1, sz/4, x1, y1);
		drawH(n-1, sz/4, x1, y);
		drawH(n-1, sz/4, x1, y0);
		
		// Mitte
		drawH(n-1, sz/4, x, y);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawJ (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2; /*, x1 = x + sz/2;*/
		double y0 = y - sz/2, y1 = y + sz/2;
						
		StdDraw.line(x, y1, x, y);
		StdDraw.line(x, y, x0, y0);
		
		drawJ(n-1, sz/4, x, y1);
		drawJ(n-1, sz/4, x, y);
		drawJ(n-1, sz/4, x0, y0);
				
		k++;
		System.out.println(k);
	}
	
	public static void drawI (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
						
		StdDraw.line(x, y1, x, y0);
		StdDraw.line(x0, y1, x1, y1);
		StdDraw.line(x0, y0, x1, y0);

		drawI(n-1, sz/4, x, y1);
		drawI(n-1, sz/4, x, y);
		drawI(n-1, sz/4, x, y0);
		drawI(n-1, sz/4, x0, y1);
		drawI(n-1, sz/4, x1, y1);
		drawI(n-1, sz/4, x0, y0);
		drawI(n-1, sz/4, x1, y0);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawK (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x1, y1, x, y);
		StdDraw.line(x, y, x0, y);
		StdDraw.line(x, y, x1, y0); 
		
		drawK(n-1, sz/4, x0, y1);
		drawK(n-1, sz/4, x0, y);
		drawK(n-1, sz/4, x0, y0);
		
		drawK(n-1, sz/4, x, y);
		drawK(n-1, sz/4, x1, y1);
		drawK(n-1, sz/4, x1, y0);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawL (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x0, y0, x1, y0);
				
		drawL(n-1, sz/4, x0, y1);
		drawL(n-1, sz/4, x0, y);
		drawL(n-1, sz/4, x0, y0);
		
		drawL(n-1, sz/4, x, y0);
		drawL(n-1, sz/4, x1, y0);
				
		k++;
		System.out.println(k);
	}
	
	public static void drawM (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x0, y0, x0, y1); 
		StdDraw.line(x0, y1, x, y0); 
		StdDraw.line(x, y0, x1, y1); 
		StdDraw.line(x1, y1, x1, y0); 
				
		drawM(n-1, sz/4, x0, y0);
		drawM(n-1, sz/4, x0, y);
		drawM(n-1, sz/4, x0, y1);
		drawM(n-1, sz/4, x, y0);
		drawM(n-1, sz/4, x1, y1);
		drawM(n-1, sz/4, x1, y);
		drawM(n-1, sz/4, x1, y0);
						
		k++;
		System.out.println(k);
	}
	
	public static void drawN (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x0, y0, x0, y1); 
		StdDraw.line(x0, y1, x1, y0); 
		StdDraw.line(x1, y0, x1, y1); 
				
		drawN(n-1, sz/4, x0, y0);
		drawN(n-1, sz/4, x0, y);
		drawN(n-1, sz/4, x0, y1);
		drawN(n-1, sz/4, x, y);
		drawN(n-1, sz/4, x1, y0);
		drawN(n-1, sz/4, x1, y);
		drawN(n-1, sz/4, x1, y1);
						
		k++;
		System.out.println(k);
	}
	
	public static void drawO (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x, y1, x0, y1);
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x0, y0, x1, y0);
		StdDraw.line(x1, y0, x1, y1);
		StdDraw.line(x1, y1, x, y1);
				
		drawO(n-1, sz/4, x, y1);
		drawO(n-1, sz/4, x0, y1);
		drawO(n-1, sz/4, x0, y);
		drawO(n-1, sz/4, x0, y0);
		drawO(n-1, sz/4, x, y0);
		drawO(n-1, sz/4, x1, y0);
		drawO(n-1, sz/4, x1, y);
		drawO(n-1, sz/4, x1, y1);
		drawO(n-1, sz/4, x, y1);
						
		k++;
		System.out.println(k);
	}
	
	public static void drawP (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x0, y1, x1, y1); 
		StdDraw.line(x1, y1, x1, y); 
		StdDraw.line(x1, y, x0, y); 
				
		drawP(n-1, sz/4, x0, y1);
		drawP(n-1, sz/4, x0, y);
		drawP(n-1, sz/4, x0, y0);

		drawP(n-1, sz/4, x, y1);
		drawP(n-1, sz/4, x1, y1);

		drawP(n-1, sz/4, x1, y);

		drawP(n-1, sz/4, x, y);
		
		k++;
		System.out.println(k);
	}
	
public static void drawR (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x0, y1, x1, y1); 
		StdDraw.line(x1, y1, x1, y); 
		StdDraw.line(x1, y, x0, y); 
		StdDraw.line(x, y, x1, y0); 

		drawR(n-1, sz/4, x0, y1);
		drawR(n-1, sz/4, x0, y);
		drawR(n-1, sz/4, x0, y0);
		
		drawR(n-1, sz/4, x, y1);
		drawR(n-1, sz/4, x1, y1);

		drawR(n-1, sz/6, x1, y);

		drawR(n-1, sz/4, x, y);
		
		drawR(n-1, sz/4, x1, y0);
		
		k++;
		System.out.println(k);
	}
		
	public static void drawQ (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x, y1, x0, y1);
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x0, y0, x1, y0);
		StdDraw.line(x1, y0, x1, y1);
		StdDraw.line(x1, y1, x, y1);
		StdDraw.line(x, y, x1, y0);
				
		drawQ(n-1, sz/4, x, y1);
		drawQ(n-1, sz/4, x0, y1);
		drawQ(n-1, sz/4, x0, y);
		//drawQ(n-1, sz/4, x0, y0);
		drawQ(n-1, sz/4, x, y0);
		drawQ(n-1, sz/4, x1, y0);
		drawQ(n-1, sz/4, x1, y);
		//drawQ(n-1, sz/4, x1, y1);
		drawQ(n-1, sz/4, x, y1);
		drawQ(n-1, sz/4, x, y);
						
		k++;
		System.out.println(k);
	}
	
	public static void drawS (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x1, y1, x0, y1); 
		StdDraw.line(x0, y1, x0, y);
		StdDraw.line(x0, y, x1, y);
		StdDraw.line(x1, y, x1, y0);
		StdDraw.line(x1, y0, x0, y0);
						
		drawS(n-1, sz/4, x1, y1);
		drawS(n-1, sz/4, x, y1);
		drawS(n-1, sz/4, x0, y1);
		drawS(n-1, sz/4, x0, y);
		drawS(n-1, sz/4, x, y);
		drawS(n-1, sz/4, x1, y);
		drawS(n-1, sz/4, x1, y0);
		drawS(n-1, sz/4, x, y0);
		drawS(n-1, sz/4, x0, y0);
				
		k++;
		System.out.println(k);
	}

	public static void drawT (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x, y1, x, y0); 
		StdDraw.line(x0, y1, x1, y1);  
						
		drawT(n-1, sz/4, x, y1);
		drawT(n-1, sz/4, x, y);
		drawT(n-1, sz/4, x, y0);
		drawT(n-1, sz/4, x0, y1);
		drawT(n-1, sz/4, x1, y1);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawU (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x0, y0); 
		StdDraw.line(x0, y0, x1, y0);  
		StdDraw.line(x1, y0, x1, y1); 
				
		drawU(n-1, sz/4, x0, y1); 
		drawU(n-1, sz/4, x0, y);  
		drawU(n-1, sz/4, x0, y0); 
		drawU(n-1, sz/4, x, y0); 
		drawU(n-1, sz/4, x1, y0);
		drawU(n-1, sz/4, x1, y); 
		drawU(n-1, sz/4, x1, y1);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawV (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x0, y1, x0, y);
		StdDraw.line(x0, y, x, y0);
		StdDraw.line(x, y0, x1, y);
		StdDraw.line(x1, y, x1, y1);
		
		drawV(n-1, sz/4, x0, y1); 
		drawV(n-1, sz/4, x0, y); 
		drawV(n-1, sz/4, x, y0); 
		drawV(n-1, sz/4, x1, y);
		drawV(n-1, sz/4, x1, y1);
		
		/* simpleres V
		StdDraw.line(x0, y1, x, y0); 
		StdDraw.line(x, y0, x1, y1);  
						
		drawV(n-1, sz/4, x0, y1); // links oben
		drawV(n-1, sz/4, x, y0); // mitte unten
		drawV(n-1, sz/4, x1, y1); // rechts oben
		*/
		
		k++;
		System.out.println(k);
	}
	
	public static void drawW (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
		
		StdDraw.line(x0, y1, x0, y0);
		StdDraw.line(x0, y0, x, y);
		StdDraw.line(x, y, x1, y0);
		StdDraw.line(x1, y0, x1, y1);
		
		drawW(n-1, sz/4, x0, y1); 
		drawW(n-1, sz/4, x0, y); 
		drawW(n-1, sz/4, x0, y0); 
		drawW(n-1, sz/4, x, y);
		drawW(n-1, sz/4, x1, y0);
		drawW(n-1, sz/4, x1, y);
		drawW(n-1, sz/4, x1, y1);
	
		k++;
		System.out.println(k);
	}

	public static void drawX (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x1, y0); 
		StdDraw.line(x1, y1, x0, y0); 
		
		// links von oben nach rechts unten
		drawX(n-1, sz/4, x0, y1);
		drawX(n-1, sz/4, x, y);
		drawX(n-1, sz/4, x1, y0);
		
		// rechtsoben nach links unten
		drawX(n-1, sz/4, x1, y1);
		drawX(n-1, sz/4, x0, y0);
		
		k++;
		System.out.println(k);
	}
	
	public static void drawY (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x, y);
		StdDraw.line(x, y, x, y0);
		StdDraw.line(x, y, x1, y1);
		
		drawY(n-1, sz/4, x0, y1);
		drawY(n-1, sz/4, x, y);
		drawY(n-1, sz/4, x, y0);
		drawY(n-1, sz/4, x1, y1);
				
		k++;
		System.out.println(k);
	}
	
	public static void drawZ (int n, double sz, double x, double y) { //count, size, positions
		
		if (n==0) return;
		// definition of coordinates
		double x0 = x - sz/2, x1 = x + sz/2;
		double y0 = y - sz/2, y1 = y + sz/2;
				
		StdDraw.line(x0, y1, x1, y1);
		StdDraw.line(x1, y1, x0, y0);
		StdDraw.line(x0, y0, x1, y1);
		
		drawZ(n-1, sz/4, x0, y1);
		drawZ(n-1, sz/4, x, y1);
		drawZ(n-1, sz/4, x1, y1);
		drawZ(n-1, sz/4, x, y);
		drawZ(n-1, sz/4, x0, y0);
		drawZ(n-1, sz/4, x, y0);
		drawZ(n-1, sz/4, x1, y0);
				
		k++;
		System.out.println(k);
	}
	
}
