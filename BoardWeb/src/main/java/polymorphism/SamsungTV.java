package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data
public class SamsungTV implements Tv {
	@Autowired
//	@Qualifier("apple")
	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}	
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("setPrice() 호출");
		this.price = price;
	}

//	public SamsungTV(Speaker speaker) {	// 생성자 의존 주입
//		System.out.println("===> SamsungTV(2) 객체 생성");
//		this.speaker = speaker;
//	}
//	
//
//	public SamsungTV(Speaker speaker, int price) {
//		super();
//		this.speaker = speaker;
//		this.price = price;
//	}

	
	
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격" + price + ")");
	}


	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
//		System.out.println("SamsungTV---소리 올린다.");
		
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
//		System.out.println("SamsungTV---소리 내린다.");
		
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
