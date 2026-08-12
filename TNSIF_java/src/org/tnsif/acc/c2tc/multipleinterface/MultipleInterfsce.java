package org.tnsif.acc.c2tc.multipleinterface;
	class SmartPhone implements camera,MusicPlayer{

		@Override
		public void playMusic() {
			System.out.println("play a music");
			
		}

		@Override
		public void takePhoto() {
			System.out.println("take a photo");
		}
		
	}

public class MultipleInterfsce {
	

	public static void main(String[] args) {
		SmartPhone Phone=new SmartPhone();
		Phone. playMusic();
		Phone.takePhoto();
		

	}

}
