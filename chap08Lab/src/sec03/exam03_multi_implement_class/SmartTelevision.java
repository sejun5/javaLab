package sec03.exam03_multi_implement_class;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}


	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}


	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println("검색 기능입니다.");
	}


	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

}
