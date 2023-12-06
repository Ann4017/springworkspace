package polymorphism;

public class BeanFactory {
	
	public Object get_bean(String _bean_name) {
		
		if(_bean_name.equals("samsung")) {
			return new SamsungTV();
		} else if (_bean_name.equals("lg")) {
			return new LgTV();
		}
		
		return null;
	}
}
