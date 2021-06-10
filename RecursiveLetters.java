/* Recursive Letters by viadukt
 * 10 - 21 May 2021
 * Use at your own risk!
*/

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;

public class  RecursiveLetters extends Letters {
	
	public static double size = 1.00;
	
	public static void drawLetters(String input) {
		
		// First char in first thread		
		if(input.length() > 0) { 
			final char first = input.charAt(0);
			Thread thread1 = new Thread() {
				public void run() {
					switch(first) { // Position 1
						case 'a' : drawA (4, size/10, 0.05*size, 0.95-(size/20)); break;	
						case 'c' : drawC (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'd' : drawD (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.05*size, 0.95-(size/20)); break;	
						case 'g' : drawG (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.05*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.05*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.05*size, 0.95-(size/20)); break;

					}
					
				}
			};
			thread1.start();
		} else {
			System.out.println("Bitte ein Wort mit maximal vier Zeichen eingeben.");
		}
		
		// Second char in second thread
		if(input.length() > 1) { 
			final char second = input.charAt(1);
			Thread thread2 = new Thread() {
				public void run() {
					switch(second) { // Position 2
						case 'a' : drawA (4, size/10, 0.22*size, 0.95-(size/20)); break;	
						case 'e' : drawE (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.22*size, 0.95-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.22*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 0.22*size, 0.95-(size/20)); break;	
						
						case 'b' : drawB (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.22*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.22*size, 0.95-(size/20)); break;
					}
				}
			};
			thread2.start();
		}
	
		// Third char in third thread
		if(input.length() > 2) { 
			final char third = input.charAt(2);
			Thread thread3 = new Thread() {
				public void run() {
					switch(third) { // Position 3
						case 'a' : drawA (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.39*size, 0.95-(size/20)); break; 
						case 'g' : drawG (4, size/10, 0.39*size, 0.95-(size/20)); break; 
						case 'h' : drawH (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.39*size, 0.95-(size/20)); break;

						case 'd' : drawD (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.39*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 0.39*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.39*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.39*size, 0.95-(size/20)); break;
					}
				}
			};
			thread3.start();
		}
		
		// Fourth char in fourth thread
		if(input.length() > 3) { 
			final char fourth = input.charAt(3);
			Thread thread4 = new Thread() {
				public void run() {
					switch(fourth) { // Position 4
						case 'a' : drawA (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.56*size, 0.95-(size/20)); break;
	
						case 'd' : drawD (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.56*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 0.56*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.56*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.56*size, 0.95-(size/20)); break;
					}
				}
			};
			thread4.start();
		}
		
		// Fifth char in fifth thread
		if(input.length() > 4) { 
			final char fifth = input.charAt(4);
			Thread thread5 = new Thread() {
				public void run() {
					switch(fifth) { // Position 5
						case 'a' : drawA (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.73*size, 0.95-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.73*size, 0.95-(size/20)); break;

						case 'c' : drawC (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 0.73*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.73*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.73*size, 0.95-(size/20)); break;
						
					}
				}
			};
			thread5.start();
		}
		
		// Sixth char in sixth thread
		if(input.length() > 5) { 
			final char sixth = input.charAt(5);
			Thread thread6 = new Thread() {
				public void run() {
					switch(sixth) { // Position 6
						case 'a' : drawA (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.90*size, 0.95-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.90*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 0.90*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.90*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.90*size, 0.95-(size/20)); break;
						
					}
				}
			};
			thread6.start();
		}
		
		// Seventh char in seventh thread
		if(input.length() > 6) { 
			final char seventh = input.charAt(6);
			Thread thread7 = new Thread() {
				public void run() {
					switch(seventh) { // Position 7
						case 'a' : drawA (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 1.07*size, 0.95-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 1.07*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 1.07*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 1.07*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 1.07*size, 0.95-(size/20)); break;
					}
				}
			};
			thread7.start();
		}
		
		// Eight char in eight thread
		if(input.length() > 7) { 
			final char eight = input.charAt(7);
			Thread thread8 = new Thread() {
				public void run() {
					switch(eight) { // Position 8
						case 'a' : drawA (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 1.24*size, 0.95-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 1.24*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 1.24*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 1.24*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 1.24*size, 0.95-(size/20)); break;
						
					}
				}
			};
			thread8.start();
		}
		
		// Ninth char in ninth thread
		if(input.length() > 8) { 
			final char ninth = input.charAt(8);
			Thread thread9 = new Thread() {
				public void run() {
					switch(ninth) { // Position 9
						case 'a' : drawA (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'e' : drawE (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'g' : drawG (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'h' : drawH (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'p' : drawP (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'x' : drawX (4, size/10, 1.41*size, 0.95-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'i' : drawI (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'k' : drawK (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 't' : drawT (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'u' : drawU (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'v' : drawV (4, size/10, 1.41*size, 0.95-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'l' : drawL (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'r' : drawR (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 's' : drawS (4, size/10, 1.41*size, 0.95-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'f' : drawF (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'j' : drawJ (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'm' : drawM (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'n' : drawN (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'o' : drawO (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'q' : drawQ (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'w' : drawW (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'y' : drawY (4, size/10, 1.41*size, 0.95-(size/20)); break;
						case 'z' : drawZ (4, size/10, 1.41*size, 0.95-(size/20)); break;
					}
				}
			};
			thread9.start();
		}
		
		// Tenth char in tenth thread
		if(input.length() > 9) { 
			final char tenth = input.charAt(9);
			Thread thread10 = new Thread() {
				public void run() {
					switch(tenth) { // Position 10
						case 'a' : drawA (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.05*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.05*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 0.05*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.05*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.05*size, 0.50-(size/20)); break;
					}
				}
			};
			thread10.start();
		}
		
		// Eleventh char in eleventh thread
		if(input.length() > 10) { 
			final char eleventh = input.charAt(10);
			Thread thread11 = new Thread() {
				public void run() {
					switch(eleventh) { // Position 11
						case 'a' : drawA (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.22*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.22*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 0.22*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.22*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.22*size, 0.50-(size/20)); break;
					}
				}
			};
			thread11.start();
		}
		
		// Twelfth char in twelfth thread
		if(input.length() > 11) { 
			final char twelfth = input.charAt(11);
			Thread thread12 = new Thread() {
				public void run() {
					switch(twelfth) { // Position 12
						case 'a' : drawA (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.39*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.39*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 0.39*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.39*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.39*size, 0.50-(size/20)); break;
					}
				}
			};
			thread12.start();
		}
		
		// Thirteenth char in thirteenth thread
		if(input.length() > 12) { 
			final char thirteenth = input.charAt(12);
			Thread thread13 = new Thread() {
				public void run() {
					switch(thirteenth) { // Position 13
						case 'a' : drawA (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.56*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.56*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 0.56*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.56*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.56*size, 0.50-(size/20)); break;
					}
				}
			};
			thread13.start();
		}
		
		// Fourteenth char in fourteenth thread
		if(input.length() > 13) { 
			final char fourteenth = input.charAt(13);
			Thread thread14 = new Thread() {
				public void run() {
					switch(fourteenth) { // Position 14
						case 'a' : drawA (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.73*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.73*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 0.73*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.73*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.73*size, 0.50-(size/20)); break;
					}
				}
			};
			thread14.start();
		}
		
		// Fifteenth char in fifteenth thread
		if(input.length() > 14) { 
			final char fifteenth = input.charAt(14);
			Thread thread15 = new Thread() {
				public void run() {
					switch(fifteenth) { // Position 15
						case 'a' : drawA (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 0.90*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 0.90*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 0.90*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 0.90*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 0.90*size, 0.50-(size/20)); break;
					}
				}
			};
			thread15.start();
		}
		
		// Sixteenth char in sixteenth thread
		if(input.length() > 15) { 
			final char sixteenth = input.charAt(15);
			Thread thread16 = new Thread() {
				public void run() {
					switch(sixteenth) { // Position 16
						case 'a' : drawA (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 1.07*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 1.07*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 1.07*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 1.07*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 1.07*size, 0.50-(size/20)); break;
					}
				}
			};
			thread16.start();
		}
		
		// Seventeenth char in seventeenth thread - this is crazy!
		if(input.length() > 16) { 
			final char seventeenth = input.charAt(16);
			Thread thread17 = new Thread() {
				public void run() {
					switch(seventeenth) { // Position 17
						case 'a' : drawA (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 1.24*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 1.24*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 1.24*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 1.24*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 1.24*size, 0.50-(size/20)); break;
					}
				}
			};
			thread17.start();
		}
		
		// Eighteenth char in eighteenth thread
		if(input.length() > 17) { 
			final char eighteenth = input.charAt(17);
			Thread thread18 = new Thread() {
				public void run() {
					switch(eighteenth) { // Position 18
						case 'a' : drawA (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'e' : drawE (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'g' : drawG (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'h' : drawH (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'p' : drawP (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'x' : drawX (4, size/10, 1.41*size, 0.50-(size/20)); break;
						
						case 'd' : drawD (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'i' : drawI (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'k' : drawK (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 't' : drawT (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'u' : drawU (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'v' : drawV (4, size/10, 1.41*size, 0.50-(size/20)); break;
						
						case 'c' : drawC (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'l' : drawL (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'r' : drawR (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 's' : drawS (4, size/10, 1.41*size, 0.50-(size/20)); break;
						
						case 'b' : drawB (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'f' : drawF (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'j' : drawJ (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'm' : drawM (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'n' : drawN (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'o' : drawO (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'q' : drawQ (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'w' : drawW (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'y' : drawY (4, size/10, 1.41*size, 0.50-(size/20)); break;
						case 'z' : drawZ (4, size/10, 1.41*size, 0.50-(size/20)); break;
					}
				}
			};
			thread18.start();
		}
			
	}
	
	public static void drawGui() {
		// Set-up GUI
		JFrame frame = new JFrame("Recursive Letters");
		frame.setResizable(false);
		
		// Background
		URL url = RecursiveLetters.class.getResource("/Background.PNG");

		JLabel label = new JLabel(new ImageIcon(url));
		label.setPreferredSize(new Dimension(749, 500));
		frame.getContentPane().add(label, BorderLayout.CENTER);

		// Font
		Font font = new Font("Consolas", Font.PLAIN, 20);
		
		// Text field Letters
		JTextArea textTextField = new JTextArea("Eingabe:");  
		textTextField.setBounds(104, 456, 85, 100);
		textTextField.setFont(font);
		label.add(textTextField);
				
		JTextField inputLetters = new JTextField();
		inputLetters.setBounds(200, 450, 250, 35);
		inputLetters.setFont(font);
		label.add(inputLetters);
				
		// Slider Zoom
		JTextArea textZoom = new JTextArea("Zoom-Faktor:");  
		textZoom.setBounds(60, 390, 130, 50);
		textZoom.setFont(font);
		label.add(textZoom);
		
		final int min = 1;
		final int max = 15;
		final int initial = 1;
		
		JSlider inputZoom = new JSlider(JSlider.HORIZONTAL, min, max, initial);
		inputZoom.addChangeListener(null);
		inputZoom.setMajorTickSpacing(1);
		inputZoom.setPaintTicks(true);
		inputZoom.setPaintLabels(true);
		inputZoom.setBounds(200, 380, 400, 50);
		label.add(inputZoom);
				
		// Points-counter
		JTextArea counter = new JTextArea("Punktzahl: " + String.valueOf(k));  
		counter.setBounds(460, 456, 200, 50);
		counter.setFont(font);
		label.add(counter);
		
		// Timer
		Action actionTimer = new AbstractAction() {

			private static final long serialVersionUID = 1L;

			public void actionPerformed(ActionEvent e) {
				
				Timer timer = new Timer(10, new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						counter.setText("Punktzahl: " + String.valueOf(k));
						
					}
				});
				timer.start();
			}
		};
				
		// Action: Letters
		Action actionLetters = new AbstractAction() {

			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
								
				// Get text and draw letters
				String inputL = inputLetters.getText();
				size = inputZoom.getValue();
								
				drawLetters(inputL.toLowerCase());
			}

		};
		inputLetters.addActionListener(actionTimer);
		inputLetters.addActionListener(actionLetters);
		
		// by viadukt
		JTextArea viadukt = new JTextArea("by viadukt");  
		viadukt.setBounds(670, 480, 70, 25);
		viadukt.setFont(new Font("Consolas", Font.PLAIN, 12));
		label.add(viadukt);
		
		// version
		JTextArea version = new JTextArea("v.1.0");  
		version.setBounds(685, 455, 60, 25);
		version.setFont(font);
		label.add(version);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		// draw GUI
		drawGui();

		// Infobox
		// + Glückskeks oder Horoskop-Funktion je nach erreicherter Punktzahl


	}
	
}
