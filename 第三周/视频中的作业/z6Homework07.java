public class z6Homework07{
	public static void main(String[] args){
		Music m = new Music("�������",3);
		m.play();
		String str = m.getInfo();
		System.out.println(str);

		
	}
}
class Music{
	String name;
	double times;
	public Music(String name,double times){
		this.name = name;
		this.times = times;
	}
	public void play(){
		System.out.println("��������" + this.name);
	}
	public String getInfo(){
		return "��������Ϊ��" + this.name + ",����ʱ��Ϊ��" + this.times + "����";
	}
}