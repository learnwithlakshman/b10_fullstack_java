package com.careerit.cj.day21;

import java.util.concurrent.ThreadLocalRandom;

interface MusicInstrument{
	
		public String sound();
}


class Guitar implements MusicInstrument{

	@Override
	public String sound() {
		return "TIN TIN TIN TIN TIN TIN TIN TIN TIN";
	}
	
}
class Piano implements MusicInstrument{

	@Override
	public String sound() {
		return "PEE PEEE PEE PEEE PEE PEE PEE PEE";
	}
	
}

class Flute implements MusicInstrument{
	@Override
	public String sound() {
		return "FEE FEE FEE FEE FEE FEE FEE FEE";
	}
}

public class InstrumentManager {

		public static void main(String[] args) {
			
			MusicInstrument[] arr = new MusicInstrument[10];
			for(int i=0;i<arr.length;i++) {
				int num = ThreadLocalRandom.current().nextInt(1, 4);
				if(num == 1)
					arr[i]=new Guitar();
				else if(num == 2)
					arr[i] = new Piano();
				else if (num == 3)
					arr[i] = new Flute();
			}
			
			for(MusicInstrument obj:arr) {
				System.out.println(obj.sound());
			}
		}
}
